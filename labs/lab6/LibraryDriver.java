/*

	Driver for Publication
	@author Janet Fang

*/
import java.util.ArrayList;
import java.util.Collections;

public class LibraryDriver{
	public static void main(String[] args){

		//ArrayList of at least 5 publication objects (some book and some magazine)
		ArrayList<Publication> publications = new ArrayList<Publication>(6);

		//Collections.sort to sort publications
		publications.add(new Book("Harry Potter", 412, true));
		publications.add(new Magazine("Life Magazine", 12, 1235));
		publications.add(new Book("Lord of the Rings", 159, false));
		publications.add(new Magazine("National Geographic", 50, 100));
		publications.add(new Book("1984", 111, true));
		publications.add(new Magazine("Time Magazine", 10, 10));


		Collections.sort(publications);

		//print results
		for(Publication pub: publications){
			System.out.println(pub);
		}


	}
}
