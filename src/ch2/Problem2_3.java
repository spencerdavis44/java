package ch2;
import java.util.Scanner;
/*
 * Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is .305 meter.
 */
public class Problem2_3 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a value for feet: ");
	double feet = input.nextDouble();
	double meter = feet * .305;

	System.out.println(feet + " is " + meter + " meters");
	}
}
