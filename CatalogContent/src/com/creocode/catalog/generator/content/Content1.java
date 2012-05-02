package com.creocode.catalog.generator.content;
import java.util.Vector;

public class Content1 extends ContentBase {

	public void initCategories() {
		category = new Category();
		category.title = "First category";
		category.parentId = -1;
		categories.addElement(category);

		//0
		//0					

		item = new Item();
		item.title = "First item";
		item.intro = "Introduction to first";
		item.content = "Lorem ipsum";
		item.details = "";
		items.addElement(item);
		category.addItem(new Integer(0));
		//1

		item = new Item();
		item.title = "Second item";
		item.intro = "Introduction to second";
		item.content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam pellentesque commodo venenatis. Praesent felis nisl, consequat id pellentesque nec, lobortis vitae tellus. Nam consectetur dictum nunc. Fusce ut tellus eros. In hac habitasse platea dictumst. Nunc vitae lorem lacus. Vivamus ut ligula ut arcu fermentum ultrices. Aliquam et tortor odio, at dapibus orci. Aliquam erat volutpat. Aliquam posuere ligula sit amet enim tempus facilisis. Quisque ultrices magna non odio consequat in tristique urna egestas. Proin eu metus mauris, non malesuada leo. Maecenas fringilla, magna eu dictum euismod, ligula arcu semper tortor, ac rhoncus lacus risus id ligula. Maecenas mauris ligula, feugiat a consectetur sit amet, vehicula quis enim. Sed in commodo enim. Quisque nec magna ante, et luctus dolor.\n\nMauris orci nibh, blandit non pretium vel, imperdiet nec purus. Suspendisse venenatis tempus imperdiet. Nullam tempor iaculis elit, ut euismod nulla ultricies at. Pellentesque laoreet odio sed quam rhoncus suscipit. Nulla facilisi. Phasellus at dolor id sem dapibus condimentum sit amet in risus. Morbi vitae neque eros. Morbi mauris arcu, sagittis vitae sodales sit amet, porta ut orci. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec ligula lectus, mollis ut lobortis a, tincidunt sit amet. \n\nCostam ";
		item.details = "[cat_smile.jpg, smile.jpg]";
		items.addElement(item);
		category.addItem(new Integer(1));
		//2

	}
}
