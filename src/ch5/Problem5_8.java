package ch5;
import java.util.Scanner;
/*
 * Find the highest score
 */
public class Problem5_8 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		double students = input.nextDouble();
		String topStudentName = "";
		double topStudentScore = 0;
		String studentName = "";
		double score = 0;
		
		for (int i = 0; i < students; i++){
			System.out.println("Enter the student's name:");
			studentName = input.next();
			System.out.println("Enter " + studentName + "'s score:");
			score = input.nextDouble();
			
			if (score > topStudentScore){
				topStudentName = studentName;
				topStudentScore = score;
			}
		}
		System.out.println(topStudentName + " had the highest score of " + topStudentScore);
	}
}
