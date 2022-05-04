package ch4;
import java.util.Scanner;
/*
 * Convert letter grade to number
 */
public class Problem4_14 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		char letter = input.next().charAt(0);

		int returnedNumber = 0;

		if (letter == 'A'){
			returnedNumber = 4;
			System.out.println("The numeric value for grade " + letter + " is " + returnedNumber);
			System.exit(1);
		} else if (letter == 'B'){
			returnedNumber = 3;
			System.out.println("The numeric value for grade " + letter + " is " + returnedNumber);
			System.exit(1);
		} else if (letter == 'C'){
			returnedNumber = 2;
			System.out.println("The numeric value for grade " + letter + " is " + returnedNumber);
			System.exit(1);
		} else if (letter == 'D'){
			returnedNumber = 1;
			System.out.println("The numeric value for grade " + letter + " is " + returnedNumber);
			System.exit(1);
		} else if (letter == 'F'){
			returnedNumber = 0;
			System.out.println("The numeric value for grade " + letter + " is " + returnedNumber);
			System.exit(1);
		} else {
			System.out.println(letter + " is an invalid grade.");
		}
	}
}
