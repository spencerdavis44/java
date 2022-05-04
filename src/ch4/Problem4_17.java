package ch4;
import java.util.Scanner;
/*
 * Days of a month
 */
public class Problem4_17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		System.out.println("Enter a month: ");
		String month = input.next();


		//System.out.println(month);
		//System.out.println(year);


		int days = 0;
		/*
		if (month == "Jan" || month == "Mar" || month == "May" || month == "Jul" || month == "Aug" || month == "Oct" || month == "Dec"){
			days = 31;
			System.out.println(month + " " + year + " has " + days + " days.");
		}
		if (month == "Apr" || month == "Jun" || month == "Sep" || month == "Nov"){
			days = 30;
			System.out.println(month + " " + year + " has " + days + " days.");
		}
		if (month == "Feb"){
			days = 28;
			System.out.println(month + " " + year + " has " + days + " days.");
		}
		if (month == "Feb" && (year % 4 == 0)){
			days = 29;
			System.out.println(month + " " + year + " has " + days + " days.");
		} /*else {
			System.out.println("Invalid month entered. Please try again");
		}
		*/
		//System.out.println(month + " " + year + " has " + days + " days.");
		//System.out.println(month);
		//System.out.println(year);

		switch(month){
		case "Jan": days = 31;
			break;
		case "Feb": if(year % 4 == 0){
			days = 29;
		} else {
			days = 28;
		}
			break;
		case "Mar": days = 31;
			break;
		case "Apr": days = 30;
			break;
		case "May": days = 31;
			break;
		case "Jun": days = 30;
			break;
		case "Jul": days = 31;
			break;
		case "Aug": days = 31;
			break;
		case "Sep": days = 30;
			break;
		case "Oct": days = 31;
			break;
		case "Nov": days = 30;
			break;
		case "Dec": days = 31;
			break;
		}
		System.out.println(month + " " + year + " has " + days + " days.");
	}
}
