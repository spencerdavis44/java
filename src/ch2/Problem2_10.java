package ch2;
import java.util.Scanner;
/*
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program should prompt the user 
 * to enter the amount of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature - initialTemperature) * 4184
 * where M is the weight of the water in kilograms, temperatures are in degrees Celsius, and evergy Q is measured in Joules.
 */
public class Problem2_10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//calculate the energy needed to heat water from an initial temperature to a final temperature
		System.out.println("Enter the amount of water in kilograms");
		
		double waterInKG = input.nextDouble();
		
		System.out.println("Enter the initial temperature");
		
		double initialTemp = input.nextDouble();
		
		System.out.println("Enter the final temperature");
		
		double finalTemp = input.nextDouble();
		
		double calculateJoules = waterInKG * (finalTemp - initialTemp) * 4184;
		
		System.out.println("The energy needed is " + calculateJoules + " joules");
		
	}
}
