/*

	Assignment is to find character occurences and matches with other words. 
	@author Janet Fang

*/
import java.lang.*;

public class Word{
	private String theWord;

	//constructor takes as input a String and save value in theWord
	public Word(String word){
		word = word.toLowerCase();
		theWord = word;
		
	}

	//countChars method
	public int countChars(char word){
		//word = Character.toLowerCase(word); //use if word passed is all CAPS
		int count = 0;
		for (int i=0; i < theWord.length(); i++) {
    		if(theWord.charAt(i) == word) {
				count ++; 
			}
		}
		return count;
	}



	//matchingChars method
	public int matchingChars(String word){
		//word=word.toLowerCase(); //use if word passed is all CAPS
		int count = 0;
		int index = 0;
		while (index < theWord.length() && index < word.length()) {
			if (theWord.charAt(index) == word.charAt(index)) {
				count ++;
			}
			index++;
		}
		return count;
	}
}

	
