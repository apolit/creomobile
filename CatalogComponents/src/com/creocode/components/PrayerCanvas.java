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

package com.creocode.components;

import com.creocode.components.options.IConfigurable;
import com.creocode.components.options.ISerializable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 * 
 * @author Artur Polit
 */
public class PrayerCanvas extends Canvas implements IConfigurable,
		ISerializable {

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * name of prayer in the cache
	 */
	String name = "";
	/**
	 * content of prayer in the chache
	 */
	String content;
	/**
	 * [][0]-offset in content [][1]-count of printed chars from content in
	 * given line
	 */
	int[][] cache;
	/*
	 * iterator to cache array
	 */
	int cacheCnt = 0;
	/**
	 * is something cached
	 */
	boolean cached = false;
	/**
	 * variables used in line calculations
	 */
	int currentLine = 0;
	protected int firstLine = 0;
	KeyListener keyListener;
	int scrollerStep = 1;
	/**
	 * cursor position in pixels
	 */
	int y;
	public boolean dark_background = true;
	public static String OPTION_BACKGROUND = "OPTION_BACKGROUND";
	public static String OPTION_FONT_SIZE = "OPTION_FONT_SIZE";
	public static int OPTION_BACKGROUND_DARK = 0;
	public static int OPTION_BACKGROUND_BRIGHT = 1;
	private int fontSize = Font.SIZE_MEDIUM;

	public int getFontSize() {
		return fontSize;
	}

	public void setCache(String name, String content) {
		if ("".equals(name)
				&& !this.content.startsWith(content.substring(0, 30))) {
			resetCache();
			this.content = content;
			this.name = name;
		} else if (!this.name.equals(name)) {
			resetCache();
			this.content = content;
			this.name = name;
		}
	}

	public void resetCache() {
		cache = new int[500][2];
		cacheCnt = 0;
		cached = false;
	}

	public void calculateScrollerStep(Font font, Graphics g) {
		scrollerStep = g.getClipHeight() / font.getHeight();
	}

	public void keyPressed(int keyCode) {
		keyListener.keyPressed(keyCode);
	}

	public boolean onKeyDOWN() {
		if (firstLine + scrollerStep < currentLine) {
			firstLine += scrollerStep;
			return true;
		}
		return false;
	}

	public boolean onKeyUP() {
		if (firstLine > 0) {
			firstLine -= scrollerStep;
			return true;
		}
		return false;
	}

	public void resetScroll() {
		firstLine = 0;
	}

	public void setKeyListener(KeyListener keyListener) {
		this.keyListener = keyListener;
	}

	protected void paint(Graphics g) {
		resetCurrentLine();
		
		setBackgroundColor(g);

		g.fillRect(0, 0, g.getClipWidth(), g.getClipHeight());

		setForegroundColor(g);
		// content = "012345 789012345 789X12345 789012345 789";
		// this.paintCache(g, Font.getDefaultFont());
	}

	protected void resetCurrentLine() {
		currentLine = 0;
		y = 0;

	}

	protected void setBackgroundColor(Graphics g) {
		if (dark_background) {
			setBlack(g);
		} else {
			setWhite(g);
		}
	}

	protected void setWhite(Graphics g) {
		g.setColor(255, 255, 204);
	}

	protected void setBlack(Graphics g) {
		g.setColor(0, 0, 0);
	}

	protected void setForegroundColor(Graphics g) {
		if (dark_background) {
			setWhite(g);
		} else {
			setBlack(g);
		}
	}
	
	void addToCache(int begin, int end) {
		// System.out.println("cache cnt:"+cacheCnt);
		cache[cacheCnt][0] = begin;
		cache[cacheCnt][1] = end;
		cacheCnt++;
	}

	public void paintFromCache(Graphics g, Font font) {

		// first painted line
		int startLine = currentLine;
		// maximal line number
		int maxLine = cacheCnt + startLine;
		// the last line which will be printed
		int lastLineOnScreen = firstLine + scrollerStep;
		// counter for lines printed from cache
		int currentCachedLine;

		g.setFont(font);
		/*
		 * for (currentCachedLine=startLine; currentCachedLine <
		 * lastLineOnScreen; currentCachedLine++) { g.drawSubstring(content,
		 * cache[currentCachedLine][0], cache[currentCachedLine][1], 1, y,
		 * Graphics.TOP | Graphics.LEFT); y = y + font.getHeight(); }
		 * currentLine = maxLine;
		 */

		while (currentLine < maxLine) {
			if (currentLine >= firstLine && currentLine < lastLineOnScreen) {
				currentCachedLine = currentLine - startLine;
				if (currentCachedLine < cacheCnt) {
					g.drawSubstring(content, cache[currentCachedLine][0],
							cache[currentCachedLine][1], 1, y, Graphics.TOP
									| Graphics.LEFT);
				}
				y = y + font.getHeight();
			}
			currentLine++;
		}

	}

	public void paintString(Graphics g, String str, Font font, boolean center) {
		paintStringWithCaching(g, str, font, false, center);
	}

	public void paintCache(Graphics g, Font font) {
		if (cached) {
			paintFromCache(g, font);
		} else {
			paintStringWithCaching(g, content, font, true, false);
			cached = true;
		}
	}

	public void paintStringWithCaching(Graphics g, String str, Font font,
			boolean toCache, boolean center) {
		int[] pair;
		StringDivider stringDivider = null;

		calculateScrollerStep(font, g);

		stringDivider = new StringDivider(str);
		// while is not at the end of the given string

		while (!stringDivider.atEnd()) {
			// gets pair[0] - offset, pair[1] - length

			pair = stringDivider.nextLine(g, font);
			g.setFont(font);
			// debug facility
			// String toBePainted = str.substring(pair[0],pair[1]+pair[0]);
			// System.out.println(toBePainted);

			// paints current line, if it is in scope of screen
			if (currentLine >= firstLine
					&& currentLine < firstLine + scrollerStep) {
				if(center == true){
					g.drawSubstring(str, pair[0], pair[1], g.getClipWidth()/2, y, Graphics.TOP | Graphics.HCENTER);
				} else {
					g.drawSubstring(str, pair[0], pair[1], 1, y, 0);
				}
				// proceeds to next line
				y = y + font.getHeight();
			}

			currentLine++;
			if (toCache) {
				addToCache(pair[0], pair[1]);
			}

		}
	}

	public void setOption(String option, int value) {
		if (option.equals(OPTION_BACKGROUND)) {
			if (value == OPTION_BACKGROUND_DARK) {
				dark_background = true;
			} else {
				dark_background = false;
			}
		} else if (option.equals(OPTION_FONT_SIZE)) {
			fontSize = value;
			resetCache();
		}
	}

	public String[] getOptions() {
		return new String[] { OPTION_BACKGROUND, OPTION_FONT_SIZE };
	}

	public int[] getOptionValues(String option) {
		if (option.equals(OPTION_BACKGROUND)) {
			return new int[] { OPTION_BACKGROUND_BRIGHT, OPTION_BACKGROUND_DARK };
		} else if (option.equals(OPTION_FONT_SIZE)) {
			return new int[] { Font.SIZE_LARGE, Font.SIZE_MEDIUM,
					Font.SIZE_SMALL };
		}
		return null;
	}

	public String[] getOptionLabels(String option) {
		if (option.equals(OPTION_BACKGROUND)) {
			return new String[] { "OPTION_BACKGROUND_BRIGHT",
					"OPTION_BACKGROUND_DARK" };
		} else if (option.equals(OPTION_FONT_SIZE)) {
			return new String[] { "Font.SIZE_LARGE", "Font.SIZE_MEDIUM",
					"Font.SIZE_SMALL" };
		}
		return null;
	}

	public int getOption(String option) {
		if (option.equals(OPTION_BACKGROUND)) {
			if (dark_background == true) {
				return OPTION_BACKGROUND_DARK;
			}
			return OPTION_BACKGROUND_BRIGHT;
		} else if (option.equals(OPTION_FONT_SIZE)) {
			return fontSize;
		}
		return -1;
	}

	public String[] getLabels() {
		return new String[] { OPTION_BACKGROUND, OPTION_FONT_SIZE };
	}

	public void fromDataStream(DataInputStream din) {
		try {
			dark_background = din.readBoolean();
			fontSize = din.readInt();
			din.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void toDataStream(DataOutputStream dout) {
		try {
			dout.writeBoolean(dark_background);
			dout.writeInt(fontSize);
			dout.flush();
			dout.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}