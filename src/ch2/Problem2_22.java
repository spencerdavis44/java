package ch2;
import java.util.Scanner;
/*
 * Rewwrite listing 2.10, ComputeChange.java to fix the possible loss of accuracy when converting a double vaclue to an int value. Enter the input as an integer whose
 * last two digits represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */
public class Problem2_22 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		//receive the amount
		System.out.println("Enter an amount in integer, for example 1156 is 11.56");
		int amount = input.nextInt();
		int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        remainingAmount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of \n" +
                "\t" + numberOfOneDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfDimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies");
	}
}
