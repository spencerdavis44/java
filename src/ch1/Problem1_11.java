package ch1;
/*
 * The U.S. Census Bureau projects population based on the following presumptions:
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486
 */

public class Problem1_11 {
	public static void main(String[] args ){
		long current = 312032486;
		int timeInAYear = (((60 * 60) * 24) * 365);
		//System.out.println(timeInAYear);

		int birth = timeInAYear / 7;
		int death = timeInAYear / 13;
		int immigrant = timeInAYear / 45;

		System.out.println("The amount of births in a year is " + birth);
		System.out.println("The amount of deaths in a year is " + death);
		System.out.println("The amount of immigrants in a year is " + immigrant);

		long firstPeople = ((current + birth + immigrant) - death);
		long secondPeople = ((firstPeople + birth + immigrant) - death);
		long thirdPeople = ((secondPeople + birth + immigrant) - death);
		long fourthPeople = ((thirdPeople + birth + immigrant) - death);
		long fifthPeople = ((fourthPeople + birth + immigrant) - death);

		System.out.println("The population for 2021 started at " + current + ". The population at the end of 2021 would be "+ firstPeople);
		System.out.println("The population for 2022 started at " + firstPeople + ". The population at the end of 2022 would be "+ secondPeople);
		System.out.println("The population for 2023 started at " + secondPeople + ". The population at the end of 2023 would be "+ thirdPeople);
		System.out.println("The population for 2024 started at " + thirdPeople + ". The population at the end of 2024 would be "+ fourthPeople);
		System.out.println("The population for 2025 started at " + fourthPeople + ". The population at the end of 2025 would be "+ fifthPeople);

	}

}
