/*

	CarDBDriver 
	@author Janet Fang

*/
import java.util.Scanner;

public class CarDBDriver{
	public static void main(String[] args){

		//if file name parameter is not present, print an error message and exit the program
		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); 
		}
		
		String inFileName = args[0];

		// Build a CarList object from the file cars.csv.
		CarBuilder builder = new CarBuilder();

		//Invoke the buildCarList method 
		CarList myCarList = builder.buildCarList(inFileName);


		//If the CarList is null (for example, because the file was not found)
		//print an error message and exit the program.
		if(myCarList == null){
			System.out.println("Error: CarList is null.");
			System.exit(0);
		}

		/*
			Print "All Cars:" followed by a newline.
			Print the result of calling toString on the CarList.
		*/
		System.out.println("All Cars:\n" + myCarList.toString());

		/* 
			Print "Green Cars - Fuel Type:" followed by a newline.
			Print the result of calling toStringGreenCars on the CarList.
		*/
		System.out.println("Green Cars - Fuel Type:\n" + myCarList.toStringGreenCars());


		/*
			Print "Average MPG All:" followed by the result of calling 
			avgMpg on the CarList followed by a newline. 
			The result should be displayed with exactly two digits after the decimal point.
		*/
		System.out.printf("Average MPG All: %.2f%n%n", myCarList.avgMpg());


		/* 
			Print "Average MPG Subaru:" followed by the result of calling 
			avgMpgByPartialModel("SUBARU") on the CarList followed by a newline. 
			The result should be displayed with exactly two digits after the decimal point.
		*/
		System.out.printf("Average MPG Subaru: %.2f%n%n", myCarList.avgMpgByPartialModel("SUBARU"));


		/*
			Print "Average MPG Toyota:" followed by the result of calling 
			avgMpgByPartialModel("TOYOTA") on the CarList followed by a newline. 
			The result should be displayed with exactly two digits after the decimal point.
		*/
		System.out.printf("Average MPG Toyota: %.2f%n%n", myCarList.avgMpgByPartialModel("TOYOTA"));

		/* 
			Print "Average MPG Ferrari:" followed by the result of calling 
			avgMpgByPartialModel("FERRARI") on the CarList followed by a newline. 
			The result should be displayed with exactly two digits after the decimal point.
		*/
		System.out.printf("Average MPG Ferrari: %.2f%n%n", myCarList.avgMpgByPartialModel("FERRARI"));

		/*
			Print "Vehicle Classes with 4-Cylinder Cars:" followed by a newline followed by the result of calling 
			findClassesByCylinders(4) on the CarList. 
			For each item in the list returned, print a tab followed by the item followed by a newline.
		*/
		System.out.println("Vehicle Classes with 4-Cylinder Cars:");
		String[] test1 = myCarList.findClassesByCylinders(4);
		for(int i = 0; i < test1.length; i++){
			System.out.println("\t" + test1[i]);
		}

		/* 
			Print "Vehicle Classes with 6-Cylinder Cars:" followed by a newline followed by the result of calling 
			findClassesByCylinders(6) on the CarList. 
			For each item in the list returned, print a tab followed by the item followed by a newline.
		*/
		System.out.println("Vehicle Classes with 6-Cylinder Cars:");
		String[] test2 = myCarList.findClassesByCylinders(6);
		for(int i = 0; i < test2.length; i++){
			System.out.println("\t" + test2[i]);
		}

		/* 	
			Print "Small SUVs with MPG > 22:" followed by a newline followed by the result of calling 
			findModelsByClassAndMpg("small SUV", 22) on the CarList. 
			For each item in the list returned, print a tab followed by the item followed by a newline.
		*/
		System.out.println("Small SUVs with MPG > 22:");
		String[] test3 = myCarList.findModelsByClassAndMpg("small SUV", 22);
		for(int i = 0; i < test3.length; i++){
			System.out.println("\t" + test3[i]);
		}


		/*
			Print "Small Cars with MPG > 35:" followed by a newline followed by the result of calling 
			findModelsByClassAndMpg("small car", 35) on the CarList. 
			For each item in the list returned, print a tab followed by the item followed by a newline.
		*/
		System.out.println("Small Cars with MPG > 35:");
		String[] test4 = myCarList.findModelsByClassAndMpg("small car", 35);
		for(int i = 0; i < test4.length; i++){
			System.out.println("\t" + test4[i]);
		}

	}
}
