package ch6;
/*
 * A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, etc. Write a method with the following header that returns a pentagonal number:
 * public static int getPentagonalNumber(int n)
 * Write a test program that uses this method to display the first 10 pentagonal numbers with 10 numbers on each line.
 *
 */
public class Problem6_1 {
	public static void main(String[] args){
		final int NUMBERS_ON_EACH_LINE = 10;
		final int TOTAL_PENTAGONAL_NUMBERS = 100;;

		for(int i = 1; i < TOTAL_PENTAGONAL_NUMBERS; i++){
			int integer = getPentagonalNumber(i);
			if (i  % NUMBERS_ON_EACH_LINE == 0)
				System.out.println(integer + " ");
			else
				System.out.print(integer + " ");
		}


	}

	public static int getPentagonalNumber(int n){
		return (n * (3* n - 1) / 2);
	}

}
