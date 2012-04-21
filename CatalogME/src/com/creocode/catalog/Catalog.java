/*******************************************************************************
 * Copyright 2010  Artur Polit
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *    
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * Contributors:
 *    Artur Polit - code base
 *******************************************************************************/

package com.creocode.catalog;

import java.util.Vector;

import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;

import com.creocode.catalog.generator.content.Category;
import com.creocode.catalog.generator.content.Content;
import com.creocode.catalog.generator.content.ContentBase;
import com.creocode.catalog.generator.content.Item;
import com.creocode.components.ITranslator;
import com.creocode.components.i18n.Translator;
import com.creocode.components.options.IConfigurable;
import com.creocode.components.options.IParent;
import com.creocode.components.options.OptionsForm;
import com.creocode.components.options.Serializator;

/**
 * @author artur
 */
public class Catalog extends MIDlet implements CommandListener, IParent {

	private static final int ROOT_FILE = 0;
	private static final int NON_ROOT_FILE = 1;
	private static final int IN_NON_ROOT_FILE = 2;
	List list;
	Display display;
	CatalogCanvas canvas;
	Command selectCommand;
	Command backCommand;
	Command backCommandCanvas;


	OptionsForm optionForm;
	Serializator serializator;

	Content content;
	Vector categoriesIndex;
	Vector itemsIndex;

	Vector subCategories;
	Vector items;

	Category displayedCategory;

	List mainMenuList;

	Form form;

	final int ID_CANVAS = 1;
	private ITranslator tr;
	private int lastSelectedCategoryIndex;

	private int level = -1;
	private Class contentClass;
	
	public Catalog() {

		tr = new Translator();
		content = new Content();
		serializator = new Serializator(1);

		initMainMenuList();
		content.initCategories();
		
		backCommand = new Command(tr.t(Translator.BACK), Command.BACK, 0);
		backCommandCanvas = new Command(tr.t(Translator.BACK), Command.BACK, 0);

		canvas = new CatalogCanvas();

		// canvas.addCommand(exitCommand);
		canvas.addCommand(backCommandCanvas);
		canvas.setCommandListener(this);

		optionForm = new OptionsForm(this, canvas, tr);

		display = Display.getDisplay(this);

		display.setCurrent(mainMenuList);
	}

	private void setRootContent() {
		categoriesIndex = content.categories;
		itemsIndex = content.items;
		
	}

	private void initMainMenuList() {
		mainMenuList = new List(content.title, List.IMPLICIT);
		mainMenuList.append(tr.t(Translator.CATEGORIES), null);
		mainMenuList.append(tr.t(Translator.OPTIONS), null);
		mainMenuList.append(tr.t(Translator.HELP), null);
		mainMenuList.append(tr.t(Translator.ABOUT), null);
		mainMenuList.append(tr.t(Translator.EXIT), null);
		mainMenuList.setCommandListener(this);

	}

	public void showCategory(int selectedCategory) {		
		if(selectedCategory == -1){
			level = ROOT_FILE;
			selectedCategory = 0;
		}		
		if(level == ROOT_FILE){
			setRootContent();
			displayedCategory = (Category) categoriesIndex.elementAt(0);
			level = NON_ROOT_FILE;
			lastSelectedCategoryIndex = 0;
		} else if (level == NON_ROOT_FILE) {
			createContentObjectAndInitCategory(selectedCategory);
			level = IN_NON_ROOT_FILE;
			lastSelectedCategoryIndex = 0;
		} else if (level == IN_NON_ROOT_FILE){
			displayedCategory = (Category) categoriesIndex.elementAt(selectedCategory);
			lastSelectedCategoryIndex = selectedCategory;
		}
		subCategories = displayedCategory.subcategories;
		items = displayedCategory.items;

		String[] sArray = new String[subCategories.size() + items.size()];
		fillCategories(sArray);
		fillItems(sArray);
		List tmpList = showList(tr.t("CATEGORIES"), sArray);
		//tmpList.setSelectedIndex(displayedCategory.lastSelectedPosition, true);

		display.setCurrent(tmpList);
	}

