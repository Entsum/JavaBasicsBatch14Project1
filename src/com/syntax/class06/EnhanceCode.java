package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("What time is it? Use 24 hour format");
		int hour = scanner.nextInt();
		String timeOfTheDay;

		if (hour >= 1 && hour <= 11) {
			timeOfTheDay = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			timeOfTheDay = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			timeOfTheDay = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			timeOfTheDay = "Night";
		} else {
			System.out.println("Wrong number is entered");
			timeOfTheDay = "Invalid";
		}

		System.out.println(timeOfTheDay);
	}

}
