package EidP.Exercises.Exercise4.Aufgabe3;

public class ShoppingCartTest {

	public static void main(String[] args) {
		final Customer a = new Customer();
		final Customer b = new Customer();
		
		a.addToCart(new Article("T-Shirt", 24.5));
		a.addToCart(new Article("Buch", 12.8));
		a.addToCart(new Article("T-Shirt", 18.9));
		b.addToCart(new Article("Hose", 65.0));
		a.addToCart(new Article("Buch", 45.0));
		b.addToCart(new Article("Hose", 80.0));
		a.addToCart(new Article("Jacke", 29.0));
		a.addToCart(new Article("Hose", 54.0));
		a.addToCart(new Article("DVD", 9.9));
		
		a.showCart();
		a.purchase();
		System.out.println();
		b.showCart();
		b.purchase();
		
		a.addToCart(new Article("noch was", 21.9));
		System.out.println();
		a.showCart();
		a.purchase();
	}

}
