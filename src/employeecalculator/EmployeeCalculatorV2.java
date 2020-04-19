package emploeecalculator;

import java.util.Scanner;

public class EmployeeCalculatorV2 {


	// Variable Declation  
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static  double grossPay;
	

	// Module : Wellcome 
	public static void wellCOme() {
		System.out.println("Well Come to EMP Cal - Please Follow the Instruction .... ");
		System.out.println("");
		System.out.println("");
	}

	public static void getInput() {

		
		

		// Taking a object Reference for Scanning information from any Input syste
		Scanner hrscan = new Scanner(System.in);


		System.out.println("Enter Employee Name ");
		nameOfEmployee = hrscan.nextLine();

		System.out.println("Enter Employee Total Hour ");
		numberOfHourWorked = hrscan.nextDouble();


		System.out.println("Enter Employee Hrate");
		hourlyPayRate = hrscan.nextDouble();

	}

	public static void calculateGrossPay() {
		
		
		
		// Process
		grossPay = numberOfHourWorked * hourlyPayRate;

	}

	public static void displayOutput() {

		
		// Display Out Put
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("Employee Name is : " + nameOfEmployee);
		System.out.println("Employee Total Hour is : " +numberOfHourWorked);
		System.out.println("Employee Hourly Rate is  : "+ hourlyPayRate);
		System.out.println("Employee Gross is  : "+ grossPay);
		System.out.println("==================================================");


	}

	public static void exitProgram() {


		System.out.println("");
		System.out.println("");
		System.out.println("Thank you for using .... ");

	}




	public static void main(String[] args) {


		
		wellCOme();
		getInput();
		calculateGrossPay();
		displayOutput();
		exitProgram();
				
		
	}

}
