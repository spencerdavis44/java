package ch5;
/*
 * Conversion from kilograms to pounds and pounds to kilograms
 */
public class Problem5_5 {
	public static void main(String[] args){
		double kilogramsToPounds = 2.2;
		System.out.println("Kilograms \tPounds \t|\tPounds \tKilograms");
		for(int i = 1, j = 20; i < 200; i += 2, j += 5){
			System.out.println(i + "\t\t   " + String.format("%.1f", (i * kilogramsToPounds)) + " | \t" + j + " \t" + String.format("%.2f", (j / kilogramsToPounds)));
			//j = j + 5;
			//i = i + 2;
		}
		/*
System.out.println("Miles \t\tKilometers");

		for(int miles = 1; miles < 11; miles++){
			System.out.println(miles + "\t\t" + String.format("%.3f", (miles * convertMilesToKilos)));
			//String.format("%.2f", (kilos + "\t\t" + (kilos * convertKilosToPounds)));

			 */
	}
}
