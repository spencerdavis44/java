package ch5;
/*
 * Conversion from miles to kilometers
 */
public class Problem5_4 {
	public static void main(String[] args){
		double convertMilesToKilos = 1.609;
		System.out.println("Miles \t\tKilometers");

		for(int miles = 1; miles < 11; miles++){
			System.out.println(miles + "\t\t" + String.format("%.3f", (miles * convertMilesToKilos)));
			//String.format("%.2f", (kilos + "\t\t" + (kilos * convertKilosToPounds)));
		}
	}
}
