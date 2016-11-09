/* 

	CarList class
	@author Janet Fang

*/
import java.util.Arrays;

public class CarList{

	//data members
	private Car[] myCars;
	private int myCount;

	//constructor
	public CarList(){
		myCars = new Car[10];
		myCount = 0;
	}

	//resize method
	private void resize(){
		Car[] temp = new Car[myCars.length*2];
		for(int i = 0; i < myCars.length; i++){
			temp[i] = myCars[i];
		}
		myCars = temp;
	}

	/*
		addCar - this method takes as input a Car and 
		inserts it into the array in sorted order. 
		If the array is full it will be resized to accommodate a new item.
	*/

	public void addCar(Car newCar){

		//check to see if it's full, resize
		if(myCars.length == myCount){
			resize();
		}

		for(int i = 0; i < myCount; i++){
			if(newCar.compareTo(myCars[i]) < 1){
				for(int j = myCount-1; j >= i; j--){
					myCars[j+1] = myCars[j];
				}
				myCars[i] = newCar;
				myCount++;
				return;
			}
		}
		myCars[myCount] = newCar;
		myCount++;
	}

	//toString method
	public String toString(){

		String str = "";

		for(int i = 0; i < myCount; i++){
			if(myCars[i] instanceof GasCar){
				str += ("Model: " + myCars[i].getModel() + " Class: " + myCars[i].getVehicleClass() + " Pollution Score: " 
					+ myCars[i].getPollutionScore() + " MPG: " + ((GasCar)myCars[i]).getMpg() + " Cylinders: " + ((GasCar)myCars[i]).getNumberCylinders() + "\n");
			} else{
				str += ("Model: " + myCars[i].getModel() + " Class: " + myCars[i].getVehicleClass() + " Pollution Score: " 
					+ myCars[i].getPollutionScore() + " Fuel Type: " + ((GreenCar)myCars[i]).getFuelType() + "\n");
			}
		}
		return str;
	}

	//GreenCar toString method
	public String toStringGreenCars(){

		String str = "";

		for(int i = 0; i < myCount; i++){
			if(myCars[i] instanceof GreenCar){
				str += ("Model: " + myCars[i].getModel() + " Fuel Type: " + ((GreenCar)myCars[i]).getFuelType() + "\n");
			}
		}
		return str;
	}


	//avgMpg method -- takes no parameters and returns the average MPG across all GasCar objects.
	public double avgMpg(){
		double sum = 0;
		int size = 0;

		for(int i = 0; i < myCount; i++){
			if(myCars[i] instanceof GasCar){
				sum += ((GasCar)myCars[i]).getMpg();
				size ++;
			}
		}

		if(size > 0){
			return (sum/size);
		} else{
			return 0;
		}
	}

	/* 	
		avgMpgByPartialModel method- takes as input a String with a partial model (for example, "Subaru") 
	 	and returns the average MPG for all cars with a model containing the partial model query String. 
		You may use the String contains method in your solution for this method.
	*/
	public double avgMpgByPartialModel(String model){
		double sum = 0;
		int size = 0;

		for(int i = 0; i < myCount; i++){
			if(myCars[i].getModel().contains(model) && myCars[i] instanceof GasCar){
				sum += ((GasCar)myCars[i]).getMpg();
				size ++;
			}
		}

		if(size > 0){
			return (sum/size);
		} else{
			return 0;
		}

	}
 
	/* findClassesByCylinders - takes as input an int specifying number of cylinders and returns a String[] 
		containing the vehicle classes with models that have the specified number of cylinders. For full credit, the String[] will 
		have no repeated elements (each class will only appear once) and the length must be large enough to accommodate only the 
		number of valid elements.
	*/
	public String[] findClassesByCylinders(int numCyl){
		String str = "";

		for(int i = 0; i < myCount; i++){
			if(myCars[i] instanceof GasCar && ((GasCar)myCars[i]).getNumberCylinders() == numCyl){
				if(!str.contains(myCars[i].getVehicleClass())){
					str += myCars[i].getVehicleClass() + ",";
				}
			}
		}
                String[] temp = str.split(",");
                Arrays.sort(temp);
		return temp;
	}

	/* 
		findModelsByClassAndMpg - takes as input a target vehicle class and a minimum MPG and returns a 
		String[] containing the models of all vehicles of the specified class that have at least the specified combined MPG. 
		The String[] may have repeated elements if the same model appears twice in the dataset, but the the length must be 
		large enough to accommodate only the number of valid elements.
	*/
	public String[] findModelsByClassAndMpg(String targetClass, int minMpg){
		String str = "";

		for(int i = 0; i < myCount; i++){
			if(myCars[i] instanceof GasCar && myCars[i].getVehicleClass().equals(targetClass) && ((GasCar)myCars[i]).getMpg() >= minMpg){
				str += myCars[i].getModel() + ",";
			}
		}
		return str.split(",");
	}

}
