/*

	The Pokedex class maintains a list of Pokemon and provide methods to find information 
	about the collection of Pokemon. 
	This includes: 
		- the average experience level
		- the tallest Pokemon
		- a list of the most experienced Pokemon

	@author Janet Fang

*/

import java.util.ArrayList;

public class Pokedex {

	//data member: list to hold Pokemon objects
	private ArrayList<Pokemon> list;

	//constructor
	public Pokedex() {
		this.list = new ArrayList<Pokemon>();
	}

	//method to add Pokemon to the list
	public void addPokemon(Pokemon pokemon){
		this.list.add(pokemon);
	}

	//method to return string representation of the Pokedex
	public String toString() {
		String resultString = "";

		for(Pokemon poke: this.list) {
			resultString = resultString + poke.toString() + "\n";	
		}
		return resultString;
	}

	//method to return average height of all Pokemon in Pokedex
	public double averageHeight() {
		//take all height and divide by the number of heights, return double
		double total = 0;

		for(Pokemon list: this.list){
			total = total + list.getHeight();
		}

		double result = total / this.list.size();
		return result;
		
	}


	//method to return average weight 
	public double averageWeight() {
		//take all weight and divide by the number of weights, return double
		double total = 0;

		for(Pokemon list: this.list){
			total = total + list.getWeight();
		}

		double result = total / this.list.size();
		return result;
	}

	

	//method to return the average experience
	public double averageExperience() { 
		//take all experience and divide by the number of experiences, return double 
		double total = 0;

		for(Pokemon list: this.list){
			total = total + list.getExperience();
		}

		double result = total / this.list.size();
		return result;
	}

	

	//method to return the species of Pokemon with the largest height 
	public String tallest() {
		//get the largest height and name of the pokemon, return name of pokemon
		int height = 0;
		String name = "";
		for(Pokemon list: this.list){
			if(list.getHeight() > height){
				height = list.getHeight();
				name = list.getSpecies();
			}
		}
		return name;
	}


	
	//method to return the species of Pokemon with the smallest weight
	public String smallest() {
		//gets the smallest weight and name of pokemon, return name of pokemon
		int weight = 0;
		String name = "";
		for(Pokemon list: this.list){
			if(list.getWeight() > weight){
				weight = list.getWeight();
				name = list.getSpecies();
			}
		}
		return name;
	}
	

	//method to returns a list of all Pokemon with experience level greater 
	//than the level passed as input.
	//returns list of all pokemon with greater exp than 200
	public ArrayList<Pokemon> mostExperienced(int level) {
		ArrayList<Pokemon> mostExp = new ArrayList<Pokemon>();
		for(Pokemon list: this.list){
			if(list.getExperience() > level){
				mostExp.add(list);
			}	

		}
		return mostExp;
	}


}