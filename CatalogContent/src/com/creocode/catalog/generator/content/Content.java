
      package com.creocode.catalog.generator.content;
      import java.util.Vector;
	  /**
	  * Generated
	  *@author 
	  *
	  **/
      public class Content {
      
      public Vector categories = new Vector();
      public Vector items = new Vector();
      
      //temp variables
      Category category;
   	  Category subCategory;
   	  Item item;
   	  public String title = "Title";
   	  public String vendor = "Vendor";
      public String copyrights = "Copyrights";
      public String version = "Version";
   	  
    	public void initCategories(){
    				//temp category & item
    				
    			items.addElement(new Item());
   	  			Category topCategory = new Category();
   	  			categories.addElement(topCategory);
       			
					category = new Category();
    				category.title = "top category";
    				category.parentId = 0;
    				
    				categories.addElement(category);
					topCategory.addSubCategory(new Integer(1));
						
					
					
					
					subCategory = new Category();
					subCategory.title = "sub category 1";
					subCategory.parentId = 1;
					
   					item = new Item();
					item.title = "sub item";
					item.intro = "";
					item.content = "sub item content";
					item.details = "";
					items.addElement(item);
					subCategory.addItem(new Integer(1));

					category.addSubCategory(new Integer(2));
					categories.addElement(subCategory);
					
					
					
   					item = new Item();
					item.title = "top item";
					item.intro = "";
					item.content = "top item content";
					item.details = "";
					items.addElement(item);
					category.addItem(new Integer(2));


    	}
      }
   