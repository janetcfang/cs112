/*

	Base Class: Car
	@author Janet Fang

*/
//implement a base class Car - cannot be instantiated (abstract class)
public abstract class Car implements Comparable<Car>{

	// A Car must have at least the following properties: 
	// model (column Model), vehicleClass (column Veh Class), and pollutionScore (column Air Pollution Score).
	protected String model;
	protected String vehicleClass;
	protected int pollutionScore;

	// constructor
	public Car(String model, String vehicleClass, int pollutionScore) {
		this.model = model;
		this.vehicleClass = vehicleClass;
		this.pollutionScore = pollutionScore; 
	}

	// getters
	public String getModel(){
		return this.model;
	}

	public String getVehicleClass(){
		return this.vehicleClass;
	}

	public int getPollutionScore(){
		return this.pollutionScore;
	}

	// Car must also be Comparable. 
	// Car objects are sorted first by pollution score. 
	// If two Car objects have the same pollution score then they will be sorted by model.
	
	public int compareTo(Car other){

		int difference = this.pollutionScore - other.getPollutionScore();

		if(difference == 0){
			return this.model.compareTo(other.getModel()); 
		} else if(difference > 0){
			return 1;
		} else{
			return -1;
		}
	}

}
