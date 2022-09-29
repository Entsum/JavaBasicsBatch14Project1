package com.syntax.class04;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a Java program to check whether number is Even or Odd
		 */

		int number = 4;
		System.out.println(number % 2);
		// If we take the modulus of a number by 2 and answer is 0 it is an even number
		// Otherwise it is odd

		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
