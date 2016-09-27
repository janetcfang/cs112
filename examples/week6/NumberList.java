/*


*/
public class NumberList{
	
	//data members
	private int[] numbers;
	private int count;

	//construct an empty list
	public NumberList(){

		numbers = new int[3]; //initialize array
		count = 0;

	}

	private void resize(){
		//if there is NO empty slot, resize, move all exisitng # down 1 slot, number[0] = newNumber, count++
		int[] newArray = new int[numbers.length*2];
		for(int i = 0; i < numbers.length; i++){
			newArray[i] = numbers[i];
		}
		numbers = newArray;
	}

	//insert a number at the beginning of the list. @param - newNumber
	public void addFirst(int newNumber){

		//count, numbers.length = total number of slots
		//if theres an enpty slot, move all existing numbers down one slot, number[0] = newNumber, increment count
		/*if(count < numbers.length){
			for(int i = count; i > 0; i--){
				numbers[i] = numbers[i-1];
			}
		}
			numbers[0] = newNumber;
			count++; */

		//implement resize
		if(count >= numbers.length){
			resize();
		}
		
		for(int i = count; i > 0; i--){
			numbers[i] = numbers[i-1];
		}

		numbers[0] = newNumber;
		count++; 
	}


	//remove the first item in the list, if the list is empty, do nothing
	public void removeFirst(){

		for(int i = 0; i < count-1; i++){
			numbers[i] = numbers[i+1];
		}

		if(count > 0){
		count--;
		}
	}

	//returns true if the list contains any duplicate numbers
	public boolean containsDuplicates(){
		for(int i=0; i < count; i ++){
			for(int j = i+1; j < count; j++){
				if(numbers[i] == numbers[j]){
					return true;
				}
			}
		}
		return false;
	}

	//return a string representation of the list in the format {23, 4, 23, 66,2 }
	public String toString() {

		String returnValue = "";

		for(int i = 0; i < count; i ++){
			returnValue += numbers[i] + " ";
		}

		return returnValue;

	}	
}
