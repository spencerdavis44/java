package ch3;
import java.util.Scanner;
/*
 * Revise programming exercise 2.8 to display the hour using a 12 hour clock.
 */
public class Problem3_30 {
	public static void main (String[] args){
		System.out.println("Enter the time zone offset to GMT: ");
		Scanner input = new Scanner(System.in);
		int offset = input.nextInt();

		//obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMillseconds = System.currentTimeMillis();

		//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMillseconds / 1000;

		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		//Obtain the total hours
		long totalHours = totalMinutes / 60;

		//Compute the current hour
		//long currentHour = (totalHours + offset) % 24;
		long currentHour = (totalHours + offset) % 24;
		long newCurrentHour = currentHour % 12;

		String amOrPM = "";
		if (currentHour < 12){
			amOrPM = "AM";
		} else {
			amOrPM = "PM";
		}

		//Display results
		System.out.println("The current time is " + newCurrentHour + ":" + currentMinute + ":" + currentSecond + " " + amOrPM);


	}
}
