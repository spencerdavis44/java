package ch4;
import java.util.Scanner;
/*
 * Estimate areas: Find the GPS locations for Atlanta; Orlando; Savannah, GA; and Charlotte and compute the estimated area enclosed by these four cities
 */
public class Problem4_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Atlanta
		double x1 = -84.3902633;
		double y1 = 33.7544753;

		//Orlando
		double x2 = -81.3799313;
		double y2 = 28.5393998;

		//Savannah
		double x3 = -81.0910573;
		double y3 = 32.0785922;

		//Charlotte
		double x4 = -80.8418882;
		double y4 = 35.2258028;

		double atlantaToOrlando = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

		double atlantaToCharlotte = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y1 - y4)));

		double atlantaToSavannah = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1 - y3)));

		double charlotteToSavannah = 6371.01 * Math.acos(Math.sin(Math.toRadians(x4)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y4 - y3)));

		double savannahToOrlando = 6371.01 * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y3 - y2)));

		/*

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

    	/*
    	 * Will need to use:
    	 * x1, y1
    	 * x2, y2
    	 * x3, y3
    	 */

		double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);

        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);


        //Will need to use
        //x1, y1
        //x3, y3
        //x4, y4

        double side4 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side5 = Math.pow((x1 - x4) * (x1 - x4) + (y1 - y4) * (y1 - y4), 0.5);
        double side6 = Math.pow((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3), 0.5);

        double s2 = (side4 + side5 + side6) / 2.0;
        double area2 = Math.pow(s * (s - side4) * (s - side5) * (s - side6), 0.5);

        double totalArea = area + area2;

        System.out.println("The estimated area between Atlanta, Orlando, Savannah and Charlotte is " + totalArea);

	}
}
