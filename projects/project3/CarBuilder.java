/*

	CarBuilder class
	@author Janet Fang

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarBuilder{

	public CarList buildCarList(String filename) {

		//create list to be returned
		CarList list = new CarList();

		//open the file
		File inputFile = new File(filename);

		//read in each line of file
		try(Scanner input = new Scanner(inputFile)) {
			String skip = input.nextLine();
			while(input.hasNextLine()) {
				String str = input.nextLine();
				String[] temp = str.split(",");
				
				if(temp[5].contains("Gas") || temp[5].contains("Diesel") || temp[5].contains("Ethanol")){
					if(temp[14].contains("/")){
						String[] mpg = temp[14].split("/");
						temp[14] = mpg[0];
					}
					GasCar newCar = new GasCar(temp[0], temp[10], Integer.parseInt(temp[11]), Integer.parseInt(temp[2]), Integer.parseInt(temp[14]));
					list.addCar(newCar);
				} else {
					GreenCar newCar = new GreenCar(temp[0], temp[10], Integer.parseInt(temp[11]), temp[5]);
					list.addCar(newCar);
				}
			}


		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
            System.out.println(fnf.getMessage());
            System.exit(1);

		}
		return list;
	}


}
