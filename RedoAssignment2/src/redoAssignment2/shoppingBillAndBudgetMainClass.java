package redoAssignment2;

import java.util.Scanner;

public class shoppingBillAndBudgetMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initiating scanner for getting input from customer
		Scanner sc = new Scanner(System.in);

		// creating an object
		shoppingBillAndBudget sb = new shoppingBillAndBudget();

		// Asking cx to enter the values

		// Asking price per item
		System.out.println("Please enter the price Per Item");
		sb.pricePerItem = sc.nextDouble();

		// Asking to enter quantity (how many units cx is buying)
		System.out.println("Please enter Quantity");
		sb.quantity = sc.nextInt();

		// Asking if cx is a member or not
		System.out.println("Please verify if you are a Member");
		System.out.println("Enter - True for yes and False - for No");
		sb.isMember = sc.nextBoolean();

		// Asking cx about the budget amount
		System.out.println("Please enter the budget");
		sb.budget = sc.nextDouble();

		// printing - sub total, discount, final bill, budget status, Money Left/ Short
		// fall
		// calling methods

		sb.calculateSubTotal();
		sb.checkMember();
		sb.calculateFinalBill();
		sb.checkBudget();

		// getting a warning at line 11
		// sc never close

		sc.close();

	}

}
