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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/**
 *
 * @author artur
 */
public class Serializator {

    private final int size;

    public Serializator(int size) {
        this.size = size;
        try {

            recordStore = RecordStore.openRecordStore(STORE_NAME, true);
            if (recordStore.getNumRecords() == 0) {
                initRecordStore();
            }
            recordStore.closeRecordStore();
        } catch (RecordStoreException ex) {
            System.err.print(ex.getMessage());
        } 
        
    }
    public static final String STORE_NAME = "SERIALIZATOR";
    RecordStore recordStore = null;

    public void serialize(int recordId, ISerializable serializable) throws RecordStoreNotOpenException, IOException, InvalidRecordIDException, RecordStoreException {

        recordStore = RecordStore.openRecordStore(STORE_NAME, true);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(bout);
        serializable.toDataStream(dout);
        byte[] data = bout.toByteArray();
        recordStore.setRecord(recordId, data, 0, data.length);

        recordStore.closeRecordStore();
    }

    public void deserialize(int recordId, ISerializable serializable) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException, IOException {
        byte[] data;
        recordStore = RecordStore.openRecordStore(STORE_NAME, true);

        data = recordStore.getRecord(recordId);

        if (data.length > 1) { //there is something
            ByteArrayInputStream bin = new ByteArrayInputStream(data);
            DataInputStream din = new DataInputStream(bin);
            serializable.fromDataStream(din);
        }

        recordStore.closeRecordStore();
    }

    private void initRecordStore() throws RecordStoreNotOpenException, RecordStoreException {
        int i;
        for (i = 0; i < size; i++) {
            byte[] data = new byte[100];
            recordStore.addRecord(data, 0,data.length );
        }
    }
}