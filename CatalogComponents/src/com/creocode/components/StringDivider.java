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

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Font;

/**
 *
 * @author Artur Polit
 */
public class StringDivider {

    //string "iterator"
    int i = 0;
    int spacePosition = 0;
    int first = 0;
    int chars = 0;
    int strlen = 0;
    char ch;
    boolean breakLine;
    String str;
    int lastPos = 0;

    public StringDivider(String str) {
        this.str = str;
        strlen = str.length();
    }

    public void nextWord() {

        for (; i < strlen; i++) {
            //System.out.println(str.charAt(i));
            if (str.charAt(i) == '\n') {
                breakLine = true;
                break;
            }
            if (str.charAt(i) == ' ') {
                break;
            }

        }
    }

    public int[] nextLine(Graphics g, Font font) {

        if (str.charAt(i) == ' ' || str.charAt(i) == '\n') {
            i++;
        }
        first = i;
        while (i < strlen) {
            if (str.charAt(i) == '\n') {
                break;
            }
            if (str.charAt(i) == ' ') {
                i++;
            }
            lastPos = i;
            nextWord();
            if(font.substringWidth(str, lastPos, i - lastPos) + 2 > g.getClipWidth()){
                //word is longer than screen width (zussamengekommen :>)
                while(font.substringWidth(str, lastPos, i - lastPos) + 2 > g.getClipWidth()){
                    i--;
                }
            }
            //String test = str.substring(first, i);
            //System.out.println(test);
            if (font.substringWidth(str, first, i - first) + 2 > g.getClipWidth()) {
                //if word is longer than screen width
                i = lastPos;
                break;
            }
            if (breakLine) {
                breakLine = false;
                break;
            }
            if (i >= str.length() - 1) {
                break;
            }
            //System.out.print(i+","+str.length());
        }

        return new int[]{first, i - first};
    }

    public boolean atEnd() {
        //System.out.print("atEnd"+i+","+str.length());

        if (i >= str.length() - 1) {
            return true;
        }
        return false;
    }
}