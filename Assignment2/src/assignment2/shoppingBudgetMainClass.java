package assignment2;

import java.util.Scanner;

public class shoppingBudgetMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating an object so we can input the values
		Scanner sc = new Scanner(System.in);
		shoppingBudget sb = new shoppingBudget();

		System.out.println("Please enter the price per item");
		sb.pricePerItem = sc.nextDouble();
		System.out.println("Please ether the quantity");
		sb.quantity = sc.nextInt();
		System.out.println("Please verify if you are a member");
		System.out.println("Enter true for yes and False for no");
		sb.isMember = sc.nextBoolean();
		System.out.println("Please enter the budget for shopping");
		sb.budget = sc.nextDouble();

		sb.calculateSubTotal();
		sb.checkMember();

	}

}
