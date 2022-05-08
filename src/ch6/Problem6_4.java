package ch6;
import java.util.Scanner;
/*
 * Display an integer reversed: Write a method with the following header to display an integer in reverse order:
 * public static void reverse(int number)
 */
public class Problem6_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		System.out.println("The integer that you entered " + integer + " reversed is " + reverse(integer));
	}
	
	public static int reverse(int number){
		int reversedNumber = 0;
		while (number != 0){
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;

			number /= 10;
		}
		return reversedNumber;
	}

}
