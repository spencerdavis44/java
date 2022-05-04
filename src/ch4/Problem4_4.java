package ch4;
import java.util.Scanner;
/*
 * Area of a hexagon
 */
public class Problem4_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side of a hexagon: ");
		double side = input.nextDouble();

		double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

		System.out.printf("The area of the hexagon is %4.2f", area);
	}
}
