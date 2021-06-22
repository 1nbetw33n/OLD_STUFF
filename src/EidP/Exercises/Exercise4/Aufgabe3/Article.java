package EidP.Exercises.Exercise4.Aufgabe3;

public class Article {

	private static int count;
	
	private int articleID;
	private String name;
	private double price;
	
	public Article() {
		this.articleID = ++count;
		this.name = "-";
		this.price = 0.00;
	}
	
	public Article(final String NAME, final double PRICE) {
		this.articleID = ++count;
		this.name = NAME;
		this.price = PRICE;
	}
	
	public int getArticleID() {return this.articleID;}
	
	public String getName() {return this.name;}
	
	public double getPrice() {return this.price;}
	
	public String toString() {return this.name + ", " + this.price;}
}
