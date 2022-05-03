package ch3;
/*
 * Random coordinate in a rectangle.
 */

public class Problem3_16 {
	public static void main(String[] args){
		int x = (int) (Math.random() * 100);
		int y = (int) (Math.random() * 200);

		double posOrNegX = Math.random();
		double posOrNegY = Math.random();

		/*
		System.out.println(x);
		System.out.println(y);
		System.out.println(posOrNegX);
		System.out.println(posOrNegY);
		*/

		if (posOrNegX > 0.5){
			x = x * 1;
		} else {
			x = x * -1;
		}

		if (posOrNegY > 0.5){
			y = y * 1;
		} else {
			y = y * -1;
		}

		System.out.println("Coordinates for the rectangle are ( " + x + " , " + y + " )");
	}
}
