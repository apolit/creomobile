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

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.creocode.catalog.R;

public class OptionsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.options_view);

		RadioButton radioButton;

		RadioGroup radioGroup;

		radioGroup = (RadioGroup) findViewById(R.id.OptionsRadioGroupBackground);

		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				boolean backgroundLight = false;
				switch (checkedId) {
				case R.id.OptionsRadioButtonBGDark:
					backgroundLight = false;
					break;

				case R.id.OptionsRadioButtonBGLight:
					backgroundLight = true;
					break;
				}

				AppContext context = AppContext.getInstance();
				context.savePrefs(OptionsActivity.this, backgroundLight);
			}
		});

		radioGroup = (RadioGroup) findViewById(R.id.OptionsRadioGroupFont);

		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {

				int fontSize = AppContext.FONT_SIZE_MEDIUM;
				switch (checkedId) {
				case R.id.OptionsRadioButtonFontSmall:
					fontSize = AppContext.FONT_SIZE_SMALL;
					break;
				case R.id.OptionsRadioButtonFontMedium:
					fontSize = AppContext.FONT_SIZE_MEDIUM;
					break;
				case R.id.OptionsRadioButtonFontLarge:
					fontSize = AppContext.FONT_SIZE_LARGE;
					break;
				}
				AppContext context = AppContext.getInstance();
				context.savePrefs(OptionsActivity.this, fontSize);
			}
		});

		int fontSize = AppContext.getInstance().getFontSize();
		switch (fontSize) {
		case AppContext.FONT_SIZE_SMALL:
			radioButton = (RadioButton) findViewById(R.id.OptionsRadioButtonFontSmall);

			break;
		case AppContext.FONT_SIZE_MEDIUM:
		default:
			radioButton = (RadioButton) findViewById(R.id.OptionsRadioButtonFontMedium);
			break;
		case AppContext.FONT_SIZE_LARGE:
			radioButton = (RadioButton) findViewById(R.id.OptionsRadioButtonFontLarge);
			break;
		}
		radioButton.toggle();

		if (AppContext.getInstance().isBackgroundLight()) {
			radioButton = (RadioButton) findViewById(R.id.OptionsRadioButtonBGLight);
		} else {
			radioButton = (RadioButton) findViewById(R.id.OptionsRadioButtonBGDark);
		}
		radioButton.toggle();

		// Button saveButton = (Button) findViewById(R.id.OptionsSaveButton);
		// saveButton.setOnClickListener(this);
	}

}
