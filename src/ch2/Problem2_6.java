package ch2;
import java.util.Scanner;
/*
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer
 * is 932, the sum of all digits is 14.
 */

public class Problem2_6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int number = input.nextInt();

		int firstDigit = number % 10;
		int firstNumber = number / 10;

		int secondDigit = firstNumber % 10;
		int secondNumber = firstNumber / 10;

		int thirdDigit = secondNumber % 10;
		int thirdNumber = secondNumber / 10;

		System.out.println(firstDigit + secondDigit + thirdDigit + thirdNumber);
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
	}
}
