package ch2;
import java.util.Scanner;
/*
 * Suppose you save $100 each month into a savings account  with the annual interest rate of 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
 */
public class Problem2_13 {
	public static void main(String[] args ){
		//enter in a monthly amount. Calculate what an account value is after six months with interest
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double monthlyAmount = input.nextDouble();

		double monthlyInterest = 0.05 / 12;

		double firstMonth = monthlyAmount * (1 + monthlyInterest);
		double secondMonth = (firstMonth + monthlyAmount) * (1 + monthlyInterest);
		double thirdMonth = (secondMonth + monthlyAmount) * (1 + monthlyInterest);
		double fourthMonth = (thirdMonth + monthlyAmount) * (1 + monthlyInterest);
		double fifthMonth = (fourthMonth + monthlyAmount) * (1 + monthlyInterest);
		double sixthMonth = (fifthMonth + monthlyAmount) * (1 + monthlyInterest);

		System.out.println("After the sixth month, the account value is " + sixthMonth);
	}
}
