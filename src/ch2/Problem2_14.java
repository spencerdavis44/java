package ch2;
import java.util.Scanner;
/*
 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 * Note that one pound is 0.45359237 kilograms and one inch is .0254 meters
 */
public class Problem2_14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();

		double weightInKG = weight * .45359237;

		double heightInMeters = height * .0254;

		double calculateBMI = weightInKG / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + calculateBMI);
	}
}
