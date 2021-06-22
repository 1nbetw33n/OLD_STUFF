package EidP.Exercises.Exercise8.Aufgabe3;

final class ListeInt {

	Item first;
	
	ListeInt(){this.first = null;}
	
	ListeInt(final Item I){
		this.first = I;
	}
	
	ListeInt rest() {return this.first == null ? null : new ListeInt(this.first.next);}
	
	void append(final Item ELEMENT) {
		if (this.first == null) {
			this.first = ELEMENT;
			
		} else if (this.first.next == null) {
			this.first.next = ELEMENT;
			
		} else {
			rest().append(ELEMENT);
		}
	}
	
	void insert (final int N) {
		this.first.next = new Item(N);
	}
	
	public String toString() {
		String output = "<";
		Item cursor = this.first;
		while (cursor != null) {
			output += cursor.value + " ";
			cursor = cursor.next;
		}
		output += ">";
		return output;
	}
	
}
