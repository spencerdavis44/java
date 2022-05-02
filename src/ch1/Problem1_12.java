package ch1;
/*
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers
 * per hour. (Note that 1 mile is 1.6 kilometers)
 */

public class Problem1_12 {
	public static void main(String[] args ){
		/*
		//24 miles in 1 hour, 40 minutes and 35 seconds
		//convert to km/h. 1 mile = 1.6 km
		double secondsInHour = (60.0 * 60.0);
		double otherTime = (40 * 60) + 35;
		double convertMile = (24 * 1.60934);
		System.out.println(convertMile);
			24 miles is 38.4 km

		double totalTime = (secondsInHour + otherTime);
		double percentOfTotalTimeToTwoHours = (totalTime / (secondsInHour * 2)); //0.8381944444444445
		double kmTimesPercentage = (convertMile * percentOfTotalTimeToTwoHours); //32.186688
		double addToKM = (convertMile - kmTimesPercentage); //6.213000000000001
		double kmPerHour = ((convertMile + addToKM) / 2);


		//System.out.println(totalTime / (secondsInHour * 2));
		//System.out.println(38.4 * .838195);
		//System.out.println(38.4 - 32.187);
		System.out.println(kmPerHour);
		*/
		double miles = 24;
		double kilometers = 1.60934;
		double distanceInKilometers = miles * kilometers;
		double time = 1.0 * 60.0 + 40  + 35 / 60.0;
		double kmPerHour = 60 * distanceInKilometers / time;
		System.out.println(kmPerHour);

	}
}
