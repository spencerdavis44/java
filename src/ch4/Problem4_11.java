package ch4;
import java.util.Scanner;
/*
 * Decimal to Hex
 */
public class Problem4_11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int decimalValue = input.nextInt();

		String hexValue = "";
		switch (decimalValue) {
		case 0:	hexValue = "0";
				break;
		case 1: hexValue = "1";
				break;
		case 2: hexValue = "2";
				break;
		case 3: hexValue = "3";
				break;
		case 4: hexValue = "4";
				break;
		case 5: hexValue = "5";
				break;
		case 6: hexValue = "6";
				break;
		case 7: hexValue = "7";
				break;
		case 8: hexValue = "8";
				break;
		case 9: hexValue = "9";
				break;
		case 10:hexValue = "A";
				break;
		case 11:hexValue = "B";
				break;
		case 12:hexValue = "C";
				break;
		case 13:hexValue = "D";
				break;
		case 14:hexValue = "E";
				break;
		case 15:hexValue = "F";
				break;
		default: hexValue = "Please try again and enter a correct number";
				break;
		}
		if (decimalValue >= 0 && decimalValue <= 15){
			System.out.println("The hex value is " + hexValue);
		} else
		System.out.println(hexValue);
	}
}
