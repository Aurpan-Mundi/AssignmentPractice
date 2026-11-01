package assignment2;

import java.util.Scanner;

public class weeklyPayAndSavingsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		weeklyPayAndSavings wp = new weeklyPayAndSavings();
		
		System.out.println("Please enter total hours worked");
		wp.hoursWorked = sc.nextInt();
		
		System.out.println("Please enter the hourly Rate");
		wp.hourlyRate = sc.nextDouble();
		
		System.out.println("Please enter if attendance is perfect");
		System.out.println("Enter true or false");
		wp.perfectAttendance = sc.nextBoolean();
		
		
		wp.regularPay();
		wp.overTimePay();
		wp.perfectAttendanceCheck();
		wp.grossPayCalculate();
		wp.savings();
		wp.takeHomePay();
		
		
		
		
		
		
		
		

	}

}
