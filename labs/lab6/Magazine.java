/*

	Magazine subclass
	@author Janet Fang

*/
public class Magazine extends Publication{

	private int subscribers;

	//constructor
	public Magazine(String title, int numOfPages, int subscribers){
		super(title, numOfPages);
		this.subscribers = subscribers;
	}

	//getters
	public int getSubscribers(){
		return this.subscribers;
	}

	//toString
	public String toString(){

		return super.toString() + " Subscribers: " + subscribers;
	}


}
