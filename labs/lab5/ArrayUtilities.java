/*
	A class with utility methods for manipulating one and two dimensional
	arrays of characters.
	@author Janet Fang
*/
public class ArrayUtilities {

	/*
		Reverses the characters in the array original in place.
		No new arrays may be created.
		Returns the reference to the array original with
		characters reversed.
		Example input: ['a', 'b', 'c', 'd']
		Example output: ['d', 'c', 'b', 'a']
	*/
	public static char[] reverse(char[] original) {
		//array is empty or only has 1 element
		if(original == null || original.length < 2){
			return original;
		}

		//otherwise:
		for(int i = 0; i < original.length/2; i++){
			//create a hold variable that holds first while moving last to position
			char hold = original[i]; //swaps numbers 
			original[i] = original[original.length-1-i];
			original[original.length-1-i] = hold;
		}
		return original;
	}


	/*
		Converts a two dimensional array of char to a one 
		dimensional array of char. This method may assume
		that all subarrays of the original are of the same
		length.
		Returns the one dimensional array.
		Example input: 
		[['a', 'b', 'c']
		 ['e', 'd', 'f']
		 ['i', 'h', 'g']]
		 Example output:
		 ['a', 'b', 'c', 'e', 'd', 'f', 'i', 'h', 'g']
	 */
	public static char[] to1D(char[][] original) {
		//new array for the output
		char[] output = new char[original.length*original[0].length];
		char index = 0;
		//go through each row
		for(int i = 0; i < original.length; i++){
			for(int j = 0; j < original[i].length; j++){
				output[index] = original[i][j];
				index++;
			}
		}
		return output;
	}

	/*
		Finds the char with the smallest value in each row
		of the original and returns an array containing the 
		values found. The result at position [0] will be the
		smallest valued char in row 0 of original.
		This method does NOT assume that all subarrays of the
		original are of the same length.
		Example input:
		[['e', 'c', 'f', 'g', 'c', 'e']
		 ['b', 'b', 'b', 'b']
		 ['a', 'd']
		 ['d', 'c', 'b']]
		Example output:
		['c', 'b', 'a', 'b']
	*/
	
	public static char[] smallestPerRow(char[][] original) {
		//create new array
		char[] output = new char[original.length];
		//loop through each row 
		for(int i = 0; i < original.length; i++){
			int minI = 0;
			int minJ = 0;
			for(int j = 0; j < original[i].length; j++){
				//in each row, find the smallest value
				if(original[i][j] < original[minI][minJ]){
					minI = i;
					minJ = j;
				}
				output[i] = original[minI][minJ];
			}
		}
		//returns array of smallest values
		return output;
	}

}
