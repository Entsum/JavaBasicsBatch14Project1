package com.homework.task;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double a = 27.5;
		Double b = 8.5;
		Double sum = a + b;
		Double sub = a - b;
		Double mult = a * b;
		Double div = a / b;

		System.out.println("The sum on two numbers " + a + " and " + b + " is eequal to " + sum);
		System.out.println("The sub to two numbers " + a + " and " + b + " is equal to " + sub);
		System.out.println("The mult to two numbers " + a + " and " + b + " is equal to " + mult);
		System.out.println("The div to two numbers " + a + " and " + b + " is equal to " + div);

		// find the square

		Double num = 5.5;
		Double squeare = num * num;

		System.out.println("the squeare of the number " + num + " is " + squeare);

		// Find perimeter of a rectangle

		int w = 5;
		int h = 8;
		int per = (2 * (w + h));
		int area = w * h;

		System.out.println("The perimeter of a rectangle with width of " + w + " and height " + h + " is equal to "
				+ per + " and the area is " + area);

	}

}
