package ch4;
import java.util.Scanner;
/*
 * Phone key pads
 */
public class Problem4_15 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		String response = "";

		if (Character.toLowerCase(letter) == 'a' || Character.toUpperCase(letter) == 'A' || Character.toLowerCase(letter) == 'b' || Character.toUpperCase(letter) == 'B' || Character.toLowerCase(letter) == 'c' || Character.toUpperCase(letter) == 'C'){
			response = "The corresponding number is 2";
		}
		else if (Character.toLowerCase(letter) == 'd' || Character.toUpperCase(letter) == 'D' || Character.toLowerCase(letter) == 'e' || Character.toUpperCase(letter) == 'E' || Character.toLowerCase(letter) == 'f' || Character.toUpperCase(letter) == 'F'){
			response = "The corresponding number is 3";
		}
		else if (Character.toLowerCase(letter) == 'g' || Character.toUpperCase(letter) == 'G' || Character.toLowerCase(letter) == 'h' || Character.toUpperCase(letter) == 'H' || Character.toLowerCase(letter) == 'i' || Character.toUpperCase(letter) == 'I'){
			response = "The corresponding number is 4";
		}
		else if (Character.toLowerCase(letter) == 'j' || Character.toUpperCase(letter) == 'J' || Character.toLowerCase(letter) == 'k' || Character.toUpperCase(letter) == 'K' || Character.toLowerCase(letter) == 'l' || Character.toUpperCase(letter) == 'L'){
			response = "The corresponding number is 5";
		}
		else if (Character.toLowerCase(letter) == 'm' || Character.toUpperCase(letter) == 'M' || Character.toLowerCase(letter) == 'n' || Character.toUpperCase(letter) == 'N' || Character.toLowerCase(letter) == 'o' || Character.toUpperCase(letter) == 'O'){
			response = "The corresponding number is 6";
		}
		else if (Character.toLowerCase(letter) == 'p' || Character.toUpperCase(letter) == 'P' || Character.toLowerCase(letter) == 'q' || Character.toUpperCase(letter) == 'Q' || Character.toLowerCase(letter) == 'r' || Character.toUpperCase(letter) == 'R' || Character.toLowerCase(letter) == 's' || Character.toUpperCase(letter) == 'S'){
			response = "The corresponding number is 7";
		}
		else if (Character.toLowerCase(letter) == 't' || Character.toUpperCase(letter) == 'T' || Character.toLowerCase(letter) == 'u' || Character.toUpperCase(letter) == 'U' || Character.toLowerCase(letter) == 'v' || Character.toUpperCase(letter) == 'V'){
			response = "The corresponding number is 8";
		}
		else if (Character.toLowerCase(letter) == 'w' || Character.toUpperCase(letter) == 'W' || Character.toLowerCase(letter) == 'x' || Character.toUpperCase(letter) == 'X' || Character.toLowerCase(letter) == 'y' || Character.toUpperCase(letter) == 'Y' || Character.toLowerCase(letter) == 'z' || Character.toUpperCase(letter) == 'Z'){
			response = "The corresponding number is 9";
		}
		else {
			response = letter + " is an invalid input";
		}
		System.out.println(response);
	}
}
