/*
	Assignment is to print out specific fruits if user inputs a number 
	between 1 and 100, is divisable by 3 or 7 or both, or neither.
	@author Janet Fang
*/


import java.util.Scanner;


public class AppleOrange{
	
	public static void main(String[] args) {


		//command line input from user: # 1-100
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 100: ");
		int userInput = input.nextInt();

		//calculations
		if(userInput % 3 == 0 && userInput % 7 ==0){ 
			System.out.println("appleorange");
		}
		else if(userInput % 3 == 0){
			System.out.println("apple");
		}
		else if(userInput % 7 == 0){
			System.out.println("orange");
		}
		else if(userInput < 1 || userInput > 100){
			System.out.println("banana");
		}
		else{
			System.out.println(userInput);
		}


	} 

}
