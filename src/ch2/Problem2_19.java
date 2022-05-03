package ch2;
import java.util.Scanner;
/*
 * Write a program that prompts the user to enter three points (x1, y1), (x2,y2), (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2
 * area = (square root of)s(s - side1)(s - side2)(s - side3)
 */
public class Problem2_19 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");

        // triangle points
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // getting sides of triangle
        double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);

        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.println("The area of the triangle is " + area);
	}
}
