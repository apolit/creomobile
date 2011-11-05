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


import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 *
 * @author Artur Polit
 */
public class Options implements IOptions {

    class SampleFilter implements RecordFilter {

	public boolean matches(byte[] record) {
	    return true;
	}
    }
    
    public static final String STORE_NAME = "OPTIONS";
    RecordStore recordStore = null;
    NameFilter nameFilter;

    public Options() {
        nameFilter = new NameFilter();
        openRecordStore();
    }

    public String contentForRecord(byte[] record){
        return new String(record, NameFilter.LENGTH, record.length - NameFilter.LENGTH);
    }

    public String find(String recordName) throws Exception {
        openRecordStore();
        byte[] record = null;
        int recordId = findId(recordName);

        if (recordId > 0) {
            record = recordStore.getRecord(recordId);
            closeRecordStore();
            return contentForRecord(record);
        }
        closeRecordStore();
        return null;
    }

    public void create(String recordName, String value) throws Exception {
        byte[] valueBytes = value.getBytes();
        byte[] nameBytes = recordName.getBytes();

        int recordLength = NameFilter.LENGTH + valueBytes.length;
        byte[] record = new byte[recordLength];
        for (int i = 0; i < nameBytes.length; i++) {
            record[i] = nameBytes[i];
        }
        for (int i = nameBytes.length; i < NameFilter.LENGTH; i++) {
            record[i] = 0;
        }
        for (int i = 0; i < valueBytes.length; i++) {
            record[NameFilter.LENGTH + i] = valueBytes[i];
        }

        recordStore.addRecord(record, 0, recordLength);

    }

    public void update(String recordName, String value) throws Exception{
        int recordId = findId(recordName);
        if (recordId > 0) {
            deleteWithId(recordId);
        }
        create(recordName, value);

    }

    private void deleteWithId(int recordId) throws Exception {

            recordStore.deleteRecord(recordId);
    }

    private void deleteAll() {
        try {
            RecordStore.deleteRecordStore(STORE_NAME);
            RecordStore.openRecordStore(STORE_NAME, true);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }
    }

    private int findId(String recordName) throws Exception {
        int recordId = 0;

            nameFilter.setName(recordName);
            RecordEnumeration re = recordStore.enumerateRecords(nameFilter, null, true);
            if (re.hasNextElement()) {
                recordId = re.nextRecordId();
            }

        return recordId;
    }

    private void openRecordStore() {
        try {
            recordStore = RecordStore.openRecordStore(STORE_NAME, true);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }
    }

    private void closeRecordStore() throws Exception{
        recordStore.closeRecordStore();
        recordStore = null;
    }

    public void serialize(IConfigurable configurable) throws Exception {
        openRecordStore();
        String[] options;

        options = configurable.getOptions();

        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            int value = configurable.getOption(option);

            String valueString = String.valueOf(value);
            //System.out.println("slz "+option+":"+valueString);
            update(option, valueString);
        }
        recordStore.closeRecordStore();
    }

    public void deserialize(IConfigurable configurable) throws Exception{
        openRecordStore();

            RecordEnumeration re = recordStore.enumerateRecords(new SampleFilter(), null, true);
            while (re.hasNextElement()) {
                byte[] record = re.nextRecord();
                String option = NameFilter.getName(record);
                String valueString = contentForRecord(record);
                int value = Integer.parseInt(valueString);
                System.out.println("dslz "+option+":"+valueString);
                configurable.setOption(option, value);
            }
            recordStore.closeRecordStore();
    }
}