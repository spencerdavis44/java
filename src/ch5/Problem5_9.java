package ch5;
import java.util.Scanner;
/*
 * Find the two highest scores.
 */
public class Problem5_9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String topStudentName = "";
		double topStudentScore = 0;
		String secondStudentName = "";
		double secondStudentScore = 0;
		String name = "";
		double score = 0;
		System.out.println("Enter the number of students: ");
		double students = input.nextDouble();

		for (int i = 0; i < students; i++){
			System.out.println("Enter the student's name");
			name = input.next();
			System.out.println("Enter " + name + "'s score:");
			score = input.nextDouble();

			if (score > topStudentScore){
				if (topStudentName != null){
					secondStudentScore = topStudentScore;
					secondStudentName = topStudentName;
				}
				topStudentScore = score;
				topStudentName = name;
			}
			/*
			if (score > topStudentScore){
				topStudentScore = score;
				topStudentName = name;
			}
			*/
			else if (score > secondStudentScore){

					secondStudentScore = score;
					secondStudentName = name;

			}

			/*
			if (topStudentScore < secondStudentScore){
				topStudentScore = secondStudentScore;
				topStudentName = secondStudentName;
				secondStudentScore = score;
				secondStudentName = name;
			}
			*/
		}
		System.out.println(topStudentName + " had the highest score of " + topStudentScore + " and " + secondStudentName + " had the second highest score of " +
		secondStudentScore);

	}
}
