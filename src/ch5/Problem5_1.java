package ch5;
import java.util.Scanner;
/*(Count positive and negative numbers and compute the average of numbers)
 * Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total
 * and average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number.
 */
public class Problem5_1 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int differentNumbers = 0;
		int total = 0;
		int numberOfNegatives = 0;
		int numberOfPositives = 0;

		for (int buffer = -1; buffer != 0;){

			buffer = input.nextInt();
			if (buffer > 0) numberOfPositives++;
			else if (buffer < 0) numberOfNegatives++;
			total += buffer;
		}
		if (numberOfPositives + numberOfNegatives == 0){
			System.out.println("No numbers are entered except 0");
		}
		double average = total / (double)(numberOfPositives + numberOfNegatives);
		System.out.println("The number of positives is " + numberOfPositives);
		System.out.println("The number of negatives is " + numberOfNegatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
