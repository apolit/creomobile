/*******************************************************************************
 * Copyright 2010  Arkadiusz Macudzinski, Artur Polit
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
 *******************************************************************************/
package com.creocode.catalog.android;

import java.util.Vector;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.creocode.catalog.R;
import com.creocode.catalog.generator.content.Category;
import com.creocode.catalog.generator.content.Content;
import com.creocode.catalog.generator.content.Item;

public class CategoriesActivity extends ListActivity {

	private static final int DIALOG_FIRST_TIME = 0;

	private static final int MENU_ITEM_OPTIONS = 0;
	private static final int MENU_ITEM_WEBPAGE = 1;
	private static final int MENU_ITEM_EMAIL = 2;

	private final Content content;

	Vector subCategories;
	Vector items;

	Vector<Category> categoriesIndex;
	Vector<Item> itemsIndex;

	private final int parentCategory = -1;

	private Category displayedCategory;

	public CategoriesActivity() {
		super();
		AppContext context = AppContext.getInstance();
		content = context.getContent();
		// context.loadPrefs(this);

	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		categoriesIndex = content.categories;
		itemsIndex = content.items;

		Bundle bundle = getIntent().getExtras();

		int selectedCategory = 0;
		if (bundle != null) {
			selectedCategory = bundle.getInt("selectedCategory");
		}

		showCategory(selectedCategory);

		AppContext.getInstance().loadPrefs(this);

		Eula.show(this);
		Toast toast = Toast.makeText(getApplicationContext(), R.string.pop_up,
				Toast.LENGTH_SHORT);
		toast.setDuration(7000);
		toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
		toast.show();

		// showDialog(DIALOG_FIRST_TIME);
	}

	private void showCategory(int selectedCategory) {

		displayedCategory = categoriesIndex.elementAt(selectedCategory);

		subCategories = displayedCategory.subcategories;
		items = displayedCategory.items;

		Spanned[] sArray = new Spanned[subCategories.size() + items.size()];

		for (int i = 0; i < subCategories.size(); i++) {

			sArray[i] = Html.fromHtml(categoriesIndex
					.get((Integer) subCategories.get(i)).title);
		}
		for (int i = 0, k = subCategories.size(); i < items.size(); i++) {
			sArray[k + i] = Html
					.fromHtml(itemsIndex.get((Integer) items.get(i)).title);
		}

		ArrayAdapter<Spanned> adapter = new ArrayAdapter<Spanned>(this,
				android.R.layout.simple_list_item_1, sArray);

		setListAdapter(adapter);
		getListView().setSelection(displayedCategory.lastSelectedPosition);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent intent;
		if (position < subCategories.size()) {
			displayedCategory.lastSelectedPosition = position;
			showCategory((Integer) subCategories.get(position));
		} else {
			intent = new Intent(this, ItemActivity.class);
			intent.putExtra("selectedItemIndex",
					(Integer) items.get(position - subCategories.size()));
			startActivityForResult(intent, position);
		}

	}

	/*
	 * Add this in your Activity
	 */

	/**
	 * Add menu items
	 * 
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_ITEM_OPTIONS, Menu.NONE, R.string.options_label);
		menu.add(0, MENU_ITEM_WEBPAGE, Menu.NONE, R.string.visit_creocode);
		menu.add(0, MENU_ITEM_EMAIL, Menu.NONE, R.string.contact);
		return true;
	}

	/**
	 * Define menu action
	 * 
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case MENU_ITEM_OPTIONS:
			Intent intent = new Intent(this, OptionsActivity.class);
			startActivityForResult(intent, 0);
			break;

		case MENU_ITEM_WEBPAGE:
			Intent webpage = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.creocode.com"));
			startActivityForResult(webpage, 0);
			break;

		case MENU_ITEM_EMAIL:
			Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

			String[] recipients = new String[] { "artur@creocode.com" };

			emailIntent
					.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);

			emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
					"Feedback");

			emailIntent.setType("text/plain");

			startActivity(Intent.createChooser(emailIntent, "Send mail..."));

			break;

		default:
			// put your code here
		}
		return false;
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		Dialog dialog = null;
		switch (id) {
		case DIALOG_FIRST_TIME:
			// do the work to define the pause Dialog
			break;
		default:
			dialog = null;
		}
		return dialog;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_BACK:
			// Make new onBackPressed compatible with earlier SDK's
			if (android.os.Build.VERSION.SDK_INT < 5 // android.os.Build.VERSION_CODES.ECLAIR
					&& event.getRepeatCount() == 0) {
				onBackPressed();
				return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onBackPressed() {
		// The default implementation simply finishes the current activity, but
		// you can override this to do whatever you want.
		int parentCategory = displayedCategory.parentId;
		if (parentCategory != -1) {
			showCategory(parentCategory);
		} else {
			finish();
		}
	}
}
