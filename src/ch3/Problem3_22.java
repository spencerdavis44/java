package ch3;
import java.util.Scanner;
/*
 * Point in a circle?
 */
public class Problem3_22 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ex. (4, 5) ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();

		//calculate distance to (0,0)
		double distance = Math.pow((pointX * pointX + pointY * pointY), 0.5);
		if (distance <= 10){
			System.out.println("Point " + pointX + " , " + pointY + " is in the circle. ");
		} else {
			System.out.println("Point " + pointX + " , " + pointY + " is not in the circle");
		}
	}
}
