package ch6;
/*
 * (Conversions between Celcius and Fehrenheit) Write a class that contains the following two methods:
 *
 * public static double celciusToFahrenheit(double celcius)
 * public static double fahrenheitToCelcius(double fahrenheit)
 *
 * Write a test program that invokes these methods to display a table
 */

public class Problem6_8 {
	public static void main(String[] args){
		System.out.println("Celcius \tFahrenheit \t|\tFahrenheit \tCelcius");
		System.out.println("-----------------------------------------------------------------");
		for(double i = 40, j = 120; i >= 31; i--, j -= 10){
				System.out.println(i + "\t\t" + String.format("%.1f", celciusToFahrenheit(i)) + " \t\t| " + "\t" + j + "\t\t" + String.format("%.2f", fahrenheitToCelcius(j)));
		}
	}
	public static double celciusToFahrenheit(double celcius){
		double celciusToFahrenheit = (9.0 / 5) * celcius + 32;
		return celciusToFahrenheit;
	}
	public static double fahrenheitToCelcius(double fahrenheit){
		double fahrenheitToCelcius = (5.0 / 9) * (fahrenheit - 32);
		return fahrenheitToCelcius;
	}
}
