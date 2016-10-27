/*

	A PlayingCardDriver 
	@author Janet Fang

*/
import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDriver{
	public static void main(String[] args){

		//create ArrayList of at least 5 PlayingCard objects
		ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>(6);


		//Collections.sort to sort cards
		cards.add(new PlayingCard(10, "Spades", "Red"));
		cards.add(new PlayingCard(6, "Hearts", "Black"));
		cards.add(new PlayingCard(5, "Hearts", "Red"));
		cards.add(new PlayingCard(10, "Hearts", "Red"));
		cards.add(new PlayingCard(11, "Diamonds", "Red"));
		cards.add(new PlayingCard(14, "Clubs", "Black"));
		cards.add(new PlayingCard(10, "Diamonds", "Red"));
		cards.add(new PlayingCard(13, "Spades", "Black"));
		cards.add(new PlayingCard(10, "Clubs", "Red"));

		Collections.sort(cards);


		//Print result to standard output
		for(PlayingCard card: cards) {

			System.out.println(card);
		}


	}
}
