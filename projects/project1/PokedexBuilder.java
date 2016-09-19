/*

	A class that will construct a Pokedex object from
	a given CSV file.

	@author Janet Fang

*/

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class PokedexBuilder {

	/*
		Method takes as input a filename and returns a Pokedex
		containing data for all pokemon in the file.
	*/

	public Pokedex buildPokedex(String filename) {

		//create list to be returned
		Pokedex list = new Pokedex();

		//open the file
		File inputFile = new File(filename);

		//read in each line of file
		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter(",|\n");
			String skip = input.nextLine();
			while(input.hasNext()) {
				int id = input.nextInt();
				String identifier = input.next();
				int species_id = input.nextInt();
				int height = input.nextInt();
				int weight = input.nextInt();
				int base_experience = input.nextInt();
				int order = input.nextInt();
				int is_default = input.nextInt();
				
				//	create a Pokemon
				//	add Pokemon to list
				Pokemon pokemon = new Pokemon(id, identifier, species_id, height, weight, base_experience, order, is_default);
				list.addPokemon(pokemon);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
            System.out.println(fnf.getMessage());
            System.exit(1);

		}
		
		//return list
		return list;
	}

}