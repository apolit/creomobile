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

package com.creocode.components.menu;

import com.creocode.components.i18n.Translator;
import javax.microedition.lcdui.List;

/**
 *
 * @author Artur Polit
 */
public class MainMenuList extends List {

    Translator translator;

    public MainMenuList() {
        super("", List.IMPLICIT);
        translator = new Translator();
        setTitle(translator.t("CHOOSE_PRAYER"));
        //append(I18n.MEDITATIONS_1, null);
        append(translator.t("NEW"), null);
        append(translator.t("RESUME"), null);
        append(translator.t("OPTIONS"), null);
        append(translator.t("HELP"), null);
    }

    public boolean isNewSelected() {
        if (getSelectedIndex() == 0) {
            return true;
        }
        return false;
//        return compare("NEW");
    }

    public boolean isResumeSelected() {
        if (getSelectedIndex() == 1) {
            return true;
        }
        return false;
//        return compare("RESUME");
    }

    public boolean isOptionsSelected() {
        if (getSelectedIndex() == 2) {
            return true;
        }
        return false;
//        return compare("OPTIONS");
    }

    public boolean isHelpSelected() {
        if (getSelectedIndex() == 3) {
            return true;
        }
        return false;
//        return compare("HELP");
    }

    private boolean compare(String string) {

        return (getString(getSelectedIndex()).equals(translator.t(string)));
    }
}