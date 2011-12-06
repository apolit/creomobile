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


import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Artur Polit
 */
public class TextCanvas extends Canvas {
    String content;
    
    int[][] cache;
    int cacheCnt = 0;
    
    boolean cached = false;
    int charsInLine;
    /**
     * variables used in line calculations
     */
    int currentLine = 0;
    protected int firstLine = 0;
    Font lastFont;
    KeyListener keyListener;
    int scrollerStep = 1;

    /**
     * cursor position in pixels
     */
    int y;

    public void resetCache(){
	cache = new int[500][2];
	cacheCnt = 0;
    }
    public void calculateCharsInLine(Font font, Graphics g) {
	int width;
	scrollerStep = g.getClipHeight() / font.getHeight();
	String testString = "aaaBcccDeeeFgggHiiiJkkkLmmmNoooPqqqRsssTuuuWxxxYzzz" + "aaaBcccDeeeFgggHiiiJkkkLmmmNoooPqqqRsssTuuuWxxxYzzz" + "aaaBcccDeeeFgggHiiiJkkkLmmmNoooPqqqRsssTuuuWxxxYzzz" + "aBcDeFgHiJkLmNoPqRsTuWxYz";
	for (int i = 5; i < testString.length(); i++) {
	    width = font.substringWidth(testString, 0, i);
	    if (width + 2 > g.getClipWidth()) {
		charsInLine = i + 5;
		return;
	    }
	}
    }

    public void keyPressed(int keyCode) {
	keyListener.keyPressed(keyCode);
    }

    public void onKeyDOWN() {
	if (firstLine + scrollerStep < currentLine) {
	    firstLine += scrollerStep;
	}
    }

    public void onKeyUP() {
	if (firstLine > 0) {
	    firstLine -= scrollerStep;
	}
    }

    public void resetScroll() {
	firstLine = 0;
    }

    public void setKeyListener(KeyListener keyListener) {
	this.keyListener = keyListener;
    }

    protected void paint(Graphics g) {
	y=0;
	currentLine=0;
	g.setColor(0, 0, 0);
	g.fillRect(0, 0, g.getClipWidth(), g.getClipHeight());
	g.setColor(255, 255, 255);
    }

    void addToCache(int begin, int end) {
	cache[cacheCnt][0] = begin;
	cache[cacheCnt][1] = end;
	cacheCnt++;
    }

    public void paintCached(Graphics g, Font font) {

	int startLine = currentLine;
	//maximail available line number
	int maxLine = cacheCnt + startLine;
	int maxScreenLine = firstLine + scrollerStep;
	int currentCachedLine;
	
	while (currentLine < maxLine) {
	    if (currentLine >= firstLine && currentLine < maxScreenLine) {
		g.setFont(font);
		currentCachedLine = currentLine - startLine;
		if(currentCachedLine < cacheCnt)
		g.drawSubstring(content, cache[currentCachedLine][0], cache[currentCachedLine][1], 1, y, Graphics.TOP | Graphics.LEFT);
		y = y + font.getHeight();
	    }
	    currentLine++;
	}
    }

    public void paintString(Graphics g, String str, Font font){
	paintStringToCache(g,str,font,false);
    }
    
