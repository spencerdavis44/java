package ch6;
import java.util.Scanner;
/*
 * (Check password) Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password.
 * Suppose the password rules are as follows:
 * 
 * A password must have at least eight characters
 * A password consists of only letters and digits
 * A password must contain at least two digits
 * 
 * Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid password otherwise.
 */
public class Problem6_18 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password. It must meet the following requirements: ");
		System.out.println("A password must have at least eight characters");
		System.out.println("A password consists of only letters and digits");
		System.out.println("A password must contain at least two digits");
		String password = input.next();
		
		checkPassword(password);
	}
	public static void checkPassword(String password){
		boolean length = false;
		int digitCounter = 0;
		if (password.length() >= 8){
			length = true;
		}
		for (int i = 0; i < password.length(); i++){
			char thisCharacter = password.charAt(i);
			Character.isLetterOrDigit(thisCharacter);
			if (Character.isDigit(thisCharacter) == true){
				digitCounter++;
			}
			if (Character.isLetterOrDigit(thisCharacter) == false){
				System.out.println("Invalid Password");
				System.exit(0);
			}
		}
		if (length == true && digitCounter >= 2){
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
