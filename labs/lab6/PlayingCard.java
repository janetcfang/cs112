/*

	PlayingCard class
	@author Janet Fang

*/
//implement comparable interface
public class PlayingCard implements Comparable<PlayingCard>{
	
	//value, suit and color
	protected int value;
	protected String suit;
	protected String color;

	//constructor
	public PlayingCard(int value, String suit, String color){
		this.value = value;
		this.suit = suit;
		this.color = color;
	}


	//getters
	public int getValue() {
		return this.value;
	}

	public String getSuit() {
		return this.suit;
	}


	//toString method returns a String of all properties
	public String toString(){

		String face = "";
		if(this.value == 11){
			face = "Jack";
		} else if(this.value == 12){
			face = "Queen";
		} else if(this.value == 13){
			face = "King";
		} else if(this.value == 14){
			face = "Ace";
		} else {
			face += this.value;
		}

		return "Value: " + face + " Suit: " + suit + " Color: " + color;
	}

	//Comparable interface: compare 2 PlayingCard objs -- compare the values
	public int compareTo(PlayingCard other){

		int difference = this.value - other.getValue();

		if(difference == 0) {
			return -1 * this.suit.compareTo(other.getSuit());
		} else if(difference > 0) {
			return 1;
		} else {
			return -1;
		}

	}


}
