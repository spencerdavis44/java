package ch3;
import java.util.Scanner;
/*
 * Day of the week
 */
public class Problem3_21 {

	public static final String dayOfWeekisString = "Day of the week is ";
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter year: ");
		int year = input.nextInt();

		System.out.println("Enter month: 1-12: ");
		int month = input.nextInt();

		System.out.println("Enter the day of the month: 1-31: ");
		int day = input.nextInt();

		//returnMonth is m
		int returnMonth = 0;
		switch (month) {
		case 1: month = 13; year--; break;
		case 2: month = 14; year--; break;
		case 3: month = 3; break;
		case 4: month = 4; break;
		case 5: month = 5; break;
		case 6: month = 6; break;
		case 7: month = 7; break;
		case 8: month = 8; break;
		case 9: month = 9; break;
		case 10: month = 10; break;
		case 11: month = 11; break;
		case 12: month = 12; break;
		}
		if (month == 1 || month == 2){
			year--;
		}
		//returnYearOfCentury is k
		int returnYearOfCentury = year % 100;

		//returnCentury is j
		int returnCentury = year / 100;

		int dayOfTheWeek = (day + (26 * (month + 1) / 10) + returnYearOfCentury + (returnYearOfCentury / 4) + (returnCentury / 4) + (5 * returnCentury)) % 7;
		System.out.println(dayOfTheWeek);

		switch (dayOfTheWeek) {
		case 0: System.out.println("Day of the week is Saturday"); break;
		case 1: System.out.println("Day of the week is Sunday"); break;
		case 2: System.out.println("Day of the week is Monday"); break;
		case 3: System.out.println("Day of the week is Tuesday"); break;
		case 4: System.out.println("Day of the week is Wednesday"); break;
		case 5: System.out.println("Day of the week is Thursday"); break;
		case 6: System.out.println("Day of the week is Friday"); break;
		}

		/*
		System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: 1-12: ");
        int month = input.nextInt();
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }
        System.out.print("Enter the day of the month: ");
        int dayOfMonth = input.nextInt();

        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = (dayOfMonth + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        String dayNameOfWeek = dayNameOfWeek(dayOfWeek);

        System.out.println(dayOfWeekisString + dayNameOfWeek);

    }
    public static String dayNameOfWeek(int dayOfWeek) {

        switch (dayOfWeek) {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
        */
	}
}
