package ch4;
import java.util.Scanner;
/*
 * Area of a regular polygon
 */
public class Problem4_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides: ");
		double numOfSides = input.nextDouble();

		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double area = (numOfSides * side * side) / (4 * Math.tan(Math.PI / numOfSides));

		System.out.println("The area of the polygon is " + area);


	}
}
