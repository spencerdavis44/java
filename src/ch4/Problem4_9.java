package ch4;
import java.util.Scanner;
/*
 * Find the unicode of a character
 */
public class Problem4_9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String value = input.next();

		System.out.println("The unicode for the character E is " + (int)value.charAt(0));
	}
}
