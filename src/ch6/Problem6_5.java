package ch6;
import java.util.Scanner;
/*
 * Write a method with the following header to display three numbers in increasing order:
 * 
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * 
 * Write a test program that prompts the user to enter three numebrs and invokes the method to display the, in increasing order
 */

public class Problem6_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		/*double number1 = num1;
		double number2 = num2;
		double number3 = num3;
		double temp = 0;
		
		if (number3 < number2){
			temp = number2;
			number2 = number3;
			number3 = temp;
			if (number2 < number1){
				temp = number1;
				number1 = number2;
				number1 = temp;
			}
		}
		System.out.println("The sorted numbers are now " + num1 + ", " + num2 + ", " + num3);
		*/
		double number1 = num1;
		double number2 = num2;
		double number3 = num3;

		if(num3 < num1){
			number1 = num3;
			number2 = num1;
			if (num1 < num2){
				number3 = num2;
			}

			if (num3 < num2){
				number2 = num3;
				number3 = num2;
			}

			if ((num1 < num2) && ((num3 < num1))){
				number1 = num3;
				number2 = num1;
				number3 = num2;
			}
			if ((num3 < num1) && ((num2 < num3))){
				number1 = num2;
				number2 = num3;
				number3 = num1;
			}
			if ((num2 < num1) && ((num3 < num2))){
				number1 = num3;
				number2 = num2;
				number3 = num1;
			}
			System.out.println("The three numbers in increasing order are " + number1 + " " + number2 + " " + number3);
			System.exit(0);
		}

		if(num1 < num2){
			number1 = num1;
			number2 = num2;
			if (num2 < num3){
				number3 = num3;
			}

			if (num3 < num1){
				number1 = num3;
				number2 = num1;
				number3 = num2;
			}
			if (num3 < num2){
				number2 = num3;
				number3 = num2;
			}
			if ((num3 < num2) && (num1 < num2)){
				number1 = num1;
				number2 = num3;
				number3 = num2;
			}
			System.out.println("The three numbers in increasing order are " + number1 + " " + number2 + " " + number3);
			System.exit(0);
		}

		if(num2 < num1){
			number1 = num2;
			number2 = num1;
			if (num1 < num3){
				number3 = num3;
			}

			if (num3 < num2){
				number1 = num3;
				number2 = num2;
				number3 = num1;
			}
			if (num3 < num1){
				number2 = num3;
				number3 = num1;
			}
			System.out.println("The three numbers in increasing order are " + number1 + " " + number2 + " " + number3);
			System.exit(0);
		}

		if(num3 < num1){
			number1 = num3;
			number2 = num1;
			if (num1 < num2){
				number3 = num2;
			}
			/*
			if (num3.compareTo(num2) < 0){
				number2 = num3;
				number3 = num2;
			}
			*/
			System.out.println("The three numbers in increasing order are " + number1 + " " + number2 + " " + number3);
			System.exit(0);
		}
	}
}
