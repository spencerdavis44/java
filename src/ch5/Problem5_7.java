package ch5;
/*
 * Financial application: compute future tuiton. Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year,
 * the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years' worth of tuition after the tenth year.
 */
public class Problem5_7 {
	public static void main(String[] args){
		double tuition = 10000;
		double sum = 0;
		//double newTuitionCost = startingCost;
		for (int i = 0; i < 10; i++){
			tuition *= (1 + .05);
			System.out.println(tuition);
			//newTuitionCost = startingCost * .05;
		}
		for (int j = 0; j < 4; j++){
			tuition *= (1 + .05);
			System.out.println("---------------------------");
			System.out.println(tuition);
			sum += tuition;
			System.out.println(sum);
		}
	}
}
