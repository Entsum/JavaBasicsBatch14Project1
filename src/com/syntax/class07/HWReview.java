package com.syntax.class07;

import java.util.Scanner;

public class HWReview {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scanner.nextLine();
		String language;

		
		// .toLowerCase all variables need to be in lower case
		// .toUpperCase all variables need to be in upper case
		
		switch (country.toLowerCase()) {
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "United States":
			language = "English";
			break;
		case "Germany":
			language = "German";
			break;
		case "Poland":
			language = "Polish";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "England":
			language = "English";
		default:
			language = "Unknown";
			break;
		}

		System.out.println("You are from "+country+" and your language is " + language);

	}

}
