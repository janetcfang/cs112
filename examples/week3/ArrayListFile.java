/*
	class to demonstrate file input in Java.
*/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections; //sort 
import java.util.Scanner;

public class ArrayListFile{
	
	public static void main(String[] args){

		File inputFile = new File("numbers.txt");

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		try(Scanner input = new Scanner(inputFile)){
			
			while(input.hasNext()) {

				int number = input.nextInt();
				numbers.add(number);
			}



		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			//fnf.printStrckTrace();
			System.out.println(fnf.getMessage());
			System.exit(1);
		}

		Collections.sort(numbers); //sort array list

		for(int number: numbers){

			System.out.println(number);
		}

	}



}
