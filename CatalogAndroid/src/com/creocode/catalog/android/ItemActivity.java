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
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.ScrollingMovementMethod;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.creocode.catalog.R;
import com.creocode.catalog.generator.content.Category;
import com.creocode.catalog.generator.content.Content;
import com.creocode.catalog.generator.content.Item;

public class ItemActivity extends Activity {

	private final Content content;
	private TextView textView;
	private int fontSize;

	private LinearLayout linearLayout;

	private static final int MENU_ITEM_OPTIONS = 0;
	private static final int MENU_ITEM_WEBPAGE = 1;
	private static final int MENU_ITEM_EMAIL = 2;
	private static final int MENU_ITEM_SHARE = 3;

	public ItemActivity() {
		super();
		content = AppContext.getInstance().getContent();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

		Bundle bundle = getIntent().getExtras();
		selectedCategory = bundle.getInt("selectedCategory");
		Category category = (Category) content.categories
				.elementAt(selectedCategory);
		selectedItemIndex = bundle.getInt("selectedItemIndex");
		contentItem = (Item) content.items.get(selectedItemIndex);

		String text = "";

		if (contentItem.intro.length() > 0) {
			text += contentItem.intro + "\n\n";
		}

		text += contentItem.content;

		setContentView(R.layout.item_view_scroll);

		textView = (TextView) findViewById(R.id.ItemTextViewContent);
		linearLayout = (LinearLayout) findViewById(R.id.ItemTextViewLayout);
		restoreTextView(savedInstanceState);

		textView.setText(text);
		textView.setMovementMethod(new ScrollingMovementMethod());

	}

	private void restoreTextView(Bundle savedInstanceState) {
		boolean backgroundLight = sharedPref.getBoolean(
				AppContext.BACKGROUND_LIGHT_PREF, false);
		int backgroundColor = AppContext.getBackgroundColor(backgroundLight);
		textView.setBackgroundColor(backgroundColor);
		linearLayout.setBackgroundColor(backgroundColor);

		fontSize = Integer.parseInt(sharedPref.getString(
				AppContext.TEXT_SIZE_PREF, "13"));
		textView.setTextSize(TypedValue.COMPLEX_UNIT_PT, fontSize);
		textView.setTextColor(AppContext.getTextColor(backgroundLight));
	}

	@Override
	protected void onStart() {
		super.onStart();
		restoreTextView(null);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		restoreTextView(savedInstanceState);
	}

	private int selectedCategory;
	private int selectedItemIndex;
	private Item contentItem;
	private SharedPreferences sharedPref;

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
		menu.add(0, MENU_ITEM_SHARE, Menu.NONE, R.string.share);
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
			Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
			String[] recipients = new String[] { "artur@creocode.com" };
			emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
			emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
			emailIntent.setType("text/plain");
			startActivity(Intent.createChooser(emailIntent, "Send mail..."));
			break;

		case MENU_ITEM_SHARE:
			Intent shared = new Intent(Intent.ACTION_SEND);
			shared.setType("text/plain");
			shared.putExtra(Intent.EXTRA_TEXT, contentItem.title + "\r\n"
					+ contentItem.content + getText(R.string.sharedFrom));
			startActivity(Intent.createChooser(shared, getText(R.string.share)));
		default:
			// put your code here
		}
		return false;
	}

}
