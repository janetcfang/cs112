/*
	class to demonstrate file input in Java.
*/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileInputNumbers{
	
	public static void main(String[] args){

		File inputFile = new File("numbers.txt");

		try(Scanner input = new Scanner(inputFile)){
			//System.out.println("Executing Try Statement.");

			//read in file
			while(input.hasNext()) {

				int number = input.nextInt();

				System.out.println(number); //just prints
			}



		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			//fnf.printStrckTrace();
			System.out.println(fnf.getMessage());
			System.exit(1);
		}


	}



}
