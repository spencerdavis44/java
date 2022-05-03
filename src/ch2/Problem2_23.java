package ch2;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter the distance to drive, the fuel effiency of the car in miles per gallon, and the price per gallon, and displays
 * the cost of the trip
 */

public class Problem2_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.println("Enter miles per gallon: ");
		double MPG = input.nextDouble();

		System.out.println("Emter price per gallon: ");
		double gasPrice = input.nextDouble();

		double fuelEffeciency = distance / MPG;
		double cost = gasPrice * fuelEffeciency;

		System.out.println("The cost of driving is $" + cost);
	}
}
