package ch4;
import java.util.Scanner;
/*
 * Check SSN: Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is the digit.
 * Your program should check whether the input is valid.
 */
public class Problem4_21 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN: ");
		String ssn = input.next();

		char firstDash = ssn.charAt(3);
		char secondDash = ssn.charAt(6);

		if (firstDash != '-'){
			System.out.println(ssn + " is an invalid social security number");
			System.exit(0);
		} else if (secondDash != '-'){
			System.out.println(ssn + " is an invalid social security number");
			System.exit(0);
		} else {
			System.out.println(ssn + " is a valid social security number");
		}
	}
}
