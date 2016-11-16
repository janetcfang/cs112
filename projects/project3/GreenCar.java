/*

	GreenCar subclass
	@author Janet Fang 

*/
public class GreenCar extends Car{

	//data member
	private String fuelType;

	//constructor
	public GreenCar(String model, String vehicleClass, int pollutionScore, String fuelType){
		super(model, vehicleClass, pollutionScore);
		this.fuelType = fuelType;
	}

	//getters
	public String getFuelType(){
		return this.fuelType;
	}

}
