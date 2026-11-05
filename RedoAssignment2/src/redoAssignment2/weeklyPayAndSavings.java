package redoAssignment2;

public class weeklyPayAndSavings {

	// declaring variables that are mentioned in the assignment
	int hoursWorked;
	double hourlyRate;
	boolean perfectAttendance;

	// declaring variables mentioned as output in the assignment
	double regularPay;
	double overtimePay;
	double attendanceBonus;
	double grossPay;
	double savings;
	double takehomePay;

	// declaring variables
	double regularHours;
	double overtimeHours;

	// first output - Regular pay
	// regular pay = regularWork hours*pay rate
	// regular hours = if 40 = 40 regular hours, if > 40 then remaining hours are
	// overtime hours
	// overtime pay = overtime hours *(pay rate*1.5)
	// overtime hours = total worked hours - 40
	// Regular Hours = total hours - overtime hours

	void calculateRegularPay() {
		if (hoursWorked < 40) {
			regularPay = hoursWorked * hourlyRate;
			System.out.println("Regular Pay : $ " + regularPay);
			System.out.println("Overtime Pay: $ " + overtimePay);
		}

		// else - if hours worked > 40
		else {
			// doing calculations first

			overtimeHours = hoursWorked - 40;
			regularHours = hoursWorked - overtimeHours;
			overtimePay = overtimeHours * (hourlyRate * 1.5);
			regularPay = regularHours * hourlyRate;

			// now printing the values
			System.out.println("Regular Pay: $ " + regularPay);
			System.out.println("Overtime Pay : $ " + overtimePay);

		}

	}

	// checking for Attendance Bonus
	void calculateAttendanceBonus() {
		if (perfectAttendance == true) {
			if (hoursWorked >= 40) {
				attendanceBonus = 50;
				System.out.println("Attendance Bonus : $ " + attendanceBonus);
			}
			// else - if total work hours < 40
			else {
				attendanceBonus = 20;
				System.out.println("Attendance Bonus : $ " + attendanceBonus);
			}

		}

		// else - if attendance == false
		else {
			System.out.println("Attendance Bonus: $ " + attendanceBonus);
		}
	}

	// Calculating Gross Pay
	// grossPay = regularPay + overtimePay + attendanceBonus
	void calculateGrossPay() {
		grossPay = regularPay + overtimePay + attendanceBonus;
		System.out.println("Gross Pay: $ " + grossPay);
	}

	// calculating savings
	// 5% of gross pay = 5/100*gross pay
	void calculateSavings() {
		// savings = (5/100) * grossPay;
		/*
		 * this calculation results in 0 cause java performed an int division cause i
		 * wrote 5, and ignored the decimal values after 0 therefore it performed -
		 * 5/100 = 0.05 and gave me the output as savings = 0; it ignored the values
		 * after 0 i have to write it as 5.0/100 so it performs a double division and
		 * doesn't ignore the decimal values
		 * 
		 */
		savings = (5.0 / 100) * grossPay;
		System.out.println("Savings: $ " + savings);
	}

	// Calculating Take home Money
	// take home Money = gross Pay - savings
	void calculateTakeHomePay() {
		takehomePay = grossPay - savings;
		System.out.println("Take-home Pay: $ " + takehomePay);
	}

}
