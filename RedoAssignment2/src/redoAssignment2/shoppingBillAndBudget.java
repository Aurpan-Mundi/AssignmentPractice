package redoAssignment2;

public class shoppingBillAndBudget {

	// Declaring variables - mentioned in assignment description
	double pricePerItem;
	int quantity;
	boolean isMember;
	double budget;

	// Declaring variables
	double finalBill;
	double discount;
	double subtotal;
	double moneyLeft;
	double shortFall;

	/*
	 * We have to calculate
	 * 
	 * total bill apply store discount check if shopper can afford it or not
	 * 
	 * let's create methods for calculations
	 */

	// According to the output in Assignment, we first need to calculate the
	// subtotal
	// Sub total = quantity*price

	void calculateSubTotal() {
		subtotal = quantity * pricePerItem;
		System.out.printf("Sub Total = CAD %.2f%n", subtotal);

	}
	// second output is discount
	// if member = discount - 10 or 5 %
	// not a member = discount - 0

	void checkMember() {
		if (isMember == true) {
			// condition - if subtotal is equal or more than $100 - discount = 10%
			if (subtotal >= 100) {
				discount = (subtotal * 10) / 100;
				// sub total*0.10
				System.out.printf("Discount = CAD %.2f%n", discount);
			}

			// if sub total < 100 - discount = 5%

			else {
				discount = (subtotal * 5) / 100;
				System.out.printf("Discount = CAD %.2f%n", discount);

			}

		}

		// else for if member == false
		else if (isMember == false) {
			// discount = 0; Java assigned the discount a default value of 0
			System.out.printf("Discount = CAD %.2f%n", discount);
		}

		// if the input is something other than t/f
		// not working for other inputs
		else {
			System.out.println("Entered insput is not correct");
			System.out.println("Please enter True or False only");
			// discount = 0; Java assigned the discount a default value of 0

		}

	}

	// calculate final Bill
	// Final Bill = Sub Total - Discount;
	void calculateFinalBill() {
		finalBill = subtotal - discount;
		System.out.printf("Final Bill = CAD %.2f%n", finalBill);
	}

	// Budget Status
	// condition - if final bill <= budget --> within budget
	// if finalbill > budget ----> over budget
	// no possible third condition - is else is fine, no nested required

	/*
	 * void checkBudget() { if (finalBill <= budget) {
	 * System.out.println("Budget Status: Within Budget");
	 * 
	 * } else { System.out.println("Budget Status: Over Budget"); } }
	 */

	// money left - if with in budget
	// shortfall - over budget
	// if within budget ---> money left = budget - finalbill
	// if overbudget ----> shortfall = finalbill - budget

	void checkBudget() {
		if (finalBill <= budget) {
			System.out.println("Budget Status: Within Budget");
			moneyLeft = budget - finalBill;
			System.out.printf("Money Left = CAD %.2f%n", moneyLeft);

		} else {
			System.out.println("Budget Status: Over Budget");
			shortFall = finalBill - budget;
			System.out.printf("Shortfall = CAD %.2f%n", shortFall);
		}

	}
}
