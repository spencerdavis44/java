package ch5;
/*
 * Display numbers in a pyramid pattern
 */

public class Problem5_19 {
	public static void main(String[] args){

		int number = 0;

		for (int i = 0; i <= 7; i++) {

		//used for spacing. Centering the pyramid

		 for (int j = 1; j <= (8 - i); j++) {
		  System.out.printf("%4s", " ");
		 }


			for (int j = 0; j <= i; j++) {
				number = (int) (Math.pow(2, j));
				System.out.printf("%4d", number);
			  //System.out.printf("%3d", j);
			 }


		 for (int j = i - 1; j >= 0; j--) {
			 number = (int) (Math.pow(2, j));
		  System.out.printf("%4d", number);
		 }

		 System.out.println();

		}
	}
}
