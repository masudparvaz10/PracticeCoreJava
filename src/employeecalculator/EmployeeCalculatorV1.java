package emploeecalculator;

import java.util.Scanner;

public class EmployeeCalculatorV1 {

	public static void main(String[] args) {

		
		// Variable Declation  
		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;

		
		System.out.println("Well Come to EMP Cal - Please Follow the Instruction .... ");
		System.out.println("");
		System.out.println("");


		// Taking a object Reference for Scanning information from any Input syste
		Scanner hrscan = new Scanner(System.in);
		
		
		System.out.println("Enter Employee Name ");
		nameOfEmployee = hrscan.nextLine();
		
		System.out.println("Enter Employee Total Hour ");
		numberOfHourWorked = hrscan.nextDouble();
		
		
		System.out.println("Enter Employee Hrate");
		hourlyPayRate = hrscan.nextDouble();



		// Process
		grossPay = numberOfHourWorked * hourlyPayRate;

	
		
		// Display Out Put
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("Employee Name is : " + nameOfEmployee);
		System.out.println("Employee Total Hour is : " +numberOfHourWorked);
		System.out.println("Employee Hourly Rate is  : "+ hourlyPayRate);
		System.out.println("Employee Gross is  : "+ grossPay);
		System.out.println("==================================================");

		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Well Come to EMP Cal - Please Follow the Instruction .... ");

	}

}
