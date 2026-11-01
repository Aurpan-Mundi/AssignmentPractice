package assignment2;

public class shoppingBudget {

	// variables
	double pricePerItem;
	int quantity;
	boolean isMember;
	double budget;
	double discount;
	double subTotal;
	double totalBill;
	double shortFall;
	double moneyLeft;

	// Calculating Sub Total

	void calculateSubTotal() {

		subTotal = pricePerItem * quantity;

	}

	void checkMember() {
		// if (isMember == true) {
		if (isMember) {
			if (subTotal >= 100.00) {
				// customer getting 10% discount
				discount = (subTotal * 10) / 100;
				totalBill = subTotal - discount;

				System.out.println("Sub Total = $ " + subTotal);
				System.out.println("Discount = $ " + discount);
				System.out.println("Final Bill = $ " + totalBill);

				// checking if the spending is with in budget or over budget
				if (totalBill > budget) {
					System.out.println("Budget Status : Over Budget");
					shortFall = totalBill - budget;
					System.out.println("Shortfall $ " + shortFall);

				} else {
					System.out.println("Budget Status : Within Budget");
					moneyLeft = budget - totalBill;
					System.out.println("Money Left $ " + moneyLeft);

				}

			}

			else if (subTotal < 100.00) {
				// customer getting 5% discount
				discount = (subTotal * 5) / 100;
				totalBill = subTotal - discount;

				System.out.println("Sub Total = $ " + subTotal);
				System.out.println("Discount = $ " + discount);
				System.out.println("Final Bill = $ " + totalBill);

				// checking if the spending is with in budget or over budget

				if (totalBill > budget) {
					System.out.println("Budget Status : Over Budget");
					shortFall = totalBill - budget;
					System.out.println("Shortfall $ " + shortFall);

				} else {
					System.out.println("Budget Status : Within Budget");
					moneyLeft = budget - totalBill;
					System.out.println("Money Left $ " + moneyLeft);

				}

			}

		} else {

			// customer isn't a member therefore not eligible for a Store discount

			discount = 0;
			totalBill = subTotal - discount;

			System.out.println("Sub Total = $ " + subTotal);
			System.out.println("Discount = $" + discount);
			System.out.println("Final Bill = " + totalBill);

			if (totalBill > budget) {
				System.out.println("Budget Status : Over Budget");
				shortFall = totalBill - budget;
				System.out.println("Shortfall $ " + shortFall);

			} else {
				System.out.println("Budget Status : Within Budget");
				moneyLeft = budget - totalBill;
				System.out.println("Money Left $ " + moneyLeft);
			}
		}
	}

}
