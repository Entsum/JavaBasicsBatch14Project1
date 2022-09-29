package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 way to create a variable
		byte b = 10; // create a variable and assign value

		// 2 way to create a variable
		int i; // create a variable
		i = 100; // assign value

		// we need to create a variable only once
		// then we can use as many times as we want/need

		// 3 way
		// create variable = declare variable
		int num1, num2, num3;

		num1 = 100; // assign value or initialize a variable
		num2 = 200;
		num3 = 300;

		// int num1=100; error -> duplicate variable

		System.out.println(num2); // 200

		// can I change the value of a variable?

		num2 = 2000; // reassign the value

		System.out.println(num2);// 2000

		// one variable can hold only one value per line at the one time
		// then we can use as many times as we want/can

//Rules for identifiers=names (variables, methods, classes)
		// 1. cannot use keywords as identifiers
		// String new ="Hello"; -> error

		// 2. cannot have spaces in identifiers
		// string last name="smith"

		// 3. Identifiers cannot start with numbers
		// int 1number=123;
		int number1 = 123; // number can be anywhere after identifier

		/*
		 * 4. Identifiers cannot contain any special characters boolean hello!=true;
		 * char #chara="A";
		 * 
		 * except $ or _
		 */

		double $price$ = 9.98;
		float _price1 = 1.99F;

		/*
		 * Naming conventions
		 * 
		 * Class should start with upper case and follow camelCasing
		 * 
		 * variables should start with lower case and follow camelCasing
		 */
		String Weather = "hot"; // not preferred
		String myWeather = "cold"; // preferred

	}

}
