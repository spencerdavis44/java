package ch3;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter an integer for today's day of the week(Sunday is 0, Monday is 1 ... Saturday is 6). Also prompt the user to enter
 * the number of days after today for a future day and display the future day of the week.
 */
public class Problem3_5 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int todaysDay = input.nextInt();

		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();

		String todaysName = "";
		switch (todaysDay) {

		case 0: todaysName = "Sunday";
		break;
		case 1: todaysName = "Monday";
		break;
		case 2: todaysName = "Tuesday";
		break;
		case 3: todaysName = "Wednesday";
		break;
		case 4: todaysName = "Thursday";
		break;
		case 5: todaysName = "Friday";
		break;
		case 6: todaysName = "Saturday";
		break;
		}

		daysElapsed = (todaysDay + daysElapsed) % 7;

		String futureDay = "";
		switch (daysElapsed) {
		case 0: futureDay = "Sunday";
		break;
		case 1: futureDay = "Monday";
		break;
		case 2: futureDay = "Tuesday";
		break;
		case 3: futureDay = "Wednesday";
		break;
		case 4: futureDay = "Thursday";
		break;
		case 5: futureDay = "Friday";
		break;
		case 6: futureDay = "Saturday";
		break;

		}

		System.out.println("Today is " + todaysName + " and the future day is " + futureDay);
	}
}
