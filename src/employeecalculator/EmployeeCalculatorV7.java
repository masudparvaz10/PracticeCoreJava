package emploeecalculator;

import java.util.Scanner;

public class EmployeeCalculatorV7 {

	// Private Variable

	static final int maxArray = 5;
	static int counter = 0;
	static String[] nameOfEmployee = new String[maxArray];
	static double[] numberOfHourWorked = new double[maxArray];
	static double[] hourlyPayRate = new double[maxArray];
	static double[] grossPay = new double[maxArray];
	static double[] netPay = new double[maxArray];

	// Special Constructor Method
	public EmployeeCalculatorV7(int howMany, String Grreting) {

	}

	@SuppressWarnings("resource")
	public static void menuSelection() {

		// As User to chose select an option from A/E/D/X
		Scanner menuScan = new Scanner(System.in);
		String menuSelected;
		System.out.print("\nPlease Chose a option [(A)Add / (E)Edit / (D)Delete / (X) exit] : ");
		menuSelected = menuScan.nextLine();

		// Execute User's Selected Option using Switch ... Case
		switch (menuSelected) {

		case "A":
			// Addition
			System.out.println("\nAdding Opration .. ");
			System.out.println("-----------------------------");

			getInput(counter);
			calculateSalary(counter);
			displayOutput(counter);
			displayTable(counter);

			counter++;

			menuSelection(); // Recursive Function Call

		case "E":
			// Edit
			System.out.println("Editing  Opration .. ");
			menuSelection(); // Recursive Function Call

		case "D":
			// Delete
			System.out.println("Deleting  Opration .. ");
			menuSelection(); // Recursive Function Call

		case "X":
			// CLose
			System.out.println("Closing   Entire Program Bye Bye !!!! .. ");
			System.exit(0); // Exit

		default:
			// What the Hell
			System.out.println("Wrong Option  .. ");
			menuSelection(); // Recursive Function Call

		}

	}

	
	// All Core Modules For Calculator
	public static void wellCOme(String greeting) {
		System.out.println("Well Come to " + greeting + " Cal - Please Follow the Instruction .... ");
		System.out.println("");
		System.out.println("");
	}

	@SuppressWarnings("resource")
	public static void getInput(int arrayPoinmter) {

		// Taking a object Reference for Scanning information from any Input System
		Scanner hrscan = new Scanner(System.in);

		// Employee Name 
		System.out.print("\tEnter Employee Name\t\t: ");
		nameOfEmployee[arrayPoinmter] = hrscan.nextLine();

		boolean continueToNextStep;

		// Total Hour 
		do {
			try {
				hrscan = new Scanner(System.in);
				System.out.print("\tEnter Employee Total Hour\t: ");
				numberOfHourWorked[arrayPoinmter] = hrscan.nextDouble();

				if (numberOfHourWorked[arrayPoinmter] >= 0 && numberOfHourWorked[arrayPoinmter] <= 80) {
					continueToNextStep = true;
				} else {
					System.out.println("[Error!!] Please Enter Hour Between 0 - 80!!! ");
					continueToNextStep = false;
				}

			} catch (Exception e) {
				System.out.println("[Error!!] Exception Please Enter  0 - 80!!! ");
				continueToNextStep = false;
			}

		} while (!continueToNextStep);


		// Hourly Rate 
		do {
			try {
				hrscan = new Scanner(System.in);
				System.out.print("\tEnter Employee Hrate\t\t: ");
				hourlyPayRate[arrayPoinmter] = hrscan.nextDouble();

				if (hourlyPayRate[arrayPoinmter] >= 10 && hourlyPayRate[arrayPoinmter] <= 50) {
					continueToNextStep = true;
				} else {
					System.out.println("[Error!!] Please Enter Valid Hrate 10 - 50!!! ");
					continueToNextStep = false;
				}

			} catch (Exception e) {
				System.out.println("[Error!!] Exception Happened Please Enter  10 - 50!!! ");
				continueToNextStep = false;
			}
		} while (!continueToNextStep);

	}

	public static void calculateSalary(int arrayPoinmter) {
		calculateGrossPay(arrayPoinmter);
		calculateNetPay(arrayPoinmter);
	}

	public static void calculateGrossPay(int arrayPointer) {

		// Process
		grossPay[arrayPointer] = numberOfHourWorked[arrayPointer] * hourlyPayRate[arrayPointer];

	}

	public static void calculateNetPay(int arrayPointer) {

		if (grossPay[arrayPointer] > 0 && grossPay[arrayPointer] <= 1500) {
			netPay[arrayPointer] = grossPay[arrayPointer] - (grossPay[arrayPointer] * 10) / 100;
		} else if (grossPay[arrayPointer] > 1500 && grossPay[arrayPointer] <= 3000) {
			netPay[arrayPointer] = grossPay[arrayPointer] - (grossPay[arrayPointer] * 20) / 100;
		} else if (grossPay[arrayPointer] > 3000 && grossPay[arrayPointer] <= 4500) {
			netPay[arrayPointer] = grossPay[arrayPointer] - (grossPay[arrayPointer] * 30) / 100;
		} else if (grossPay[arrayPointer] > 4500 && grossPay[arrayPointer] <= 6000) {
			netPay[arrayPointer] = grossPay[arrayPointer] - (grossPay[arrayPointer] * 40) / 100;
		} else if (grossPay[arrayPointer] > 6000) {
			netPay[arrayPointer] = grossPay[arrayPointer] - (grossPay[arrayPointer] * 50) / 100;
		} else {
			netPay[arrayPointer] = 0;
			System.out.println("Invalid Input Captured!!!!");
		}

	}

	public static void displayOutput(int arrayPointer) {

		// Display Out Put
		System.out.println("");
		System.out.println("======================Employee Pay Check =====================");
		System.out.println("Employee Name is : " + nameOfEmployee[arrayPointer]);
		System.out.println("Employee Total Hour is : " + numberOfHourWorked[arrayPointer]);
		System.out.println("Employee Hourly Rate is  : " + hourlyPayRate[arrayPointer]);
		System.out.println("Employee Gross is  : " + grossPay[arrayPointer]);
		System.out.println("Employee Netpay is  : " + netPay[arrayPointer]);
		System.out.println("==================================================");

	}

	public static void displayTable(int arrayPointer) {

		System.out.println("");
		System.out.println("=================Employee Salary Table============================================================================================================");
		System.out.println("Name	|	Total Hour	|	Hrate	|	GrossPay	|	NetPay");
		System.out.println("===================================================================================================================================================");

		// Loop Through the all Array And Print all Record 
		for (int i = 0; i < maxArray; i++) {
			System.out.println(nameOfEmployee[i] + "	|	"+ numberOfHourWorked[i]+ "		|	"+  hourlyPayRate[i] + "	|	"+ grossPay[i] + "		|	"+ netPay[i]);
		}
		System.out.println("===================================================================================================================================================");

	}

	public static void exitProgram() {

		System.out.println("");
		System.out.println("");
		System.out.println("Thank You for using Bye Bye  .... ");

	}

	
	
	public static void main(String[] args) {
		menuSelection();
	}
	
	
	
}
