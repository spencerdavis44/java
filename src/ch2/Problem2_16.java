package ch2;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter the side of a hexagon and displays its area. The formula for computing the area of a hexagon is
 * Area = 3(square root of)3 / 2 * s ^ 2
 * where s is the length of a side
 */

public class Problem2_16 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side of a hexagon: ");
		double side = input.nextDouble();

		double area = (3 * Math.pow(3, 0.5) / 2) * (Math.pow(side, 2));

		System.out.println("The area of the hexagon is " + area);
	}

}
