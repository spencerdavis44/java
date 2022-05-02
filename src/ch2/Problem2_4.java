package ch2;
import java.util.Scanner;
/*
 * Write a program that converts pounds to kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 * One pound is .454 kilograms
 */
public class Problem2_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * .454;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
