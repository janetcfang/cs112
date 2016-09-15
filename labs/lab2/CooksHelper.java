/*	
	Assignment is to convert tablespoon to cups.
	@author Janet Fang
*/


import java.util.Scanner;


public class CooksHelper{
	
	public static void main(String[] args) {


		//command line input from user: # of tablespoons
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of Tablespoons: ");
		int userInput = input.nextInt();

		//calculations 1 cup = 16 tablespoons
		double cups = ((double)userInput)/16;
		System.out.println(userInput + " tablespoons is equal to " + cups + " cups.");
		

	} 
}

