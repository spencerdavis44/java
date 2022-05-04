package ch4;
import java.util.Scanner;
/*
 * Vowel or consonant?
 */
public class Problem4_13 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);


		//char letter = inputLetter.charAt(0);
		//String letter = letter.toletterCase();
		//String letter = letter.toletterCase();

		//System.out.println(letter);
		//System.out.println(letter);

		if (letter == 'A' || letter == 'a' ||  letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u'){
			System.out.println(letter + " is a vowel");
			System.exit(1);
		} else if (letter == 'Q' || letter == 'q' ||  letter == 'W' || letter == 'w' || letter == 'R' || letter == 'r' || letter == 'T' || letter == 't' || letter == 'Y' || letter == 'y' || letter == 'P' || letter == 'p' ||  letter == 'S' || letter == 's' || letter == 'D' || letter == 'd' || letter == 'F' || letter == 'f' || letter == 'G' || letter == 'g' || letter == 'H' || letter == 'h' ||  letter == 'J' || letter == 'j' || letter == 'K' || letter == 'k' || letter == 'L' || letter == 'l' || letter == 'Z' || letter == 'z' || letter == 'X' || letter == 'x' ||  letter == 'C' || letter == 'c' || letter == 'V' || letter == 'v' || letter == 'B' || letter == 'b' || letter == 'N' || letter == 'n' || letter == 'M' || letter == 'm'){
			System.out.println(letter + " is a consonant");
			System.exit(1);
		}
		else if (letter == '~' || letter == '`' || letter == '!' || letter == '@' || letter == '#' || letter == '$' || letter == '%' || letter == '^' || letter == '&' || letter == '*' || letter == '(' || letter == ')' || letter == '-' || letter == '_' || letter == '+' || letter == '=' || letter == '{' || letter == '[' || letter == ']' || letter == '}' || letter == '|' || letter == '\\' || letter == ':' || letter == ';' || letter == '"' || letter == '<' || letter == ',' || letter == '>' || letter == '.' || letter == '1' || letter == '2' || letter == '3' || letter == '4' || letter == '5' || letter == '6' || letter == '7' || letter == '8' || letter == '9' || letter == '0' || letter == '!' || letter == '!' ){
			System.out.println(letter + " is an invalid input");
			System.exit(1);
		}
	}
}
