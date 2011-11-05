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

package com.creocode.components.i18n;

import com.creocode.components.ITranslator;
import com.creocode.components.PrayerCanvas;

import java.util.Hashtable;
//#if lang='polish'
//# import com.creocode.components.i18n.pl.I18n;
//#elif lang='italian'
//# import com.creocode.components.i18n.it.I18n;
//#elif lang='german'
//# import com.creocode.components.i18n.de.I18n;
//#elif lang='french'
//# import com.creocode.components.i18n.fr.I18n;
//#elif lang='spanish'
//# import com.creocode.components.i18n.es.I18n;
//#else
import com.creocode.components.i18n.en.I18n;
//import com.creocode.components.i18n.pl.I18n;
//#endif

/**
 * 
 * @author artur
 */
public class Translator implements ITranslator {

	public static final String EXIT = "EXIT";

	public static final String HELP = "HELP";

	public static final String ITEMS = "ITEMS";

	public static final String CATEGORIES = "CATEGORIES";

	public static final String OFF = "OFF";

	public static final String ON = "ON";

	public static final String RESUME = "RESUME";

	public static final String NEW = "NEW";

	public static final String AUTHOR = "AUTHOR";

	public static final String CHOOSE_PRAYER = "CHOOSE_PRAYER";

	public static final String BACK = "BACK";

	public static final String SAVE = "SAVE";

	public static final String OPTIONS = "OPTIONS";

	public static final String FONT_SIZE_SMALL = "Font.SIZE_SMALL";

	public static final String FONT_SIZE_MEDIUM = "Font.SIZE_MEDIUM";

	public static final String FONT_SIZE_LARGE = "Font.SIZE_LARGE";

	public static final String OPTION_BACKGROUND_DARK = "OPTION_BACKGROUND_DARK";

	public static final String OPTION_BACKGROUND_BRIGHT = "OPTION_BACKGROUND_BRIGHT";

	public static final String ABOUT = "ABOUT";

	public static final String HELP_CONTENT = "HELP_CONTENT";
	Hashtable table;

	public Translator() {
		table = new Hashtable();

		table.put(PrayerCanvas.OPTION_BACKGROUND, I18n.BACKGROUND);
		table.put(PrayerCanvas.OPTION_FONT_SIZE, I18n.FONT_SIZE);
		table.put(OPTION_BACKGROUND_BRIGHT, I18n.LIGHT);
		table.put(OPTION_BACKGROUND_DARK, I18n.DARK);
		table.put(FONT_SIZE_LARGE, I18n.LARGE);
		table.put(FONT_SIZE_MEDIUM, I18n.MEDIUM);
		table.put(FONT_SIZE_SMALL, I18n.SMALL);
		table.put(OPTIONS, I18n.OPTIONS);
		table.put(SAVE, I18n.SAVE);
		table.put(BACK, I18n.BACK);
		table.put(CHOOSE_PRAYER, I18n.CHOOSE_PRAYER);
		table.put(AUTHOR, I18n.AUTHOR);
		table.put(NEW, I18n.NEW);
		table.put(RESUME, I18n.RESUME);
		table.put(ON, I18n.ON);
		table.put(OFF, I18n.OFF);
		table.put(CATEGORIES, I18n.CATEGORIES);
		table.put(ITEMS, I18n.ITEMS);
		table.put(HELP, I18n.HELP);
		table.put(EXIT, I18n.EXIT);
		table.put(ABOUT, I18n.ABOUT);
		table.put(HELP_CONTENT, I18n.HELP_CONTENT);
	}

	public String t(String key) {
		if (table.containsKey(key)) {
			return (String) table.get(key);
		}
		return key;
	}

}