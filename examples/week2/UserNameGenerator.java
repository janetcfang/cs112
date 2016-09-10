/*
	A class to generate a user login name given a user's first name, last name, and middle initial.
*/
import java.util.Random;

public class UserNameGenerator {

/*
	Creates a username from the given Name.
	The username is the first two characters of the first name,
	followed by the middle initial, followed by the first five 
	characters of the last name, followed by a random number from
	0 to 100.
	The username returned should be all lower case letters.
*/	
	public String generateUserName(Name2 name){

		String first = name.getFirst();
		char middle = name.getMiddle();
		String last = name.getLast();


		String firstPart = first.substring(0,2);

		String lastPart = null;
		//length of last >= 5
		if (last.length() >= 5){
			lastPart = last.substring(0, 5);
		}
		else{
			lastPart = last;
		}

		//gets random number from 0 to 100
		Random r = new Random();
		int randomNumber = r.nextInt(100);


		//bojsmith35
		String result = firstPart + middle + lastPart + randomNumber;
		result = result.toLowerCase();
		return result;



	}



}
