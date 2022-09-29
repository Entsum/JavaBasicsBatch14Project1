package com.syntax.class07;

import java.util.Scanner;

public class HW3Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
		 double result = 0;
	        boolean wrongOperator=false;
	        
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
			 wrongOperator=true;
	}
		  if (!wrongOperator) {
	            System.out.println(result);
		  }
	}
}
