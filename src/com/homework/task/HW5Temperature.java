package com.homework.task;

import java.util.Scanner;

public class HW5Temperature {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature in
		 * the city is”
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("What city do you live in?");

		String City = scanner.nextLine();

		System.out.println("What is the temparature in your city?");
		int Temperature = scanner.nextInt();

		Temperature = (Temperature - 32) * 5 / 9;

		System.out.println("The temperature in the city is " + City + " " + Temperature + "C");

	}

}
