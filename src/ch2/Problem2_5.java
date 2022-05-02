package ch2;
import java.util.Scanner;
/*
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters 10
 * for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
 *  */
public class Problem2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuityCost = (gratuityRate / 100) * subtotal;
		double totalCost = subtotal + gratuityCost;

		System.out.println("The gratuity is $" + gratuityCost + " and total is $" + totalCost);
	}
}
