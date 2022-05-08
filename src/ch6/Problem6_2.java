package ch6;
import java.util.Scanner;
/*
 * Write a method that computes the sum of the digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
 */
public class Problem6_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		System.out.println("The sum of " + integer + " is " + sumDigits(integer));
	}

	public static int sumDigits(long n){
		int sum = 0;
		while (n != 0){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
