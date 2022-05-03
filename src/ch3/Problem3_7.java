package ch3;
import java.util.Scanner;
/*
 * Modify listing 2.10, ComputeChange.java, to display the nonzero denominations only, using singular words for single units such as 1 dollar and 1 penny,
 * and plural words for more than one unit such as 2 dollars and 3 pennies.
 */
public class Problem3_7 {
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

        //display results
        System.out.println("Your amount " + amount + " consists of");

        String dollars = "";
        String quarters = "";
        String dimes = "";
        String nickels = "";
        String pennies = "";

        //dollars section
        if (numberOfOneDollars == 1){
        	dollars = " dollar";
        	System.out.println(numberOfOneDollars + " " + dollars);
        } else if (numberOfOneDollars == 0){

        } else {
        	dollars = " dollars";
        	System.out.println(numberOfOneDollars + " " + dollars);
        }

        //quarters section
        if (numberOfQuarters == 1){
        	quarters = " quarter";
        	System.out.println(numberOfQuarters + " " + quarters);
        } else if (numberOfQuarters == 0){

        } else {
        	quarters = " quarters";
        	System.out.println(numberOfQuarters + " " + quarters);
        }

        //dimes section
        if (numberOfDimes == 1){
        	dimes = " dime";
        	System.out.println(numberOfDimes + " " + dimes);
        } else if (numberOfDimes == 0){

        } else {
        	dimes = " dimes";
        	System.out.println(numberOfDimes + " " + dimes);
        }

        // nickels section
        if (numberOfNickels == 1){
        	nickels = " nickel";
        	System.out.println(numberOfNickels + " " + nickels);
        } else if (numberOfNickels == 0){

        } else {
        	nickels = " nickels";
        	System.out.println(numberOfNickels + " " + nickels);
        }

        //pennies section
        if (numberOfPennies == 1){
        	pennies = " penny";
        	System.out.println(numberOfPennies + " " + pennies);
        } else if (numberOfPennies == 0){

        } else {
        	pennies = " pennies";
        	System.out.println(numberOfPennies + " " + pennies);
        }
	}
}
