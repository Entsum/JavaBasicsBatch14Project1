package com.homework.task;

import java.util.Scanner;

public class HW6CreditCard {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		System.out.println("Do you have a credit card? Enter true or false");

		Scanner scanner = new Scanner(System.in);
		boolean credit = scanner.nextBoolean();

		if (credit) {
			System.out.println("What is the balance on your credit card?");
			int balance = scanner.nextInt();
			
			if (balance > 1000) {
				System.out.println("Pay off the credit balance immediately");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("Do you want to apply for a credit card?");
		}
	}

}
