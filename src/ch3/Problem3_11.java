package ch3;
import java.util.Scanner;
/*
 * Find the number of days in a month
 */
public class Problem3_11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number (ex: January = 1 and December = 12) and year");
		int month = input.nextInt();
		int year = input.nextInt();
		String monthName = null;
		int days = 0;

		switch (month) {
		case 1: monthName = "January";
				days = 31;
		break;
		case 2: monthName = "February";
				days = 28;
		break;
		case 3: monthName = "March";
				days = 31;
		break;
		case 4: monthName = "April";
				days = 30;
		break;
		case 5: monthName = "May";
				days = 31;
		break;
		case 6: monthName = "June";
				days = 30;
		break;
		case 7: monthName = "July";
				days = 31;
		break;
		case 8: monthName = "August";
				days = 31;
		break;
		case 9: monthName = "September";
				days = 30;
		break;
		case 10: monthName = "October";
				 days = 31;
		break;
		case 11: monthName = "November";
				 days = 30;
		break;
		case 12: monthName = "December";
				 days = 31;
		break;
		}

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		if (isLeapYear == true && month == 2){
			days = 29;
		}

		System.out.println("In " + monthName + " " + year + " , there are " + days + " days");
	}
}
