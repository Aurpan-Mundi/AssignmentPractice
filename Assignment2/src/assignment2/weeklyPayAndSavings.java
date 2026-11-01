package assignment2;

public class weeklyPayAndSavings {

	int hoursWorked;
	double hourlyRate;
	boolean perfectAttendance;
	
	int overtimeHours;
	double savings;
	double grossPay;
	double regularPay;
	double overTimePay;
	double bonus;
	double takeHomePay;

	
	void regularPay()
	{
		if (hoursWorked > 40) {
			regularPay = 40*hourlyRate;
			overtimeHours = hoursWorked - 40;
			
		}
		else {
			regularPay = hoursWorked*hourlyRate;
			overtimeHours = 0;
		}
		
		System.out.println("Regular Pay: $ " + regularPay);
	}
	
	void overTimePay()
	{
		overTimePay = overtimeHours*hourlyRate*1.5;
		System.out.println("Overtime Pay : $ " + overTimePay);
		
	}
	
	void perfectAttendanceCheck()
	{
		if (perfectAttendance) {
			
			if (hoursWorked >= 40) {
				bonus = 50;
				
			}
			else {
				bonus = 20;
			}
			
		}
		
		else {
			bonus = 0;
			
		}
		
		System.out.println("Attendance bonus : $ " + bonus);
	}
	
	
	void grossPayCalculate()
	{
		grossPay = regularPay + overTimePay + bonus;
		System.out.println("Gross Pay : $ " + grossPay);
	}
	
	void savings()
	{
		
		savings = grossPay*0.05;
		System.out.println("Savings : $ " + savings);
	}
	
	void takeHomePay()
	{
		takeHomePay = grossPay-savings;
		System.out.println("Take-home pay : $ " + takeHomePay);
	}
	
	
}
