package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your name");
		// Takes a string input from they keyboard and stores it in name variable

		String name = scanner.nextLine();
		System.out.println("Please enter your age");
		// Takes int from the keyboard and stores it in age variable
		int age = scanner.nextInt();
		System.out.println("hi " + name + " you are " + age + " years old");

	}

}
