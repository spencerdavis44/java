package ch3;
import java.util.Scanner;
/*
 * Lottery game. Generate a 3 digit number. The program prompts the user to enter a 3 digit number and determines whether the user wins according to the following rules:
 * If the user input matches the lottery number in the exact order, the award is $10,000
 * If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */
public class Problem3_15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int lottery = (int)(Math.random() * 1000);
		//int lottery = 274;
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();

		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;

		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100/ 10;
		int guessDigit3 = guess % 10;

		System.out.println("The lottery number is " + lottery);

		if (guess == lottery)
			System.out.println("Exact match: you win $10,000!");
		else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1) ||
				(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2) ||
				(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) ||
				(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3) ||
				(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)){
			System.out.println("Match all digits: you win $3,000!");
		} else if ((guessDigit1 == lotteryDigit3) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit1) ||
				(guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit3) ||
				(guessDigit3 == lotteryDigit3) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit1)) {
			System.out.println("Match one digit: you win $1,000!");
		} else {
			System.out.println("Sorry, no match. Try again.");
		}
	}
}
