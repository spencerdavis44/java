package ch2;
/*
 * Write a program that displays the following table. Cast floating point numbers into integers.
a	b	pow(a, b)
1	2 	1
2	3 	8
3	4 	81
4	5 	1024
5	6 	15625
 */
public class Problem2_18 {
	public static void main (String[] args){
		//float a = 1;
		System.out.println("a	b	pow(a, b)");
		float b = 2;
		for (float a = 1; a <= 5; a++){
			System.out.println((int)a + "	" + (int)b + " 	" + (int)Math.pow(a, b));
			b++;
		}

	}
}
