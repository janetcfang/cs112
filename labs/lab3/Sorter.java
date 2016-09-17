/*

	Sorts array alphabetically and reverse.
	@author Janet Fang

*/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections; //sort 
import java.util.Scanner;

public class Sorter{
	
	public static void main(String[] args){

		File inputFile = new File("words.txt");
		ArrayList<String> words = new ArrayList<String>();

		try(Scanner input = new Scanner(inputFile)){

			//read in file
			while(input.hasNext()) {

				String word = input.nextLine();
				words.add(word);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			System.exit(1);
		}


		//sort alphabetically
		Collections.sort(words);


		System.out.println("Alphabetical A-Z: ");

		for(String word: words){
			System.out.println(word);
		}

		System.out.println(); //skip line

		//reverse
		Collections.reverse(words);

		System.out.println("Alphabetical Z-A: ");

		for(String word:words){
			System.out.println(word);
		}





	}



}

