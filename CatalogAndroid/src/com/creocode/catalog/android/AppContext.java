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

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;

import com.creocode.catalog.generator.content.Content;

/**
 * Application context.
 * 
 * @author Arek
 * 
 */
public class AppContext {

	public static final String PREFS_NAME = "PrayerbookPrefs";

	public static final String BACKGROUND_LIGHT_PREF = "backgroundLight";

	public static final String FONT_SIZE_PREF = "fontSize";

	public static final int FONT_SIZE_SMALL = 15;
	public static final int FONT_SIZE_MEDIUM = 18;
	public static final int FONT_SIZE_LARGE = 22;
	public static final int FONT_SIZE_DEFAULT = FONT_SIZE_MEDIUM;

	/**
	 * Content of application.
	 */
	private static Content content;

	/**
	 * Singletone instance.
	 */
	private static AppContext instance;

	private boolean backgroundLight;

	private int fontSize;

	private AppContext() {
		content = new Content();
		content.initCategories();
	}

	public static AppContext getInstance() {
		if (instance == null) {
			instance = new AppContext();
		}
		return instance;
	}

	public Content getContent() {
		return content;
	}

	// public void setBackgroundLight(boolean backgroundLight) {
	// this.backgroundLight = backgroundLight;
	// }

	public boolean isBackgroundLight() {
		return backgroundLight;
	}

	public int getBackgroundColor() {
		if (backgroundLight) {
			return Color.WHITE;
		} else {
			return Color.BLACK;
		}
	}

	public int getTextColor() {
		if (backgroundLight) {
			return Color.BLACK;
		} else {
			return Color.WHITE;
		}
	}

	public int getFontSize() {
		return fontSize;
	}

	// public void setFontSize(int size) {
	// fontSize = size;
	// }

	public void loadPrefs(Context context) {
		SharedPreferences settings = context.getSharedPreferences(
				AppContext.PREFS_NAME, 0);
		backgroundLight = settings.getBoolean(BACKGROUND_LIGHT_PREF, false);
		fontSize = settings.getInt(FONT_SIZE_PREF, FONT_SIZE_DEFAULT);
	}

	public void savePrefs(Context context, boolean backgroundLight) {
		this.backgroundLight = backgroundLight;
		Editor editor = context.getSharedPreferences(AppContext.PREFS_NAME, 0)
				.edit();
		editor.putBoolean(BACKGROUND_LIGHT_PREF, backgroundLight);
		editor.commit();
	}

	public void savePrefs(Context context, int fontSize) {
		this.fontSize = fontSize;
		Editor editor = context.getSharedPreferences(AppContext.PREFS_NAME, 0)
				.edit();
		editor.putInt(FONT_SIZE_PREF, fontSize);
		editor.commit();
	}

}
