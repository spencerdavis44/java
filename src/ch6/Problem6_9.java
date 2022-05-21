package ch6;
/*
 * (Conversion between feet and meters) Write a class that contains the following two methods:
 *
 * public static double footToMeter(double foot)
 * public static double meterToFoot(double meter)
 *
 * Write a test program that invokes these methods to display a table.
 */

public class Problem6_9 {
	public static void main(String[] args){
		System.out.println("Feet \t\tMeters \t\t|\tMeters \t\tFeet");
		System.out.println("-----------------------------------------------------------------");
		for(double i = 1, j = 20; i <= 10; i++, j += 5){
				System.out.println(i + "\t\t" + String.format("%.3f", footToMeter(i)) + " \t\t| " + "\t" + j + "\t\t" + String.format("%.3f", meterToFoot(j)));
		}
	}
	public static double footToMeter(double foot){
		double meter = 0.305 * foot;
		return meter;
	}
	public static double meterToFoot(double meter){
		double foot = 3.279 * meter;
		return foot;
	}
}
