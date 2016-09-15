/*

	Assignment is to create show 3 Pokemon -- their species, experience, and whether or not they are favorited.

	@author Janet Fang

*/
public class Pokemon{
	private String species; //name (Eevee)
	private int experience; //base experience points (200)
	private boolean favorite; //starred as favorite isStarred (T/F)


	//getters
	public String getSpecies() {
		return this.species;
	}

	public int getExperience() {
		return this.experience;
	}

	public boolean getFavorite() {
		return this.favorite;
	}


	//setters
	public void setSpecies(String species) { 
		this.species = species;
	}

	public void setExperience(int experience) { 
		this.experience = experience;
	}

	public void setFavorite(boolean favorite) { 
		this.favorite = favorite;
	}

	//toString method
	public String toString() {

		String favorite;

		if (this.favorite==true) {
			favorite = "Starred";
		}
		else{
			favorite = "Not Starred";
		}

		return this.species + " with Experience " + this.experience + " - " + favorite;

	}


	//constructor 1: takes as input name, experience, and favorite
	public Pokemon(String species, int experience, boolean favorite) {
		this.species = species;
		this.experience = experience;
		this.favorite = favorite;
	}

	//constructor 2: takes as input name and experience and sets favorite to be a default value
	public Pokemon(String species, int experience) {
		this.species = species;
		this.experience = experience;
		this.favorite = false;
	}



}
