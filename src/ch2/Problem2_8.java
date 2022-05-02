package ch2;
import java.util.Scanner;
/*
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the program so that it prompts the
 * user to enter the time zone offset to GMT and displays the time in the specified time zone.
 */
public class Problem2_8 {
	public static void main(String[] args){
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
		long currentHour = (totalHours + offset) % 24;


		//Display results
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


	}
}
