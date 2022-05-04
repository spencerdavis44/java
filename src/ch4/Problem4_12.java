package ch4;
import java.util.Scanner;
/*
 * Hex to Binary
 */
public class Problem4_12 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexDigit = input.next();

		char fromHexDigit = hexDigit.charAt(0);

		String binary = "";
		if (fromHexDigit == '0'){
			binary = "0000";
		} else if (fromHexDigit == '1'){
			binary = "0001";
		} else if (fromHexDigit == '2'){
			binary = "0010";
		} else if (fromHexDigit == '3'){
			binary = "0011";
		} else if (fromHexDigit == '4'){
			binary = "0100";
		} else if (fromHexDigit == '5'){
			binary = "0101";
		} else if (fromHexDigit == '6'){
			binary = "0110";
		} else if (fromHexDigit == '7'){
			binary = "0111";
		} else if (fromHexDigit == '8'){
			binary = "1000";
		} else if (fromHexDigit == '9'){
			binary = "1001";
		} else if (fromHexDigit == 'A'){
			binary = "1010";
		} else if (fromHexDigit == 'B'){
			binary = "1011";
		} else if (fromHexDigit == 'C'){
			binary = "1100";
		} else if (fromHexDigit == 'D'){
			binary = "1101";
		} else if (fromHexDigit == 'E'){
			binary = "1110";
		} else if (fromHexDigit == 'F'){
			binary = "1111";
		} else {
			System.out.println(fromHexDigit + " is an invalid input");
			System.exit(1);
		}
		System.out.println("The binary value is " + binary);

	}
}
