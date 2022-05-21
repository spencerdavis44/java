package ch6;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter the investment amount (ex: 1000) and the interest rate in percentage(ex: 9)
 * and prints a table that displays future value for the years from 1 to 30. Use the following method header:
 * 
 * public static double futureInvestmentValue(double investmentAmount, double monthylInterestRate, int years)
 * 
 */

public class Problem6_7 {
	public static void main(String[] args){
		final int NUMBER_OF_YEARS = 30;
		Scanner input = new Scanner(System.in);
		System.out.println("The amount invested: ");
		double amountInvested = input.nextDouble();
		System.out.println("Annual interest rate: ");
		double interestRate = input.nextDouble();
		for (int i = 1; i <= NUMBER_OF_YEARS; i++){
			System.out.println(i + "\t\t" + String.format("%.2f", futureInvestmentValue(amountInvested, interestRate, i)));
		}
		
	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		double futureInvestmentValue = investmentAmount * (Math.pow((1.0 + (monthlyInterestRate / 1200.0)), years * 12.0));
		return futureInvestmentValue;
	}
}
