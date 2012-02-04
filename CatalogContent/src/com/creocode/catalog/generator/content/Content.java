
      package com.creocode.catalog.generator.content;
      import java.util.Vector;
	  /**
	  * Generated
	  *@author Your Name 2
	  *
	  **/
      public class Content {
      
      public final String title = "Application Name";
      public final String version = "1.0";
      public final String vendor = "";
      public final String author = "Your Name 2";
      public final String copyrights = "2011 Creative Commons BY-SA";
      
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
    				category.title = "First category ąś";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(1));
						
					
					
					
					
					
		
					items.addElement("First Item ąśd");
					
					category.addItem(new Integer(1));

		
					items.addElement("Our Father");
					
					category.addItem(new Integer(2));


					category = new Category();
    				category.title = "Second category";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(2));
						
					
					
					
					
					
		
					items.addElement("Third item");
					
					category.addItem(new Integer(3));

		
					items.addElement("n/a");
					
					category.addItem(new Integer(4));


					category = new Category();
    				category.title = "Third";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(3));
						
					
					
					
					
					

    	}
      }
   