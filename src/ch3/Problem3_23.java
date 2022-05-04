package ch3;
import java.util.Scanner;
/*
 * Point in a rectangle?
 */
public class Problem3_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");

		double pointX = input.nextDouble();
		double pointY = input.nextDouble();

		double xDistance = Math.pow(pointX * pointX, 0.5);
		double yDistance = Math.pow(pointY * pointY, 0.5);

		if (xDistance <= 5 && yDistance <= 2.5){
			System.out.println("Point " + pointX + " , " + pointY + " is in the rectangle");
		} else {
			System.out.println("Point " + pointX + " , " + pointY + " is not in the rectangle");
		}
	}
}
