
/*

	A class to implement the main method.
	@author Janet Fang

*/
import java.util.ArrayList;

import java.util.Scanner;

public class PokemonDriver {

	public static void main(String[] args) {

		//if file name parameter is not present, print an error message and exit the program
		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); //exit the program 
		}
		
		String inFileName = args[0];

		//Create a new PokedexBuilder
		PokedexBuilder builder = new PokedexBuilder();

		//Invoke the buildPokedex method 
		//save the Pokedex returned in a temporary variable.
		Pokedex myPokedex = builder.buildPokedex(inFileName);


		//If the Pokedex is null (for example, because the file was not found)
		//print an error message and exit the program.
		if(myPokedex == null){
			System.out.println("Error: Pokedex is null.");
			System.exit(0);
		}


		//print information about all Pokemon
		System.out.println("All Pokemon: " + "\n" + myPokedex.toString());


		//print empty lines for spacing
		System.out.println("");
		System.out.println("");
		System.out.println("");


		//print average height
		System.out.printf("Average Height: %.1f\n", myPokedex.averageHeight());

		//print average weight
		System.out.printf("Average Weight: %.1f\n", myPokedex.averageWeight());

		//print average experience
		System.out.printf("Average Experience: %.1f\n", myPokedex.averageExperience());

		//print tallest
		System.out.println("Species of Tallest: " + myPokedex.tallest());

		//print smallets
		System.out.println("Species of Smallest: " + myPokedex.smallest());

		//print pokemon with greater experience than 200
		int level = 200;
		ArrayList<Pokemon> myList = myPokedex.mostExperienced(level);
		System.out.println("Pokemon with experience greater than " + level + ": ");
		for(Pokemon poke: myList){
			System.out.println(poke.toString());
		}


	}

}