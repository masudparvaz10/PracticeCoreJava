package emploeecalculator;

import java.util.Scanner;

public class EmployeeCalculatorV6 {

	// Private Variable 
	
	static int counter=0;
	static String[] nameOfEmployee =new String[2];
	static double[] numberOfHourWorked = new double[2];
	static double[] hourlyPayRate= new double[2];
	static double[] grossPay= new double[2];
	static double[] netPay= new double[2];



	// Special Constructor Method 

	public EmployeeCalculatorV6(int howMany, String Grreting) {
//		wellCOme(Grreting);
//
//		for(int i=0;i<howMany;i++) {
//			getInput();
//			calculateSalary();
//			displayOutput();
//		}
//
//
//		exitProgram();

	}





	public static void menuSelection() {

		Scanner menuScan = new Scanner(System.in);
		String menuSelected;		
		System.out.println("Please Chose a option [(A)Add / (E)Edit / (D)Delete / (X) exit]");
		menuSelected = menuScan.nextLine();


		// === 
		switch(menuSelected) {

		case "A": 
			// Addition 
			System.out.println("Adding Opration .. ");
			
			getInput(counter);
			calculateSalary(counter);
			displayOutput(counter);
			displayTable(counter);
			
			counter++;
			
			menuSelection();  // Recursive Function Call 

		case "E":
			//Edit
			System.out.println("Editing  Opration .. ");
			menuSelection();  // Recursive Function Call 


		case "D":	
			// Delete
			System.out.println("Deleting  Opration .. ");
			menuSelection();  // Recursive Function Call 


		case "X":	
			// CLose
			System.out.println("Closing   Entire Program Bye Bye !!!! .. ");
			System.exit(0); // Exit 


		default : 
			// What the Hell 
			System.out.println("Wrong Option  .. ");
			menuSelection();  // Recursive Function Call 

		}

		
		
		
	}




	// Module : Wellcome
	public static void wellCOme(String greeting) {
		System.out.println("Well Come to " + greeting +" Cal - Please Follow the Instruction .... ");
		System.out.println("");
		System.out.println("");
	}

	public static void getInput(int arrayPoinmter) {

		// Taking a object Reference for Scanning information from any Input syste
		Scanner hrscan = new Scanner(System.in);

		System.out.println("Enter Employee Name ");
		nameOfEmployee[arrayPoinmter] = hrscan.nextLine();

		boolean continueToNextStep;

		do {
			try {
				hrscan = new Scanner(System.in);
				System.out.println("Enter Employee Total Hour ");
				numberOfHourWorked[arrayPoinmter] = hrscan.nextDouble();

				if (numberOfHourWorked[arrayPoinmter] >= 0 && numberOfHourWorked[arrayPoinmter] <= 80) {
					continueToNextStep = true;
				} else {
					System.out.println("Please Enter Hour Between 0 - 80!!! ");
					continueToNextStep = false;
				}

			} catch (Exception e) {
				System.out.println("Exception Please Enter  0 - 80!!! ");
				continueToNextStep = false;
			}

		} while (!continueToNextStep);

		// ==== Taking Input For Hourly Rate with Input Validation & Also Recovering
		// Exception
		do {
			try {
				hrscan = new Scanner(System.in);
				System.out.println("Enter Employee Hrate");
				hourlyPayRate[arrayPoinmter] = hrscan.nextDouble();

				if (hourlyPayRate[arrayPoinmter] >= 10 && hourlyPayRate[arrayPoinmter] <= 50) {
					continueToNextStep = true;
				} else {
					System.out.println("Please Enter Valid Hrate 10 - 50!!! ");
					continueToNextStep = false;
				}

			} catch (Exception e) {
				System.out.println("Exception Happened Please Enter  10 - 50!!! ");
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
		System.out.println("==================================================");
		System.out.println("Employee Name is : " + nameOfEmployee[arrayPointer]);
		System.out.println("Employee Total Hour is : " + numberOfHourWorked[arrayPointer]);
		System.out.println("Employee Hourly Rate is  : " + hourlyPayRate[arrayPointer]);
		System.out.println("Employee Gross is  : " + grossPay[arrayPointer]);
		System.out.println("Employee Netpay is  : " + netPay[arrayPointer]);
		System.out.println("==================================================");

	}

	
	public static void displayTable(int arrayPointer) {
		
		
		System.out.println("Name | Total Hour | Hrate | GrossPay | NetPay");
		
		for(int i=0;i<nameOfEmployee.length;i++)
		{
			System.out.println(nameOfEmployee[i] + numberOfHourWorked[i] + hourlyPayRate[i] + grossPay[i] + netPay[i] );
		}

		
		
	}
	
	
	public static void exitProgram() {

		System.out.println("");
		System.out.println("");
		System.out.println("Thank You for using Bye Bye  .... ");

	}

	// Returanable Module - Function
	public static boolean doYouWantToConinue() {

		String doYouwantToContinue;
		Scanner choiceScanner = new Scanner(System.in);

		System.out.println("DO You Want to continue ...");
		doYouwantToContinue = choiceScanner.nextLine();

		if (doYouwantToContinue.equals("yes")) {
			return true;
		}

		return false;

	}




}
