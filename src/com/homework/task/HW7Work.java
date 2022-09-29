package com.homework.task;

import java.util.Scanner;

public class HW7Work {

	public static void main(String[] args) {

		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		System.out.println("How many years have you worked?");
		Scanner scanner = new Scanner(System.in);

		int yearsWorked = scanner.nextInt();
		System.out.println("What is your annual salary?");

		int annualSalary = scanner.nextInt();

		if (yearsWorked >= 5) {
			System.out.println("You are eligible for bonus");
			if (annualSalary > 50000) {
				System.out.println("Bonus will be 5000");
			} else {
				System.out.println("Bonus will be 3000");
			}
		} else {
			System.out.println("You are not eligible for bonus");
		}

	}

}
