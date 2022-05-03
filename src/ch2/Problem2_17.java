package ch2;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter a temperature between -58 degrees Fahrenheit and 41 degrees Fahrenheit and a wind speed greater than or equal to 2
 * and displays the wind-chill temperature. The formula for wind chill is
 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + .4275tav^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured in MPH. twc is the wind chill temperature.
 * The formula can not be used for wind speeds below 2 MPH or temperatures below -58 degrees Fahrenheit or above 41 degrees Fahrenheit.
 */
public class Problem2_17 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();

		double windChill = (35.74 + (0.6215 *temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (.4275 * (temperature) * (Math.pow(windSpeed, 0.16))));

		System.out.println("The wind chill index is " + windChill);
	}
}