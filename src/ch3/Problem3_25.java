package ch3;
import java.util.Scanner;
/*
 * Intersecting point: Write a program that prompts the user to enter four points and displays the intersecting point
 */
public class Problem3_25 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter in x1, y1, x2, y2, x3, y3, x4, y4");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = (y1 - y2);
		double b = (x1 - x2);
		double c = (y3 - y4);
		double d = (x3 - x4);
		double e = (a * x1) - (b * y1);
		double f = (c * x3) - (d * y3);

		double ad_Minus_bc = (a * d) - (b * c);
		double x = -((e * d) - (b * f)) / ad_Minus_bc;
		double y = -((a * f) - (e * c)) / ad_Minus_bc;

		if (ad_Minus_bc == 0){
			System.out.println("The two lines are parallel");
		} else {
			System.out.println("The intersecting point is at ( " + x + " , " + y + ")");
		}
	}
}
