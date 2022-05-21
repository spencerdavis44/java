package ch6;
import java.util.Scanner;
/*
 * Write a method to display a pattern. The method header is 
 * 
 * public static void displayPattern(int n)
 * 
 */
public class Problem6_6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int num = input.nextInt();
		
		
		displayPattern(num);
	}
	public static void displayPattern(int n){
		
		for(int row = 1; row <= n; row++){
			
			for(int formatter = 1; formatter <= n - row; formatter++){
				System.out.printf("%4s", "");
			}
			
			for (int column = row; column >= 1; column--){
				System.out.printf("%4d", column);
			}
			System.out.println();
		}
		
	}
}
