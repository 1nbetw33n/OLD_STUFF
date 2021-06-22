package EidP.Exercises.Exercise4.Aufgabe3;

public class Customer {
	
	private static int customerIDCount;
	private int customerID;
	private int articleCount;
	private Article[] shoppingCart;
	
	public Customer() {
		this.customerID = ++customerIDCount;
		this.shoppingCart = new Article[5];
	}

	public int getCustomerID() {return this.customerID;}
	
	public int getArticleCount() {return this.articleCount;}
	
	public Article[] getShoppingCart() {return this.shoppingCart;}
	
	public void addToCart(final Article ARTICLE) {
//		this.shoppingCart[this.articleCount++] = this.articleCount < this.shoppingCart.length ? ARTICLE : extendCart(ARTICLE);
		if (this.articleCount < this.shoppingCart.length) {
			this.shoppingCart[this.articleCount++] = ARTICLE;
		}else {
			extendCart(ARTICLE);
		}
	}
	
	public void extendCart(final Article ARTICLE) {
		Article[] extendedShoppingCart = new Article[this.shoppingCart.length + 5];
		for (int index = 0; index < this.shoppingCart.length; index++) {
			extendedShoppingCart[index] = this.shoppingCart[index];
		}
		this.shoppingCart = new Article[extendedShoppingCart.length];
		for (int index = 0; index < extendedShoppingCart.length; index++) {
			this.shoppingCart[index] = extendedShoppingCart[index];
		}
		this.shoppingCart[this.articleCount++] = ARTICLE;
	}
	
	public double purchase() {
		double totalPrice = 0;
		for (int index = 0; index < this.shoppingCart.length; index++) {
			totalPrice += this.shoppingCart[index] != null ? this.shoppingCart[index].getPrice() : 0;
		}
		this.shoppingCart = new Article[5];
		return totalPrice;
	}
	
	public void showCart() {
		String output = "ShoppingCart of Customer " + this.customerID + "\n";
		for (int index = 0; index < this.shoppingCart.length; index++) {
			output += this.shoppingCart[index] != null ? this.shoppingCart[index].getName() + "\t" + this.shoppingCart[index].getPrice() + "ŧ\n" : "";
		}
		output += "We received your order.\nPlease pay " + purchase() + "ŧ.\n";
		System.err.println(output);
	}
}