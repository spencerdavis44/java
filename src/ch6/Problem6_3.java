package ch6;
import java.util.Scanner;
/*
 * Palindrome integer. Write the methods with the following headers:
 *
 * public static int reverse(int number)
 *
 * public static boolean isPalindrome(int number)
 */

public class Problem6_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();

		if (isPalindrome(integer) == true){
			System.out.println("It is true that " + integer + " is a palindrome. ");
		} else {
			System.out.println("Unfortunately, " + integer + " is not a palindrome.");
		}

	}

	//return the reversal of an integer, i.e. reverse(456) returns 654
	public static int reverse(int number){
		int reversedNumber = 0;
		while (number != 0){
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;

			number /= 10;
		}
		return reversedNumber;
	}


	//return true if number is a palindrome
	public static boolean isPalindrome(int number){
		if (reverse(number) == number){
			return true;
		} else {
			return false;
		}

	}

}
