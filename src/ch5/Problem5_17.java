package ch5;
/*
 * Display pyramid
 */
import java.util.Scanner;

public class Problem5_17 {
	public static void main(String[] args){

		System.out.print("Enter number of lines: ");
		Scanner input = new Scanner(System.in);
		//7
		int n = input.nextInt();

		//as long as i (starting at 1) is less than or equal to 7, run this loop and then increment i by +1
		for (int i = 1; i <= n; i++) {

		//as long as j (starting at 1) is less than or equal to 7 - 1, increment j +1
		 for (int j = 1; j <= (n - i); j++) {
		  System.out.printf("%3s", " ");
		 }

		 //j is now equal to i (starts at 1). As long as j is greater than or equal to 1 (always true), decrement j -1 (left half)
		 for (int j = i; j >= 1; j--) {
		 // System.out.print(j + " ");
		  System.out.printf("%3d", j);
		 }

		 //j is equal to 2. As long as j is less than or equal to i (starts at 1 and then increments each iteration of the loop), increment j +1 (right half)
		 for (int j = 2; j <= i; j++) {
		 // System.out.print(j + " ");
		  System.out.printf("%3d", j);
		 }
		 System.out.println();

		}

	}

}
