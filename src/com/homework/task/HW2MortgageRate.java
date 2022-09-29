package com.homework.task;

import java.util.Scanner;

public class HW2MortgageRate {

	public static void main(String[] args) {

		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your mortgage rate?");

		double rate = scanner.nextDouble();

		if (rate > 4.5) {
			System.out.println("Rate is too high, will not buy a house");
		} else {
			System.out.println("What is the price of the house?");
			int house = scanner.nextInt();

			if (house > 20000) {
				System.out.println("Will take a loan");
			} else {
				System.out.println("Will pay cash");
			}
		}
	}

}
