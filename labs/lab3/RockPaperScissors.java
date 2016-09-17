/*

	Assignment is to create the Rock, Paper, Scissors game.

	@author Janet Fang

*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{

	public static void main(String[] args){

		//variables
		String userPlay = ""; //user choice: 1 (Rock), 2 (Paper) or 3 (Scissors)
		String compPlay = ""; //comp choice

		//computer chooses a random num between 1 and 3
		final int MAX = 3; 
		Random r = new Random(); 
		int choice = r.nextInt(MAX) + 1; 

		//assigning the random choice to compPlay's values
		if(choice == 1){
			compPlay = "Rock";
		}
		else if(choice == 2){
			compPlay = "Paper";
		}
		else if(choice == 3){
			compPlay = "Scissors";
		}


		//user to input 1,2,3 - then sets the values and start game
     	int userInput = 1;
     	Scanner input = new Scanner(System.in);

     	while (userInput != 0){
			System.out.println("Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit: ");
			userInput = input.nextInt();


			//invalid input loop, reprompts
			while (userInput > 3){
				System.out.println("Invalid input.");
				userInput = 1;
				System.out.println("Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit: ");
				userInput = input.nextInt();
			}


			//assigning the userInput to userPlay's value
			if(userInput == 1){
				userPlay = "Rock";
			}
			else if(userInput == 2){
				userPlay = "Paper";
			}
			else if(userInput == 3){
				userPlay = "Scissors";
			}
			else if(userInput == 0){
				userPlay = "Exit";
			}

			//the results
			if(userPlay.equals(compPlay)){
				System.out.println("Player chooses " + userPlay + "." + " Computer chooses " + compPlay + ".");
				System.out.println("It's a tie!");
			}
			else if(userPlay.equals("Rock") && compPlay.equals("Scissors")){
				System.out.println("Player chooses " + userPlay + "." + " Computer chooses " + compPlay + ".");
				System.out.println("Player wins!");
			}
			else if(compPlay.equals("Rock") && userPlay.equals("Scissors")){
				System.out.println("Computer chooses " + compPlay + "." + " Player chooses " + userPlay + ".");
				System.out.println("Computer wins!");
			}
			else if(userPlay.equals("Paper") && compPlay.equals("Rock")){
				System.out.println("Player chooses " + userPlay + "." + " Computer chooses " + compPlay + ".");
				System.out.println("Player wins!");
			}
			else if(compPlay.equals("Paper") && userPlay.equals("Rock")){
				System.out.println("Computer chooses " + compPlay + "." + " Player chooses " + userPlay + ".");
				System.out.println("Computer wins!");
			}
			else if(userPlay.equals("Scissors") && compPlay.equals("Paper")){
				System.out.println("Player chooses " + userPlay + "." + " Computer chooses " + compPlay + ".");
				System.out.println("Player wins!");
			}
			else if(compPlay.equals("Scissors") && userPlay.equals("Paper")){
				System.out.println("Computer chooses " + compPlay + "." + " Player chooses " + userPlay + ".");
				System.out.println("Computer wins!");
			}
			else if(userPlay.equals("Exit")){
				System.out.println("Game Over.");
			}


		}
		

	}


}





