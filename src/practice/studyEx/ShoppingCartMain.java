package practice.studyEx;

public class ShoppingCartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("마늘",2000,2);
		Item item2 = new Item("상추",3000,4);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.displayItems();

	}

}
