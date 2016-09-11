import java.util.ArrayList;

public class ArrayListExample{

	public static void main(String[] args){

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		/*
		numbers.add(4);
		numbers.add(8);
		*/ 
		// OR:
		
		int num1 = 4;
		int num2 = 8;

		numbers.add(num1);
		numbers.add(num2);

		//int value = numbers.get(0);
		//System.out.println(value); 

		//if(numbers.contains(num1)){
			//System.out.println(num1 + " in the list");
		//}

		//numbers.set(0, 100);

		System.out.println(numbers.indexOf(num2));



		



	}



}

/* NAME EXAMPLE--
	
	Name n1 = new Name("Bob", "Smith");
	Name n2 = new Name("Bob", "Smith");

	ArrayList<Name> names = new ArrayList<Name>();

	names.add(n1);
	names.add(n2);

	for(Name name: names){
		//System.out.println(name.toString()); SAME AS NEXT LINE
		System.out.println(name);
	}

	n1.setLast("Jones");
	System.out.println("*****************");

	for Name name: names){
		System.out.println(name);
	}

*/





/* LOOPS EXAMPLES--
		ArrayList<String> words = new ArrayList<String>();

		words.add("hello");
		words.add("goodbye");

		//for loop:
		for(int i = 0; i < words.size(); i++){ //size() is a method
			String word = words.get(i);
			System.out.println(word);
		}


		//for each loop: (gives same result as for loop)
		for(String word: words){
			System.out.println(word);
		}
		*/







/*
	array list to hold pokemon:
		ArrayList<Pokemon> words = new ArrayList<Pokemon>(); //change words list
*/ 
