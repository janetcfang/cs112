/*
	Book subclass
	@author Janet Fang
*/
public class Book extends Publication{

	private boolean cover;

	//constructor
	public Book(String title, int numOfPages, boolean cover){
		super(title, numOfPages);
		this.cover = cover;
	}

	//getters
	public boolean getCover(){
		return this.cover;
	}

	//toString
	public String toString(){

		String coverType = "";

		if(cover){
			coverType = "Hard Cover";
		} else{
			coverType = "Soft Cover";
		}

		return super.toString() + " Cover: " + coverType;
	}

}
