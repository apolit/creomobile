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


package com.creocode.components.options;

import com.creocode.components.ITranslator;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

/**
 *
 * @author artur
 */
public class OptionsFormMulti extends Form implements CommandListener {
    private Command setCommand;
    private Command backCommand;

    private IParent parent;

    private ITranslator t;

    private Vector configurables;

    private ChoiceGroup[] choiceGroups = null;

    String[] options;
    int[][] values = null;
    
    public static String S_OPTIONS = "OPTIONS";
    public static String S_SAVE = "SAVE";
    public static String S_BACK = "BACK";

    public OptionsFormMulti( IParent parent, IConfigurable configurable, ITranslator translator) {

        super(translator.t(S_OPTIONS));


        this.parent = parent;
        this.t = translator;

        options = configurable.getOptions();
        String[] labels = configurable.getLabels();
        
        choiceGroups = new ChoiceGroup[options.length];

        values = new int[options.length][];
        
        for (int i = 0; i < options.length; i++) {
            String[] optionLabels = configurable.getOptionLabels(options[i]);
            values[i] = configurable.getOptionValues(options[i]);
            String[] tLabels = new String[optionLabels.length];
            for (int j = 0; j < tLabels.length; j++) {
                tLabels[j]=t.t(optionLabels[j]);
            }
            choiceGroups[i] = new ChoiceGroup(t.t(labels[i]), ChoiceGroup.EXCLUSIVE,tLabels  , null);
            append(choiceGroups[i]);
        }

        fillOptions();
        
        setCommand = new Command(translator.t(S_SAVE), Command.OK, 0);
        backCommand = new Command(translator.t(S_BACK), Command.EXIT, 0);

        addCommand(setCommand);
        addCommand(backCommand);

        setCommandListener(this);
    }

    public String getLabel(){
        return t.t("OPTIONS");
    }
    public void commandAction(Command command, Displayable displayable) {
   
            if (command == setCommand) {
                applyOptions();
                parent.displayMain();
            } else if (command == backCommand) {
                parent.displayMain();
            }
        
    }

    private int applyOptions(IConfigurable configurable, int z) {
        int i = z;
        for (; i < z+configurable.getLabels().length; i++) {
            ChoiceGroup choiceGroup = choiceGroups[i];
            int selected = choiceGroup.getSelectedIndex();
            configurable.setOption(options[i], values[i][selected]);
            //System.out.println("apply dla " + options[i] + " " + values[i][selected]);
        }
        return i;
    }

    private int fillOptions(IConfigurable configurable, int z) {
        int i=z;
        for ( ; i < z+configurable.getLabels().length; i++) {
            int value = configurable.getOption(options[i]);
            for (int j = 0; j < values[i].length; j++) {
                int k = values[i][j];
                if(value == k){
                    choiceGroups[i].setSelectedIndex(j, true);
                }
            }
        }
        return i;
    }

    private void fillOptions() {
        int z = 0;
        for (int i = 0; i < configurables.size(); i++) {
            IConfigurable configurable =(IConfigurable) configurables.elementAt(i);
            z=fillOptions(configurable,z);
        }
    }

    private void applyOptions() {
        int z = 0;
        for (int i = 0; i < configurables.size(); i++) {
            IConfigurable configurable =(IConfigurable) configurables.elementAt(i);
            z=applyOptions(configurable,z);
        }
    }

    public void addConfigurable(IConfigurable configurable){
        configurables.addElement(configurable);
    }

}