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
import android.util.FloatMath;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.creocode.catalog.R;
import com.creocode.catalog.generator.content.Category;
import com.creocode.catalog.generator.content.Content;
import com.creocode.catalog.generator.content.Item;

public class ItemActivity extends Activity implements OnTouchListener {

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		if (savedInstanceState != null) {
			fontSize = savedInstanceState.getInt(FONT_SIZE, fontSize);
			textView.setTextSize(fontSize);

		}
		super.onRestoreInstanceState(savedInstanceState);

	}

	private static final String FONT_SIZE = "font_size";

	@Override
	protected void onPause() {
		AppContext context = AppContext.getInstance();
		context.savePrefs(ItemActivity.this, fontSize);
		super.onPause();
	}

	private final Content content;
	private TextView textView;
	private int touchState;
	private int fontSize;
	private int newFontSize;

	private static final int NONE = 0;
	private static final int DRAG = 1;
	private static final int ZOOM = 2;

	public ItemActivity() {
		super();
		content = AppContext.getInstance().getContent();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Bundle bundle = getIntent().getExtras();
		int selectedCategory = bundle.getInt("selectedCategory");
		int selectedItemIndex = bundle.getInt("selectedItemIndex");

		Category category = (Category) content.categories
				.elementAt(selectedCategory);

		// Integer index = (Integer) category.elementAt(selectedItemIndex);
		Item item = (Item) content.items.get(selectedItemIndex);

		String text = "";

		if (item.intro.length() > 0) {
			text += item.intro + "\n\n";
		}

		text += item.content;

		AppContext context = AppContext.getInstance();

		if (true) {
			setContentView(R.layout.item_view_scroll);
			ScrollView view = (ScrollView) findViewById(R.id.ItemScrollView);
			view.setBackgroundColor(context.getBackgroundColor());
		} else {
			setContentView(R.layout.item_view);
			LinearLayout view = (LinearLayout) findViewById(R.id.linearLayout);
			view.setBackgroundColor(context.getBackgroundColor());
		}

		textView = (TextView) findViewById(R.id.ItemTextViewContent);
		fontSize = context.getFontSize();
		if (savedInstanceState != null) {
			float savedfontSize = savedInstanceState.getFloat(FONT_SIZE);
			if (savedfontSize != 0.0f) {
				textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, savedfontSize);
			}
		} else {
			textView.setTextSize(fontSize);
		}
		textView.setTextColor(context.getTextColor());
		textView.setText(text);

		textView.setOnTouchListener(this);

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		outState.putFloat(FONT_SIZE, textView.getTextSize());
		super.onSaveInstanceState(outState);
	}

	final static float MIN_DIST = 50;
	static float eventDistance = 0;
	static float centerX = 0, centerY = 0;

	@Override
	public boolean onTouch(View v, MotionEvent event) {

		TextView view = (TextView) v;
		switch (event.getAction() & MotionEvent.ACTION_MASK) {

		case MotionEvent.ACTION_DOWN:

			// primary touch event starts: remember touch down location
			touchState = DRAG;
			centerX = event.getX(0);
			centerY = event.getY(0);

			break;
		case MotionEvent.ACTION_POINTER_1_DOWN:// MotionEvent.ACTION_POINTER_1_DOWN:
			// secondary touch event starts: remember distance and center

			eventDistance = calcDistance(event);

			if (eventDistance > MIN_DIST) {
				touchState = ZOOM;
			}
			break;

		case MotionEvent.ACTION_MOVE:
			if (touchState == DRAG) {
				// single finger drag, translate accordingly

			} else if (touchState == ZOOM) {
				// multi-finger zoom, scale accordingly around center
				float dist = calcDistance(event);
				if (dist > MIN_DIST) {
					float scale = dist / eventDistance;
					newFontSize = (int) (fontSize * scale);
					textView.setTextSize(newFontSize);
				}
			}
			// Perform the transformation
			break;

		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_POINTER_1_UP:
			touchState = NONE;
			fontSize = newFontSize;

			break;
		}
		return true;
	}

	private float calcDistance(MotionEvent event) {
		float x = event.getX(0) - event.getX(1);
		float y = event.getY(0) - event.getY(1);
		return FloatMath.sqrt(x * x + y * y);
	}

}
