/*
	class to demonstrate file input in Java.
*/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections; //sort 
import java.util.Scanner;

public class FileInputCSV{
	
	public static void main(String[] args){

		//System.out.println("first argument: " + args[0]);
		//System.out.println("second argument: " + args[1]);

		if(args.length != 1){
			System.out.println("usage: java FileInputCSV <filename>");
			System.exit(1);
		}

		File inputFile = new File(args[0]);

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();

		try(Scanner input = new Scanner(inputFile)){

			input.useDelimiter(",|\n"); // | means "or"
			
			while(input.hasNext()) {


				//read in a name and add to names list
				String name = input.next();
				names.add(name);


				//read in a score and add to scores list
				int score = input.nextInt();
				scores.add(score);


			}



		} 

		catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			//fnf.printStrckTrace();
			System.out.println(fnf.getMessage());
			System.exit(1);
		}

		//if uneven amount:
		for(int i = 0; (i < names.size() && i < scores.size()); i++){ 
		// orig: for(int i = 0; i < scores.size(); i++)

			String name = names.get(i);
			int score = scores.get(i);
			System.out.println("Name: " + name + "Score: " + score);



		/*hack for testing

		names.add("LSJFLSDFJ"); //extra name to add on to test
		//scores.add("100");

		if(scores.size() > names.size()) {
			for(int i = 0; i < scores.size(); i++){

			String name = names.get(i);
			int score = scores.get(i);
			System.out.println("Name: " + name + "Score: " + score);
		}
		else{
			for(int i = 0; i < names.size(); i++){

			String name = names.get(i);
			int score = scores.get(i);
			System.out.println("Name: " + name + "Score: " + score);
		}



		*/

		}
			

	}



}
