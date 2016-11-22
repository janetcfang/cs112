/*

	NumberPrinter class
	@author Janet Fang

*/

public class NumberPrinter{
	
	public static void printRow(int n) {
		printRow(n, 0);
	}


	private static void printRow(int n, int count) {

		if(count == n) {
			System.out.println(n);
			return;
		}

		System.out.print(count + " ");
		printRow(n, count+1);

	}


	public static void printNums(int n) {

		printNums(n,0);

	}

	private static void printNums(int n, int count) {

		printRow(count);

		if (count == n){
			return;
		}

		printNums(n, count+1);
		printRow(count);


	}


	public static void main(String[] args){

		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); 
		}
		
		int n = Integer.parseInt(args[0]);
		printNums(n);


	}
}
