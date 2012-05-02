package com.creocode.catalog.generator.content;
import java.util.Vector;

public class Content2 extends ContentBase {

	public void initCategories() {
		category = new Category();
		category.title = "Second category";
		category.parentId = -1;
		categories.addElement(category);

		//0
		//0					

		subCategory = new Category();
		subCategory.title = "Third";
		subCategory.parentId = 0;

		item = new Item();
		item.title = "Third item";
		item.intro = "";
		item.content = "Lorem ipsum";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(0));
		//1

		category.addSubCategory(new Integer(1));
		categories.addElement(subCategory);

	}
}
