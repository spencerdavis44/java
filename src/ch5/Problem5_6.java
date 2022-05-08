package ch5;
/*
 * Conversion from miles to kilometers
 */
public class Problem5_6 {
	public static void main (String[] args){
		/*
		double kilogramsToPounds = 2.2;
		System.out.println("Kilograms \tPounds \t|\tPounds \tKilograms");
		for(int i = 1, j = 20; i < 200; i += 2, j += 5){
			System.out.println(i + "\t\t   " + String.format("%.1f", (i * kilogramsToPounds)) + " | \t" + j + " \t" + String.format("%.2f", (j / kilogramsToPounds)));
			//j = j + 5;
			//i = i + 2;
		}
		*/
		double milesToKilometers = 1.609;
		System.out.println("Miles \tKilometers \t|\tKilometers \tMiles");
		for (int i = 1, j = 20; i < 11; i ++, j += 5){
			System.out.println(i + "\t" + String.format("%.3f", (i * milesToKilometers)) + " \t\t| " + "\t" + j + "\t\t" + String.format("%.3f", (j / milesToKilometers)));
		}
	}

}
