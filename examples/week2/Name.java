public class Name{
	
	private String first; // these 2 vars can be accessed anywhere in class while this.first/this.last can be accessed within
	private String last; // #1 last var -- this.

	//getters
	public String getFirst() {
		return this.first;
	}

	public String getLast() {
		return this.last;
	}

	//setters
	public void setLast(String last) { //#2 last var
		this.last = last;
	}

	//other methods
	public String toString() {
		return "First: " + this.first + " Last: " + this.last;
	}

/* 	or: (example of scoping)
	public String toString(){
		String toReturn = "Hello, " + first + " " + last;
		return toReturn;
	}
*/
	public boolean equals(Name other){

		if (this.first.equals(other.getFirst()) && 
				this.last.equals(other.getLast())) {
			return true;
		}
		return false;
	}



	//constructor -- 4 data members/vars that can be accessed: this.first, this.last, first, last
	public Name(String first, String last) {
		this.first = first; 
		this.last = last;
	}


/* Example anonymous:

	public Name(String last) {
		this.first = "Anon";
		this.last = last;
	}

	can't do:
	public Name(String first) {
		this.first = first;
		this.last = "Anon";
	}


*/

}
