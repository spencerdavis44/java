package ch4;
import java.util.Scanner;
/*
 * Process a string
 */
public class Problem4_20 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String enteredString = input.next();


		char firstCharacter = enteredString.charAt(0);
		int stringLength = enteredString.length();

		System.out.println("The length of the string you entered is " + stringLength + " and the first character is " + firstCharacter);
	}
}
