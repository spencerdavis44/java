package ch1;
/*
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers)
 */

public class Problem1_10 {
	public static void main(String[] args ){
		double kilos = 14.0;
		double miles = kilos / 1.6;
		double time = ((45.5 * 60.0)) / (60.0 * 60.0);

		double MPH = miles / time;

		System.out.println(miles);
		System.out.println(time);
		System.out.println(MPH);
	}
}
