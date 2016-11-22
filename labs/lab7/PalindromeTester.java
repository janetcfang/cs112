/*

	PalinedromeTester-- Implement a class PalindromeTester. 
	It will be run as follows: java PalindromeTester <word>, for example java PalindromeTester racecar.

	@author Janet Fang

*/
public class PalindromeTester{
	/*
		The class must have a recursive method public static boolean isPalindrome(String word). The method 
		takes as input a word and returns true if it is a palindrome and false otherwise. 
		The method will be called from main and may not use any loops.
		The method will print an appropriate usage message and exit if the parameter is not provided.
	*/
	public static boolean isPalindrome(String word){

		if(word.length() == 0){
			return false;
		} else if(word.length() <= 2){
			return (word.charAt(0) == word.charAt(word.length()-1));
		} else if(word.charAt(0) == word.charAt(word.length()-1)){
			return isPalindrome(word.substring(1, word.length()-1));
		} else{
			return false;
		}
	}

	//main method -- print the word and whether it is or is not a palindrome 
	//for example, racecar is a palindrome or computer is not a palindrome.
	public static void main(String[] args){

		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); 
		}
		
		String word = args[0];


		if(isPalindrome(word)){ 
			System.out.println(word + " is a palindrome.");
		} else{ 
			System.out.println(word + " is not a palindrome.");
		}


	}
}
