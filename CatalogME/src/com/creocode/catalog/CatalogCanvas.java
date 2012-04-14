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

import java.io.IOException;
import java.util.Vector;

import javax.microedition.lcdui.*;
import com.creocode.components.PrayerCanvas;
import com.creocode.components.KeyListener;

/**
 * 
 * @author Artur Polit
 */
public class CatalogCanvas extends PrayerCanvas implements KeyListener {

	String name;
	private String intro;
	private Vector detailsVector;
	int currentDetail;

	CatalogCanvas() {
		setKeyListener(this);
	}

	public void paint(Graphics g) {
		Image image = null;
		double screenHeight, screenWidth = 0;
		
		Font font = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_PLAIN,
				getFontSize());
		Font font_bold = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_BOLD,
				getFontSize());

		if (currentDetail > -1 && currentDetail < detailsVector.size()) {
			String detail = (String) detailsVector.elementAt(currentDetail);
			if (detail.endsWith(".jpg") || detail.endsWith(".png")) {
				try {
					
					image = Image.createImage("/" + detail);

					screenHeight = g.getClipHeight() - 10;
					screenWidth = g.getClipWidth() - 10;
					double imageHeight = image.getHeight();
					double imageWidth = image.getWidth();

					double ratioX = screenWidth / imageWidth;
					double ratioY = screenHeight / imageHeight;

					double minRatio = ratioX > ratioY ? ratioY : ratioX;

					int newWidth = (int) (imageWidth * minRatio);
					int newHeight = (int) (imageHeight * minRatio);

					if (minRatio < 1.0d) {
						image = rescaleArray(image, image.getWidth(), image
								.getHeight(), newWidth, newHeight);
					}

					// setY(getY() + image.getHeight());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		if (image != null) {
			resetCurrentLine();
			setBlack(g);
			g.fillRect(0 - g.getClipX(), 0 - g.getClipY(), 1000, 1000);
			setWhite(g);

		} else {
			super.paint(g);

		}
		paintString(g, name + "\n", font_bold, true);

		if (image != null) {
			g.drawImage(image, (int) (screenWidth/2) , getY(), Graphics.TOP | Graphics.HCENTER);
		} else {

			if (!intro.equals("")) {
				paintString(g, intro+"\n", font, true);
			}

			paintCache(g, font);

		}
	}

	public void keyPressed(int keyCode) {
		switch (getGameAction(keyCode)) {
		case DOWN:

			if (currentDetail < detailsVector.size()) {
				currentDetail++;
			} else {
				super.onKeyDOWN();
			}
			break;
		case UP:
			if (onKeyUP() == false) {
				if (currentDetail > -1) {
					currentDetail--;
				}
			}
			break;
		}
		// System.out.println("guzik"+getGameAction(keyCode)+" DOWN:"+DOWN+" firstline"+firstLine);
		repaint();
	}

	public void setItem(String name, String content, String intro,
			Vector detailsVector) {
		resetScroll();
		this.name = name;
		this.intro = intro;
		this.detailsVector = detailsVector;
		currentDetail = 0;

		setCache(name, content);
	}

	Image rescaleArray(Image temp, int x, int y, int x2, int y2) {
		int ini[] = new int[temp.getWidth() * temp.getHeight()];
		// Get the RGB array of image into "rgb"

		int i = 0, t2;
		int dy, dx;
		temp.getRGB(ini, 0, temp.getWidth(), 0, 0, temp.getWidth(), temp
				.getHeight());
		int out[] = new int[x2 * y2];
		// t1=y/y2;
		t2 = x / x2;
		for (int yy = 0; yy < y2; yy++) {
			dy = yy * y / y2;

			for (int xx = 0; xx < x2; xx++) {
				dx = xx * t2;

				out[i++] = ini[(x * dy) + dx]; // (x2*yy)+xx
			}
		}
		Image temp3 = Image.createRGBImage(out, x2, y2, true);
		return temp3;
	}
}