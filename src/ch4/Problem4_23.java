package ch4;
import java.util.Scanner;
/*
 * Payroll: Write a program that reads the following information and prints a payroll statement:
 *
 * Employee's name
 * Number of hours worked
 * Hourly pay rate
 * Federal Tax withholding rate
 * State Tax withholding rate
 */
public class Problem4_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = input.next();
		System.out.println("Enter number of hours worked: ");
		double hoursWorked = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double hourlyWage = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();

		double grossPay = hoursWorked * hourlyWage;
		double deduction = ((grossPay * fedTax) + (grossPay * stateTax));
		double netPay = (grossPay - (((grossPay * fedTax) + (grossPay * stateTax))));


		System.out.println("Employee's name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyWage);
		System.out.println("Gross pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\t Federal Withholding (" + (fedTax * 100) + "): $" + (grossPay * fedTax));
		System.out.println("\t State Withholding (" + (stateTax * 100) + "): $" + Math.round((grossPay * stateTax) * 100.0)/ 100.0);
		//System.out.println("\t Total Deduction: $" + String.format(".02f", ((grossPay * fedTax) + (grossPay * stateTax))));
		System.out.println("\t Total Deduction: $" + Math.round(deduction * 100.0)/100.0);
		//System.out.println("Net pay: $" + (grossPay - (String.format(".02f", ((grossPay * fedTax) + (grossPay * stateTax))));
		System.out.println("Net pay: $" + Math.round(netPay * 100.0)/100.0);


		/*Deductions:
		 * 	Federal Withholding (*rate*):
		 *  State Withholding (*rate*):
		 *  Total Deduction:
		 * Net Pay:
		 */

	}
}
