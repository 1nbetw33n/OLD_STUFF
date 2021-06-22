package EidP.Exercises.Exercise5.Aufgabe1;

public abstract class Person {
	
	private String name;
	
	public Person(final String NAME) {this.name = NAME;}
	
	public String getName() {return this.name;}
	
	public String toString() {return "" + this.name;}
}
