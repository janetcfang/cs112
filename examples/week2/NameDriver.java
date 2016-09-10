public class NameDriver{
	
	public static void main(String[] args){

		Name n1 = new Name("Bob", "Smith"); //type Name, var n1, evoke constructor = new Name (Name = name of constructor)
		//System.out.println(n1.toString());

		Name n2 = new Name("Sally", "Jones");
		//String n2String = n2.toString(); //gives same result as example above
		//System.out.println(n2String); //same result

		//equal/diff example
		if (n1.equals(n2)){
			System.out.println("EQUAL");
		}
		else{
			System.out.println("DIFFERENT");
		}

	}
}

/* Example 1 to change last name:

	Name n1 new Name("Bob", "Smith");
	String n1FirstName = n1.getFirst(); //name of object.name of method
	String n1LastName = n1.getLast(); 
	System.out.println("First: " + n1FirstName + "Last: " + n1LastName);

	//n1LastName = n1.setLast("Jones") -- wont work bc cant put a void into a String
	n1.setLast("Jones"); //new last name
	//n1LastName = n1.getLast(); -- will work bc can set to var AFTER setting last name


	//System.out.println("First: " + n1FirstName + "Last: " + n1LastName); -- will still see Bob Smith

	System.out.print.ln(n1.toString()); //will show new last name bc toString will take new values (last name)


	Example 2 to have anonymous: 
		



*/
