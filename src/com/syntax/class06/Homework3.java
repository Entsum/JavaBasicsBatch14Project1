package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:");

		int num1 = scan.nextInt();

		System.out.println("Enter second number:");

		int num2 = scan.nextInt();

		System.out.println("Enter the Operator(+,-,*,/)");

		char operator = scan.next().charAt(0);
		double plus = num1+num2;
		double minus = num1-num2;
		double mult = num1*num2;
		double div = num1/num2;
		
		if (operator =='+') {
			System.out.println(plus);
		}else if (operator == '-') {
			System.out.println(minus);
		}else if (operator =='*') {
			System.out.println(mult);
		}else if (operator == '/') {
			System.out.println(div);
		}else {
			System.out.println("Please enter a valid operator");
		}

}
}