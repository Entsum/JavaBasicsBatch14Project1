package com.syntax.class05;

import java.util.Scanner;

/*
 * Auto import scanner 
 * windows: CTRL+Shift+O
 */

public class scannerRecap {

	public static void main(String[] args) {

		int i = 10;
		String str = "Hello";

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name");

		// To capture different different values we need to use different options
		String name = input.next();// String
		System.out.println("Nice to meet you! " + name);
		System.out.println("How old are you?");
		int age = input.nextInt();// capture int

		System.out.println(name + " is " + age + " years old");

		System.out.println("How much money do you have " + name);
		double money = input.nextDouble();// capturing double

		System.out.println(name + " has $" + money);

		System.out.println(name + " what is your grade");
		char grade = input.next().charAt(0);

		System.out.println(name + " has grade " + grade);
		
		System.out.println("Please enter another name");
		name = input.next();
		System.out.println("New name "+name);
		
		System.out.println("End");

	}

}
