package ch2;
import java.util.Scanner;
/*
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
 * The population should be cast into an integer.
 */
public class Problem2_11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years: ");
		int years = input.nextInt();


		long current = 312032486;
		int timeInAYear = (((60 * 60) * 24) * 365);
		//System.out.println(timeInAYear);

		int birth = timeInAYear / 7;
		int death = timeInAYear / 13;
		int immigrant = timeInAYear / 45;


		/*
		System.out.println("The amount of births in a year is " + birth);
		System.out.println("The amount of deaths in a year is " + death);
		System.out.println("The amount of immigrants in a year is " + immigrant);

		long firstPeople = ((current + birth + immigrant) - death);
		long secondPeople = ((firstPeople + birth + immigrant) - death);
		long thirdPeople = ((secondPeople + birth + immigrant) - death);
		long fourthPeople = ((thirdPeople + birth + immigrant) - death);
		long fifthPeople = ((fourthPeople + birth + immigrant) - death);
		*/

		for (int j = 0; j < years; j++){
			current += ((birth + immigrant) - death);
	}

		System.out.println("The population of " + years + " Years is " + current);
}
}
