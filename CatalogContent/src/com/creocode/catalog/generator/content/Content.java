
      package com.creocode.catalog.generator.content;
      import java.util.Vector;
	  /**
	  * Generated
	  *@author John Doe
	  *
	  **/
      public class Content {
      
      public final String title = "Sample  Application";
      public final String version = "1.0";
      public final String vendor = "Creocode";
      public final String author = "John Doe";
      public final String copyrights = "John Doe 2011";
      
      public Vector categories = new Vector();
      public Vector items = new Vector();
      
      //temp variables
      Category category;
   	  Category subCategory;
   	  Item item;
		
    	public void initCategories(){
    				//temp category & item
    				
    			items.addElement(new Item());
   	  			Category topCategory = new Category();
   	  			categories.addElement(topCategory);
       			
					category = new Category();
    				category.title = "Category1";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(1));
						
					
					
					
					
					
   					item = new Item();
					item.title = "Item 1";
					item.intro = "";
					item.content = "Content1";
					item.details = "";
					items.addElement(item);
					category.addItem(new Integer(1));


					category = new Category();
    				category.title = "Category2";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(2));
						
					
					
					
					
					
   					item = new Item();
					item.title = "Item2";
					item.intro = "";
					item.content = "Content2";
					item.details = "";
					items.addElement(item);
					category.addItem(new Integer(2));

   					item = new Item();
					item.title = "Item 3";
					item.intro = "";
					item.content = "Content 3";
					item.details = "";
					items.addElement(item);
					category.addItem(new Integer(3));


    	}
      }
   