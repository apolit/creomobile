package com.creocode.catalog.generator.content;

/**
 * Generated
 *@author John Author
 *
 **/
public class Content extends ContentBase {

	public final String title = "Sample Application";
	public final String version = "1.0";
	public final String author = "John Author";
	public final String copyrights = "2011 Creative Commons BY-SA";
	public final String vendor = "Creocode.com";

	public void initCategories() {
		//temp category & item

		items.addElement(new Item());
		Category topCategory = new Category();
		topCategory.parentId = -2;
		categories.addElement(topCategory);

		category = new Category();
		category.title = "First category";
		categories.addElement(category);
		topCategory.addSubCategory(new Integer(1));

		category = new Category();
		category.title = "Second category";
		categories.addElement(category);
		topCategory.addSubCategory(new Integer(2));

	}

}
