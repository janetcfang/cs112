/* 
	Class to calculate value of coins in a jar.
*/
public class CoinValues{
	public static void main(String[] args){

		//declare values of each type of coin 
		double PENNY = .01; //type = double, constants, constants - all upper case letters, can put 'final' before double
		double NICKLE = .05;
		double DIME = .10;
		double QUARTER = .25;

		//declare variables to hold count of each type of coin in jar
		int pennyCount = 10;
		int nickleCount = 5;
		int dimeCount = 20;
		int quarterCount = 3;

		//calculate total value of the coins
		double sum; //this var will hold the result
		sum = (PENNY * pennyCount) + 
				(NICKLE * nickleCount) + 
				(DIME * dimeCount) + 
				(QUARTER * quarterCount);



		//display the result
		System.out.println("Coin Value: " + sum);

	}

}
