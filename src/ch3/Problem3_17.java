package ch3;
import java.util.Scanner;
/*
 * Game: Rock, paper, scizzors
 */
public class Problem3_17 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Scissor (0), rock (1), paper (2): ");
		int guess = input.nextInt();

		//rps = rock, paper, scissor
		double rps = Math.random() * 2;

		if (rps < .667){
			rps = 0;
		} else if (rps > .667 && rps < 1.33){
			rps = 1;
		} else {
			rps = 2;
		}

		//assigning value to human guess
		String outcome = "";
		if (guess == 0){
			outcome = "Scissor";
		} else if (guess == 1){
			outcome = "Rock";
		} else if (guess == 2){
			outcome = "Paper";
		} else {
			System.out.println("Invalid value");
			System.exit(1);
		}

		//assigning string value to computer value
		String computerGuess = "";
		if (rps == 0){
			computerGuess = "Scissor";
		} else if (rps == 1){
			computerGuess = "Rock";
		} else {
			computerGuess = "Paper";
		}

		//if rps = 0 (computer has scissor)
		if (guess == 0 && rps == 0){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + " too. It is a draw");
		} else if (guess == 1 && rps == 0){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". You win");
		} else if (guess == 2 && rps == 0){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". The computer wins");
		}

		//if rps = 1 (computer has rock)
		if (guess == 1 && rps == 1){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + " too. It is a draw");
		} else if (guess == 2 && rps == 1){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". You win");
		} else if (guess == 0 && rps == 1){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". The computer wins");
		}


		//if rps = 2 (computer has paper)
		if (guess == 2 && rps == 2){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + " too. It is a draw");
		} else if (guess == 0 && rps == 2){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". You win");
		} else if (guess == 1 && rps == 2){
			System.out.println("The computer is " + computerGuess + ". You are " + outcome + ". The computer wins");
		}
	}
}
