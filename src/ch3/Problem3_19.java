package ch3;
import java.util.Scanner;
/*
 * Compute the perimteter of a triangle. The input is valid if the sum of every pair of two edes is grater than the remaining edge
 */
public class Problem3_19 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three values for the sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)){
			System.out.println("This is a valid input");
			System.out.println("The perimeter of the triangle is " + (side1 + side2 + side3));
		} else if((side1 + side2 < side3) || (side1 + side3 < side2) || (side3 + side2 < side1)){
			System.out.println("The input is invalid");
			System.exit(1);
		} else {
			System.out.println("The input is invalid");
		}
	}
}
