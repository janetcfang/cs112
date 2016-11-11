/*

	GasCar subclass
	@author Janet Fang 

*/
public class GasCar extends Car{

	//data members
	private int numberCylinders;
	private int mpg;  

	//constuctor
	public GasCar(String model, String vehicleClass, int pollutionScore, int numberCylinders, int mpg){
		super(model, vehicleClass, pollutionScore);
		this.numberCylinders = numberCylinders;
		this.mpg = mpg;
	}

	//getters
	public int getNumberCylinders(){
		return this.numberCylinders;
	}

	public int getMpg(){
		return this.mpg;
	}

}
