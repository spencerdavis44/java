package ch2;
import java.util.Scanner;
/*
 * If you know the balance an the annual percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
 */
public class Problem2_20 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate (ex: 3 for 3%): ");

		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		double monthlyInterest = balance * (annualInterestRate / 1200);

		System.out.println("The interest for next month is " + monthlyInterest);
	}
}
