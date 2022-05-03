package ch3;
import java.util.Scanner;
/*
 * Addition quiz
 */
public class Problem3_10 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int rand1 = (int) (Math.random() * 100);
		int rand2 = (int) (Math.random() * 100);

		System.out.println("What is " + rand1 + " + " + rand2);
		int answer = input.nextInt();
		//System.out.println(rand1);
		//System.out.println(rand2);

		if (rand1 + rand2 == answer){
			System.out.println("You are correct!");
		} else {
			System.out.println("You need to practice more. Goodbye");
		}
	}
}
