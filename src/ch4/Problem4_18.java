package ch4;
import java.util.Scanner;
/*
 * Student major and status: Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is numer character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior or senior.
 */
public class Problem4_18 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String word = input.next();
		char character1 = word.charAt(0);
		char character2 = word.charAt(1);

		String major = "";
		String studentYear = "";

		if (character1 == 'M'){
			major = "Mathematics";
		} else if (character1 == 'C'){
			major = "Computer Science";
		} else if (character1 == 'I'){
			major = "Information Technology";
		} else if (character1 != 'M' || character1 != 'C' || character1 != 'I'){
			System.out.println("Invalid input");
			System.exit(0);
		}

		if(character2 == '1'){
			studentYear = "Freshman";
		} else if (character2 == '2'){
			studentYear = "Sophomore";
		} else if (character2 == '3'){
			studentYear = "Junior";
		} else if (character2 == '4'){
			studentYear = "Senior";
		}

		System.out.println(major + " " + studentYear);
	}

}
