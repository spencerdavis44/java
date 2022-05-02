package ch1;
/*
 * You can use Cramer's rule to solve the following 2 x 2 system of linear equation:
 * ax + by = e , cx + dy = f. x = ed-bf / ad - bc. y = af - ec / ad - bc
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
   2.1x + .55y = 5.9
 */

public class Problem1_13 {
	public static void main(String[] args ){
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9");

		double x = ((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1));
		double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1));

		System.out.println("X equals " + x);
		System.out.println("Y equals " + y);
	}
}
