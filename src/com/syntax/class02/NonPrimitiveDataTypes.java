package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is just one example of non primitive data type

		String name = "Asma";
		String address = "123 address street";
		String phone = "123 456 7890";
		int age = 17;
		// String age="17"; //anything you put inside "" -> becomes String

		String character = "A";

		// ctr+space -> auto completes the statement
		// syso+ctrl+space
		System.out.println(name);

		// "My name is" + Asma
		System.out.println("My name is " + name);

		// Asma is 17
		System.out.println(name + " is " + age);

		String fruit = "apple";
		double price = 1.99;

		// the price of the apple is 1.99

		System.out.println("The price of the " + fruit + " is " + price);

		fruit = "mango";
		price = 4.99;

		// the price of mango is 4.99

		System.out.println("The price of the " + fruit + " is " + price);

		/*
		 * To attach any value(int, double, boolean, char, string etc) To a string we
		 * use + + next to the string acts as Concatenation
		 */

	}

}
