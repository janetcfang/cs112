/* 

	The Pokemon class holds information about one Pokemon.
	@author Janet Fang

*/

public class Pokemon {
	
	//data members
	private int id;
	private String species;
	private int species_id;
	private int height;
	private int weight;
	private int experience;
	private int order;
	private boolean favorite;

	
	//getters
	public int getId() {
		return this.id;
	}

	public String getSpecies() {
		return this.species;
	}

	public int getSpecies_id() {
		return this.species_id;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getExperience() {
		return this.experience;
	}

	public int getOrder() {
		return this.order;
	}

	public boolean getFavorite() {
		return this.favorite;
	}



	//toString
	public String toString() {

		String favorite;

		if (this.favorite==true) {
			favorite = "Starred";
		}
		else{
			favorite = "Not Starred";
		}

		return this.species + "(" + this.height + ", " + this.weight + ")" + " with experience " + this.experience + " - " + favorite;

	}



	//contructor
	public Pokemon(int id, String species, int species_id, int height, int weight, int experience, int order, int favorite) {
		this.id = id;
		this.species = species;
		this.species_id = species_id;
		this.height = height;
		this.weight = weight;
		this.experience = experience;
		this.order = order;

		if(favorite == 1){
			this.favorite = true;
		} 
		else{
			this.favorite = false;
		}
	}

	




}