	private void createContentObjectAndInitCategory(int selectedCategory) {
		try {
			if(selectedCategory != 0){
				contentClass = Class.forName("com.creocode.catalog.generator.content.Content"+selectedCategory);
			}
			Object created = contentClass.newInstance();
			ContentBase content = (ContentBase) created;
			content.initCategories();
			displayedCategory = content.category;
			categoriesIndex = content.categories;
			itemsIndex = content.items;
			subCategories = displayedCategory.subcategories;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	private void fillItems(String[] sArray) {
		int index;
		for (int i = 0, k = subCategories.size(); i < items.size(); i++) {
			index = ((Integer) items.elementAt(i)).intValue();
			sArray[k + i] = ((Item) itemsIndex.elementAt(index)).title;
		}
	}

	private void fillCategories(String[] sArray) {
		int index;
		for (int i = 0; i < subCategories.size(); i++) {
			index = ((Integer) subCategories.elementAt(i)).intValue();
			sArray[i] = ((Category) categoriesIndex.elementAt(index)).title;
		}
	}

	public List showList(String title, String[] sArray) {

		// empty list for reset
		if (list == null) {
			list = new List(title, Choice.IMPLICIT, sArray, null);
			list.addCommand(backCommand);
			list.setCommandListener(this);
		} else {
			list.setTitle(title);
			int listSize = list.size();
			for (int i = 0; i < listSize; i++) {
				list.delete(0);
			}
			for (int i = 0; i < sArray.length; i++) {
				// System.out.println((String) serializator.elementAt(i));
				list.append(sArray[i], null);
			}
		}

		return list;
	}

	public void showCanvas(String name, String content, String intro,
			Vector detailsVector) throws Exception {

		serializator.deserialize(ID_CANVAS, canvas);
		display.setCurrent(canvas);
		canvas.setItem(name, content, intro, detailsVector);
		canvas.repaint();
	}

	public void commandAction(Command command, Displayable screen) {
		try {
			if (screen.equals(mainMenuList)) {
				
				int position = mainMenuList.getSelectedIndex();
				String selected = mainMenuList.getString(position);

				if (selected.equals(tr.t(Translator.CATEGORIES))) {
					level = ROOT_FILE;
					showCategory(0);
				} else if (selected.equals(tr.t(Translator.OPTIONS))) {
					optionForm.fillOptions();
					display.setCurrent(optionForm);
				} else if (selected.equals(tr.t(Translator.HELP))) {
					form = new Form(tr.t(Translator.HELP));
					form.setCommandListener(this);
					form.addCommand(backCommand);
					form.append(tr.t(Translator.HELP_CONTENT));
					display.setCurrent(form);
				} else if (selected.equals(tr.t(Translator.ABOUT))) {
					form = new Form(tr.t(Translator.ABOUT));
					form.setCommandListener(this);
					form.addCommand(backCommand);
					StringBuffer sb = new StringBuffer();
					sb.append(content.title).append(" by ").append(content.vendor).append('\n');
					sb.append("Version: ").append(content.version);
					sb.append("\nContent copyrights:").append(content.copyrights);
					sb.append("\n\nCreated using Creomobile Framework");
					form.append(sb.toString());
					
					display.setCurrent(form);
				} else if (selected.equals(tr.t(Translator.EXIT))) {
					exitMIDlet();
				}

			} else if (screen.equals(list)
					&& command.equals(List.SELECT_COMMAND)) {
				int position = list.getSelectedIndex();
				displayedCategory.lastSelectedPosition = position;

				if (position < subCategories.size()) {
					showCategory(((Integer) displayedCategory.subcategories
							.elementAt(position)).intValue());//level
				} else {
					int itemPosition = position - subCategories.size();
					int itemIndex = ((Integer) displayedCategory.items
							.elementAt(itemPosition)).intValue();
					showItem((Item) itemsIndex.elementAt(itemIndex));
				}
			} else if (command.equals(backCommand) && screen.equals(list)) {
				if (displayedCategory.parentId != -2) {					
					showCategory(displayedCategory.parentId); //level
 				} else {
					displayMain();
				}
			} else if (command.equals(backCommand) && screen.equals(form)) {
				displayMain();
			} else if (command.equals(backCommandCanvas)
					&& screen.equals(canvas)) {
				showCategory(lastSelectedCategoryIndex);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void exitMIDlet() {
		Display.getDisplay(this).setCurrent(null);
		destroyApp(true);
		notifyDestroyed();
	}

	public void startApp() {
	}

	public void pauseApp() {
	}

	public void destroyApp(boolean unconditional) {
		try {
			serializator.serialize(ID_CANVAS, canvas);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void showItem(Item item) throws Exception {

		String details = item.details;
		Vector detailsVector = new Vector();
		if (!details.equals("")) {
			details = details.substring(1, details.length() - 1);

			int first = 0;
			for (int i = 0; i < details.length(); i++) {
				if (details.charAt(i) == ',') {
					detailsVector.addElement(details.substring(first, i));
					first = i + 2;
				}
			}

			detailsVector
					.addElement(details.substring(first, details.length()));
			// for (int i = 0; i < detailsVector.size(); i++) {
			// System.out.println(detailsVector.elementAt(i));
			// }
		}
		showCanvas(item.title, item.content, item.intro, detailsVector);
	}

	public void displayMain(IConfigurable configurable) {
		if (configurable.equals(canvas)) {
			try {
				serializator.serialize(ID_CANVAS, canvas);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		displayMain();
	}

	public void displayMain() {
		display.setCurrent(mainMenuList);
	}
}