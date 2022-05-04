package ch3;
import java.util.Scanner;
/*
 * Wind-chill temperature: Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill temperature
 * if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid
 */
public class Problem3_20 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();

		if (windSpeed < 2 && (temperature < -58 || temperature > 41)){
			System.out.println("The input for both wind speed and temperature are invalid.");
		} else if (temperature < -58 || temperature > 41){
			System.out.println("The input for temperature is invalid");
		} else if (windSpeed < 2){
			System.out.println("The input for wind speed is invalid");
		} else {
			double windChill = (35.74 + (0.6215 *temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (.4275 * (temperature) * (Math.pow(windSpeed, 0.16))));

			System.out.println("The wind chill index is " + windChill);
		}
	}
}
