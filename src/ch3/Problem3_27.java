package ch3;
import java.util.Scanner;
/*
 * Points in a triangle?
 */
public class Problem3_27 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x and y coordinates: ");

		double x = input.nextDouble();
		double y = input.nextDouble();

		double slope = -0.5D;
		double y1 = y + -x * slope;

		if ((x > 200.0) || (x < 0.0) || (y > 100) || (y < 0.0)){
			System.out.println("The point is not in the triangle");
		} else {
			if (y1 <= 100.0){
				System.out.println("The point is in the triangle");
			} else {
				System.out.println("The point is not  in the triangle");
			}
		}
	}
}
