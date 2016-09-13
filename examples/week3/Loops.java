public class Loops{
	
	public static void main(String[] args){
		/*
		final int MAX = 5;
 
		for(int i = 0; i < MAX; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(j); //print not println
			}
			System.out.println();
		}
		*/

		//Reverse example:
		final int MAX = 5;

		for(int i = MAX; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(j);
			}
			System.out.println();
		}






		/*FOR LOOP:
		int sum = 0;

		for(int i = 0; i < 20; i++){ //initialization of control var (control var = i)
			sum += i;
		}
		
		System.out.println("sum: " + sum);
		*/

		/* to make i even:

		int sum = 0;
 
		for(int i = 0; i < 20; i = i +2){ //this option is better
			sum += i;
		}
		
		System.out.println("sum: " + sum);
		
		OR

		int sum = 0;

		for(int i = 0; i < 20; i++){ 
			if(i % 2 == 0){
				sum += i;
			}
		}
		
		System.out.println("sum: " + sum);
	
		*/


		/* WHILE LOOP:

		int sum = 0;

		int i = 0;
		while(i < 20){
			sum += i;
			i++;
		}

		System.out.println("sum: " + sum);
		*/


		/* BOOLEAN EXAMPLE:
		int sum = 0;
		int i = 0;

		boolean controlVariable = true;
		while(controlVariable){
			//esecute some code
			//update control variable

			if(controlVariable == false){
				break;
			}
		}
		System.out.println("sum: " + sum);
		*/

		/* DO WHILE LOOP:
		int sum = 0;
		int i = 0;

		boolean controlVariable = true;

		do{

			//execute some code
			//update control variable 

		} while(controlVariable);

		*/


	}


}
