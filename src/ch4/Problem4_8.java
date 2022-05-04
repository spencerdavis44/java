package ch4;
import java.util.Scanner;
/*
 * Find the character of an ASCII code
 */
public class Problem4_8 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code (integer between 0 and 127): ");
		int asciiCode = input.nextInt();

		//int value = (int)asciiCode;
		System.out.println("The character for ASCII code " + asciiCode + " is " + (char)asciiCode);


	}
}
