package ch3;
import java.util.Scanner;
/*
 * Cost of shipping: Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight is greater than 50,
 * display a message "the package cannot be shipped"
 */
public class Problem3_18 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package in pounds: ");

		double weight = input.nextDouble();

		double cost;

		if (weight <= 0){
			System.out.println("Invalid weight");
			System.exit(1);
		} else if (weight > 50){
			System.out.println("The package can not be shipped");
			System.exit(1);
		}

		if (weight <= 1 && weight > 0){
			cost = 3.5;
			System.out.println("The cost to ship the item that weighs " + weight + " pound(s) is $" + (weight * cost));
		} else if (weight > 1 && weight <= 3){
			cost = 5.5;
			System.out.println("The cost to ship the item that weighs " + weight + " pound(s) is $" + (weight * cost));
		} else if (weight > 3 && weight <= 10){
			cost = 8.5;
			System.out.println("The cost to ship the item that weighs " + weight + " pound(s) is $" + (weight * cost));
		} else if (weight > 10){
			cost = 10.5;
			System.out.println("The cost to ship the item that weighs " + weight + " pound(s) is $" + (weight * cost));
		}


	}
}
