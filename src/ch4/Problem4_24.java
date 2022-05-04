package ch4;
import java.util.Scanner;
/*
 * Order three cities
 */
public class Problem4_24 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first city: ");
		String city1 = input.next();
		System.out.println("Enter the second city: ");
		String city2 = input.next();
		System.out.println("Enter the third city: ");
		String city3 = input.next();

		String firstCity = "";
		String secondCity = "";
		String thirdCity = "";

		if(city3.compareTo(city1) < 0){
			firstCity = city3;
			secondCity = city1;
			if (city1.compareTo(city2) < 0){
				thirdCity = city2;
			}

			if (city3.compareTo(city2) < 0){
				secondCity = city3;
				thirdCity = city2;
			}

			if ((city1.compareTo(city2) < 0) && ((city3.compareTo(city1) < 0))){
				firstCity = city3;
				secondCity = city1;
				thirdCity = city2;
			}
			if ((city3.compareTo(city1) < 0) && ((city2.compareTo(city3) < 0))){
				firstCity = city2;
				secondCity = city3;
				thirdCity = city1;
			}
			if ((city2.compareTo(city1) < 0) && ((city3.compareTo(city2) < 0))){
				firstCity = city3;
				secondCity = city2;
				thirdCity = city1;
			}
			System.out.println("The three cities in alphaetical order are " + firstCity + " " + secondCity + " " + thirdCity);
			System.exit(0);
		}

		if(city1.compareTo(city2) < 0){
			firstCity = city1;
			secondCity = city2;
			if (city2.compareTo(city3) < 0){
				thirdCity = city3;
			}

			if (city3.compareTo(city1) < 0){
				firstCity = city3;
				secondCity = city1;
				thirdCity = city2;
			}
			if (city3.compareTo(city2) < 0){
				secondCity = city3;
				thirdCity = city2;
			}
			if ((city3.compareTo(city2) < 0) && (city1.compareTo(city2) < 0)){
				firstCity = city1;
				secondCity = city3;
				thirdCity = city2;
			}
			System.out.println("The three cities in alphaetical order are " + firstCity + " " + secondCity + " " + thirdCity);
			System.exit(0);
		}

		if(city2.compareTo(city1) < 0){
			firstCity = city2;
			secondCity = city1;
			if (city1.compareTo(city3) < 0){
				thirdCity = city3;
			}

			if (city3.compareTo(city2) < 0){
				firstCity = city3;
				secondCity = city2;
				thirdCity = city1;
			}
			if (city3.compareTo(city1) < 0){
				secondCity = city3;
				thirdCity = city1;
			}
			System.out.println("The three cities in alphaetical order are " + firstCity + " " + secondCity + " " + thirdCity);
			System.exit(0);
		}

		if(city3.compareTo(city1) < 0){
			firstCity = city3;
			secondCity = city1;
			if (city1.compareTo(city2) < 0){
				thirdCity = city2;
			}
			/*
			if (city3.compareTo(city2) < 0){
				secondCity = city3;
				thirdCity = city2;
			}
			*/
			System.out.println("The three cities in alphaetical order are " + firstCity + " " + secondCity + " " + thirdCity);
			System.exit(0);
		}



		/*
		System.out.println(city1.compareTo(city3));
		System.out.println(city1.compareTo(city2));
		System.out.println(city2.compareTo(city1));
		*/


	}
}
