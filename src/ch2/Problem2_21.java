package ch2;
import java.util.Scanner;
/*
 * Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears * 12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98
 */
public class Problem2_21 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Enter number of years: ");
		double years = input.nextDouble();

		double futureInvestmentValue = investmentAmount * (Math.pow((1 + (annualInterestRate / 1200)), years * 12));

		System.out.println("Accumulated value is " + futureInvestmentValue);
	}
}
