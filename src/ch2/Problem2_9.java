package ch2;
import java.util.Scanner;
/*
 * Average acceleration is defined as the change of velocity divided y the time taken to make the change, as shown in the following formula:
 * a = v1 - v0 / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second,
 * and the time span t in seconds, and displays the average acceleration
 */

public class Problem2_9 {
	public static void main(String[] args){
		//Ask the user to enter in starting velocity, ending velocity and the time span in seconds to calculate average acceleration
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting velocity, ending velocity and time span in seconds");

		float startVelocity = input.nextFloat();
		float endVelocity = input.nextFloat();
		float time = input.nextFloat();

		float calculateVelocity = endVelocity - startVelocity;
		float avgAcceleration = calculateVelocity / time;

		float avgAccelLong = (float)avgAcceleration;

		System.out.println("The average acceleration is " + avgAccelLong);
	}
}
