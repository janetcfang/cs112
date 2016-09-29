/*
	A class providing ArrayList-like functionality for a list of String objects.
	@author Janet Fang
*/

public class StringList {

	//declare data members to hold an array of strings and an
	//int to keep track of the number of items in the list
	private String[] items;
	private int count;

	/*
		A constructor that takes no input and instantiates a new
		String[] of size 10.
	*/
	public StringList() {
		items = new String[10];
		count = 0; 
	}

	/*
		A constructor that takes a size and instantiates a new
		String[] of size size.
	*/
	public StringList(int size) {
		items = new String[size];
		count = 0;
	}

	//RESIZE method
	private void resize(){
		//if all slots filled, resize, move all exisitng # down 1 slot, items[0] = newItems, count++
		String[] newArray = new String[items.length*2];
		for(int i = 0; i < items.length; i++){
			newArray[i] = items[i];
		}
		items = newArray;
	}

	/*
		Adds the new item s to the end of the array 
		and returns true. In case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to 
		the new array.
	*/
	public boolean add(String s)  {
		//check to see if array is full first
		//if full, call on resize
		if(count >= items.length){
			resize();
		}

		//not full: add item s to end of the array
		items[count] = s;
		count++;

		return true;
	}
	
	/*
		Adds the new item to the array at the location 
		specified by index, in case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to the
		new array.
	*/
	public void add(int index, String s) {
		if(index>count){
			throw new IndexOutOfBoundsException("Index Out of Bounds");
		}

		if(count >= items.length){
			resize();
		}

		String last = items[count-1]; //save last element in array
		
		for(int i = count-1; i>=index; i--){
			items[i+1] = items[i];
		}
		items[count] = last;
		items[index] = s;
		count++;

	}

	/*
		Returns true if the array contains the string s
		and false otherwise.
	*/
	public boolean contains(String s) {
		for(int i = 0; i < count; i++){
			if(items[i]==(s)){ //CHANGED .EQUALS
				return true;
			}	
		}
		return false;
	}

	/*
		Returns true if there are no elements in the array
		and false otherwise.
	*/
	public boolean isEmpty() {
		return(count==0);
	}

	/*
		Returns the number of elements in the array. Note this
		is not the total number of spaces in the array, but 
		the total number of valid elements.
	*/
	public int size() {
		return count;
	}

	/*
		Returns the first index of the given String,
		or -1 if not found.
	*/
	public int indexOf(String s) {
		for(int i = 0; i < count; i++){
			if(items[i]==(s)){ //CHANGED .EQUALS
				return i;
			}	
		}
		return -1; //not found
	}

	/*
		Returns the last index of the given String, 
		or -1 if not found.
	*/
	public int lastIndexOf(String s) {
		for(int i = count-1; i > 0; i--){
			if(items[i]==(s)){ //CHANGED .EQUALS
				return i;
			}	
		}
		return -1; //not found
	}

	/*
		Returns the String at the given index, 
		may throw IndexOutOfBounds exception.
	*/
	public String get(int index) {
		if(index>count-1){
			throw new IndexOutOfBoundsException("Index Out of Bounds");
		}
		return items[index];
	}

	/*
		Replaces the element at index with the given string. 
		May throw IndexOutOfBounds exception.
		Returns the item replaced.
	*/	
	public String set(int index, String s) {
		if(index>count-1){
			throw new IndexOutOfBoundsException("Index Out of Bounds");
		}

		String temp = items[index]; //save original item
		items[index] = s; //replace item
		return temp; //return item replaced
	}

	/*
		Removes the item at the given index and returns it.
		May throw IndexOutOfBounds exception.
	*/
	public String remove(int index) {
		if(index>count-1){
			throw new IndexOutOfBoundsException("Index Out of Bounds");
		}

		String temp = items[index];
		for(int i = index; i < count; i++){
			items[i] = items[i+1];
		}
		count--;
		return temp;

	}

	/*
		Removes the given item, returns true if successful
		and false otherwise.
	*/
	public boolean remove(String s) {
		int index = indexOf(s); //call the indexOf method 
		if(index != -1){
			remove(index);
			return true;
		}
		else{
			return false;
		}
	}

	/*
		Returns a string representation of the array.
		Following is an example of the expected format:
		{A, B, C, D, E}
	*/
	public String toString() {

		String returnValue = "";

		if(isEmpty()){
			return "{}";
		}
		else{
		returnValue = "{";
			returnValue += items[0];
			for(int i = 1; i < count; i ++){
				returnValue += ", " + items[i];
			}
		returnValue += "}";
		}
		return returnValue;
	} 

}