    public void paintStringCache(Graphics g, Font font){
	if(cached){
	    paintCached(g,font);
	} else {
	    paintStringToCache(g,content,font,true);
	}
    }
    public void paintStringToCache(Graphics g, String str, Font font,boolean toCache) {
	if(toCache) resetCache();
	//string "iterator"
	int i;
	int spacePosition = 0;
	int first = 0;
	int chars = 0;
	char ch;
	
	if (!font.equals(lastFont)) {
	    calculateCharsInLine(font, g);
	    lastFont = font;
	    g.setFont(font);
	}
	

	for (i = 0; i < str.length(); i++) {
	    chars++;
	    ch = str.charAt(i);
	    if (ch == ' ') {
		spacePosition = i;
	    } else if (ch == '\n') {
		//rewind to the begining of the last word
		//if width is bigger than available
		if (font.substringWidth(str, first, i - first) > g.getClipWidth()) {
		    while (str.charAt(--i) != ' ') {
			;
		    }
		}
		//draw if in scope of screen
		if (currentLine >= firstLine && currentLine < firstLine + scrollerStep) {
		    g.drawSubstring(str, first, i - first, 1, y, Graphics.TOP | Graphics.LEFT);
		    y = y + font.getHeight();
		}
		//add coords to cache
		if (toCache) {
		    addToCache(first, i - first);
		}
		currentLine++;
		chars = 0;
		i++;
		//jump over @
		//potrzeba dawac spacji po \n
		first = i;
	    }
	    
	    if (chars == charsInLine || i == str.length() - 1) {
		if (i == str.length() - 1) {
		    spacePosition = str.length();
		} else if (str.charAt(i + 1) == ' ') {
		    spacePosition = i + 1;
		}
		while (font.substringWidth(str, first, spacePosition - first) > g.getClipWidth()) {
		    while (str.charAt(--spacePosition) != ' ') {
			;
		    }
		}

		if (currentLine >= firstLine && currentLine < firstLine + scrollerStep) {

		    g.drawSubstring(str, first, spacePosition - first, 1, y, Graphics.TOP | Graphics.LEFT);
		    y = y + font.getHeight();
		}
		if (toCache) {
		    addToCache(first, spacePosition - first);
		}
		currentLine++;
		chars = 0;
		first = ++spacePosition;
		//jump over space
		i = first;
	    }
	}
	if (toCache) {
	    cached = true;
	}
    }

    public void setContent(String content) {
	this.content = content;
	cached = false;
	cacheCnt = 0;
	resetScroll();
    }

     public void paintStringToCache2(Graphics g, String str, Font font,boolean toCache) {
	if(toCache) resetCache();
	//string "iterator"
	int i;
	int spacePosition = 0;
	int first = 0;
	int chars = 0;
	char ch;
	
	if (!font.equals(lastFont)) {
	    calculateCharsInLine(font, g);
	    lastFont = font;
	    g.setFont(font);
	}
	

	for (i = 0; i < str.length(); i++) {
	    chars++;
	    ch = str.charAt(i);
	    if (ch == ' ') {
		spacePosition = i;
	    } else if (ch == '\n') {
		//rewind to the begining of the last word
		//if width is bigger than available
		if (font.substringWidth(str, first, i - first) > g.getClipWidth()) {
		    while (str.charAt(--i) != ' ') {
			;
		    }
		}
		//draw if in scope of screen
		if (currentLine >= firstLine && currentLine < firstLine + scrollerStep) {
		    g.drawSubstring(str, first, i - first, 1, y, Graphics.TOP | Graphics.LEFT);
		    y = y + font.getHeight();
		}
		//add coords to cache
		if (toCache) {
		    addToCache(first, i - first);
		}
		currentLine++;
		chars = 0;
		i++;
		//jump over @
		//TODO nie ma @ to chyba mozna to wywalic i nie bedzie
		//potrzeba dawac spacji po \n
		first = i;
	    }
	    
	    if (chars == charsInLine || i == str.length() - 1) {
		if (i == str.length() - 1) {
		    spacePosition = str.length();
		} else if (str.charAt(i + 1) == ' ') {
		    spacePosition = i + 1;
		}
		while (font.substringWidth(str, first, spacePosition - first) > g.getClipWidth()) {
		    while (str.charAt(--spacePosition) != ' ') {
			;
		    }
		}

		if (currentLine >= firstLine && currentLine < firstLine + scrollerStep) {

		    g.drawSubstring(str, first, spacePosition - first, 1, y, Graphics.TOP | Graphics.LEFT);
		    y = y + font.getHeight();
		}
		if (toCache) {
		    addToCache(first, spacePosition - first);
		}
		currentLine++;
		chars = 0;
		first = ++spacePosition;
		//jump over space
		i = first;
	    }
	}
	if (toCache) {
	    cached = true;
	}
    }
}