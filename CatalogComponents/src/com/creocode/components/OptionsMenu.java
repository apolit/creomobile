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

import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;

/**
 *
 * @author artur
 */
public class OptionsMenu extends Form {

 Vector names;
 Vector choices;
 Vector chosen;

    public OptionsMenu(String title) {
        super(title);
        
        names = new Vector();
        choices = new Vector();
        chosen = new Vector();
    }

    public void addOption(String name, String options){
        names.addElement(name);
        choices.addElement(options);
    }

    public void initialize(){
        ChoiceGroup choiceGroup;

        for( int i = 0; i < names.size(); i++){
            choiceGroup = new ChoiceGroup((String)names.elementAt(i), ChoiceGroup.EXCLUSIVE);
            String opt = (String)choices.elementAt(i);
            int j = 0;
            int k = 0;
            do {
                k = opt.indexOf('|', j);
                choiceGroup.append(opt.substring(j, k), null);
                j=k+1;
            } while ( k == -1);
            choiceGroup.append(opt.substring(j, opt.length()), null);
            append(choiceGroup);
        }
    }

}