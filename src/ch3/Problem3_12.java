package ch3;
import java.util.Scanner;
/*
 * Palindrome number
 */
public class Problem3_12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");

		int number = input.nextInt();
		int originalNumber = number;
		int number1 = number / 100;
		number = number % 100;
		int number2 = number / 10;
		int number3 = number % 10;

		if (number1 == number3){
			System.out.println(originalNumber + " is a palindrome");
		} else {
			System.out.println(originalNumber + " is not a palindrome");
		}

	}
}
