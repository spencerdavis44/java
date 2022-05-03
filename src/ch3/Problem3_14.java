package ch3;
import java.util.Scanner;
/*
 * Heads or tails
 */
public class Problem3_14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Heads or tails? For Heads, enter 0. For Tails, enter 1");
		int guess = input.nextInt();

		double coinFlip = Math.random() * 10;
		if (coinFlip >= 5){
			coinFlip = 1;
		} else {
			coinFlip = 0;
		}

		if (guess == coinFlip){
			System.out.println("You are correct!");
		} else {
			System.out.println("Sorry. Try again.");
		}
	}
}
