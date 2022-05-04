package ch3;
import java.util.Scanner;
/*
 * Compare Costs: Suppose you shop for rice in two different packages. You would like to write a program to compare the cost. The program prompts the user to enter
 * the weight and price of the each package and displays the one with the better price.
 */
public class Problem3_33 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1: ");
		int weight1 = input.nextInt();
		double price1 = input.nextDouble();

		System.out.println("Enter weight and price for package 2: ");
		int weight2 = input.nextInt();
		double price2 = input.nextDouble();

		double calculate1 = weight1 / price1;
		double calculate2 = weight2 / price2;

		if (calculate1 < calculate2){
			System.out.println("Package 2 has a better price.");
		} else if (calculate1 > calculate2){
			System.out.println("Package 1 has a better price.");
		} else if(calculate1 == calculate2){
			System.out.println("The packages have the same price");
		}
	}
}
