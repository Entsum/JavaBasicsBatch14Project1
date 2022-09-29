package com.review.java;

public class Var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If we want to store whole numbers we can use below data types without decimal
		 * parts like 10,23,40000,1000000 etc but we can't use them to store decimal
		 * numbers like 12.3, 1.5, 100.4 etc. byte short int long although above four
		 * data types can be used to store whole numbers but we will be using int most
		 * of the times it can handle up to billions and does not waste a lot of space
		 * from RAM. RAM ( memory where computer stores the programs which are opened
		 * and running).
		 * 
		 */
		int box1 = 12;
		// int is data type.
		// box1 - variable name.
		// is assignment operator and use to store data in variable.
		// 12 its the data that we want to store in box1.
		// language rule we need to end all the lines.

		int box2; // creating a box but not storing data right away in the box
		box2 = 20; // assigning the value to box2

		box1 = 30; // reassigning the value 12 in box1 with 30

		System.out.println(box1);
		System.out.println(box2);

	}

}
