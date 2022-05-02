package ch1;
/*
 * Write a program that displays the following table:
 * A    A^2    A^3
   1    1      1
   2    4      8
   3    9      27
   4    16     64
 *
 */

public class Problem1_4 {
	public static void main(String[] args ){
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		System.out.println("A    A^2    A^3");
		System.out.println(a + "    " + a + "      " + a);
		System.out.println(b + "    " + b * b + "      " + b * b * b);
		System.out.println(c + "    " + c * c + "      " + c * c * c);
		System.out.println(d + "    " + d * d + "     " + d * d * d);
	}

}
