package ch3;
import java.util.Scanner;
/*
 * Currency Exchange: Write a program that prompts the user to enter the exchange rate from currency in U.S. Dollars to Chinese RMB
 */
public class Problem3_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double convertCurrency = input.nextDouble();

		if(convertCurrency == 0){
			System.out.println("Enter the dollar amount: ");
		} else if (convertCurrency != 0){
			System.out.println("Enter the RMB Amount");
		}
		double moneyAmount = input.nextDouble();
		double totalAmount = 0;

		if(convertCurrency == 0){
			totalAmount = moneyAmount * exchangeRate;
			System.out.println("$" + moneyAmount + " is " + totalAmount + " yuan");
		} else if (convertCurrency != 0){
			totalAmount = moneyAmount / exchangeRate;
			System.out.println(moneyAmount + " yuan is $" + totalAmount);
		}

	}
}
