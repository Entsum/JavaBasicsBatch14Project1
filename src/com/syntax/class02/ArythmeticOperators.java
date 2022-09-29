package com.syntax.class02;

public class ArythmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// +, -, *, /, %

		int a = 900;
		int b = 100;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		int c = 10;
		int d = 3;

		int sum = c + d;
		int sub = c - d;
		int remainder = c % d; // 10%3 = 1
		int div = c / d; // 10/3 = 3

		System.out.println("sum is = " + sum);
		System.out.println("sub is = " + sub);
		System.out.println("remainder is = " + remainder);
		System.out.println("Div is = " + div); // Divison of intigers 3

		int e = 10;
		int f = 3;

		System.out.println("remainder =" + e / f); // 2
		System.out.println("remainder =" + e % f);// 0

		System.out.println(20 % 9);

		double num1 = 10.0;
		double num2 = 3.0;

		System.out.println(num1 / num2); // division of double 3.3333333333333335
		System.out.println(num1 % num2);

		System.out.println("   Using float data type  -----");
		Float number1 = 10.0f;
		Float number2 = 3.0f;

		System.out.println("Division of Float = " + number1 / number2);
		System.out.println(number1 % number2);

		System.out.println(" remainder examples");

		// remainder - % - mod operator
		System.out.println(16 % 13);

		System.out.println(10 + 10 / 10); // 11
		System.out.println((10 + 10) / 10); // 2

	}

}
