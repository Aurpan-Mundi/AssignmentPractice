package redoAssignment2;

import java.util.Scanner;

public class weeklyPayAndSavingsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		weeklyPayAndSavings wps = new weeklyPayAndSavings();

		// Asking to enter total number of hours
		System.out.println("Please enter the total number of work hours");
		wps.hoursWorked = sc.nextInt();

		// Asking hourly Rate
		System.out.println("Please enter the hourly Rate");
		wps.hourlyRate = sc.nextDouble();

		// Asking if Attendance is perfect
		System.out.println("Please enter if attendance is perfect");
		System.out.println("For yes - enter True, for no - enter False");
		wps.perfectAttendance = sc.nextBoolean();

		// Calling methods to print out the outputs and results of calculations
		wps.calculateRegularPay();
		wps.calculateAttendanceBonus();
		wps.calculateGrossPay();
		wps.calculateSavings();
		wps.calculateTakeHomePay();

		sc.close();

	}

}
