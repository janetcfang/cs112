/*

	Publication base class
	@author Janet Fang

*/
//abstract class, comparable
public abstract class Publication implements Comparable<Publication>{

	//data members are protected so they are accesible 
	protected String title;
	protected int numOfPages;


	//constructor
	public Publication(String title, int numOfPages) {
		this.title = title;
		this.numOfPages = numOfPages;
	}

	//getters
	public String getTitle() {
		return this.title;
	}
	
	public int getNumOfPages() {
		return this.numOfPages;
	}

	//toString method
	public String toString(){
		return "Title: " + title + " Number of Pages: " + numOfPages;
	}


	//compare Publication objects by numOfPages
	public int compareTo(Publication other){

		int difference = this.numOfPages - other.getNumOfPages();

		if(difference == 0){
			return 0;
		} else if(difference > 0){
			return 1;
		} else{
			return -1;
		}

	}



}
