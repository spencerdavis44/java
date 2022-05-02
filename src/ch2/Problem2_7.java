package ch2;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion) and displays the numer of years and days for the minutes.
 * For simplicity, assume a year has 365 days.
 */
public class Problem2_7 {
	public static void main(String[] args){
		//enter in a number of minutes and calculate years and days. Assume a year is 365 days
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");

		double minutes = input.nextDouble();
		int minutesInt = (int)minutes;

		double minutesInADay = 1440;

		double minutesInAYear = 525600;

		double years = (minutes / minutesInAYear);
		int yearsInt = (int)years;
		double days = (minutes % minutesInAYear) / minutesInADay;
		int daysInt = (int)days;
		System.out.println(minutesInt + " minutes is approximately " + yearsInt + " years and " + daysInt + " days");


	}
}
