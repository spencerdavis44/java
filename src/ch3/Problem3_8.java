package ch3;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter three integers and display the inteers in a non-decreasing order.
 */
public class Problem3_8 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		int tempNumber;
		if (number1 > number2) {
			tempNumber = number2;
			number2 = number1;
			number1 = tempNumber;
		}
	/*	if (number3 > number2){
			tempNumber = number2;
			number2 = number3;
			number3 = tempNumber;
		}
		*/
		if (number3 < number1){
			tempNumber = number1;
			number1 = number3;
			number3 = number2;
			number2 = tempNumber;
		}
		if (number3 < number2){
			tempNumber = number2;
			number2 = number3;
			number3 = tempNumber;
		}

		System.out.println(number1 + ", " + number2 + ", " + number3);
	}
}
