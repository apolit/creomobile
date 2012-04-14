package com.creocode.catalog.generator.content;

import java.util.Vector;

public abstract class ContentBase {

	public Vector categories = new Vector();
	public Vector items = new Vector();

	//temp variables
	public Category category;
	Category subCategory;
	Item item;
	
	public abstract void initCategories();
}
