package ch3;
import java.util.Scanner;
/*
 * Solve Quadratic equations
 */
public class Problem3_1 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = b * b - 4.0 * a * c;

		if (discriminant > 0.0){
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		} else if (discriminant == 0.0){
			double r1 = -b / 2.0 * a;
			System.out.println("The equation has one root: " + r1);
		} else {
			System.out.println("The equation has no real roots");
		}

	}
}
