package ch2;
import java.util.Scanner;
/*
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
 * area = radius * radius * pi
 * volume = area * length
 */
public class Problem2_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the radius and length of a cylinder: ");

		double radius = input.nextDouble();
		double length = input.nextDouble();


		double area = radius * radius * 3.14159;
		double volume = area * length;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
