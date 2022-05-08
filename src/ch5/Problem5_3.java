package ch5;
/*
 * Conversion from Kilograms to Pounds
 */

public class Problem5_3 {
	public static void main(String[] args){
		double convertKilosToPounds = 2.2;
		System.out.println("Kilograms \tPounds");

		for(int kilos = 1; kilos < 200;){
			System.out.println(kilos + "\t\t" + String.format("%.1f", (kilos * convertKilosToPounds)));
			//String.format("%.2f", (kilos + "\t\t" + (kilos * convertKilosToPounds)));
			kilos = kilos + 2;
		}
	}
}
