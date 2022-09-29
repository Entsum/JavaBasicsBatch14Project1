package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 */
		char[] arr = new char[6];

		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		arr[5] = 'F';

		System.out.println(arr[1]);

		System.out.println("------------------------------------------");
//2nd way
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F' };

		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i] + " ");
		}

	}

}
