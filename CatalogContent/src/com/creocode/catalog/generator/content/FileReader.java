package com.creocode.catalog.generator.content;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {

	public String readUnicodeFile(String filename) {
		StringBuffer buffer = null;
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			Class c = this.getClass();
			is = c.getResourceAsStream(filename);
			if (is == null)
				throw new Exception("File Does Not Exist");

			isr = new InputStreamReader(is, "UTF-8");

			buffer = new StringBuffer();
			int ch;
			while ((ch = isr.read()) > -1) {
				buffer.append((char) ch);
			}
			if (isr != null)
				isr.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return buffer.toString();
	}

}
