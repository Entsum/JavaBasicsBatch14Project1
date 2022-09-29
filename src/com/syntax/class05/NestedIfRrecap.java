package com.syntax.class05;

public class NestedIfRrecap {

	public static void main(String[] args) {

		/*
		 * to format the code windows Ctrl+Shift+F
		 */

		boolean allergy = true;
		String allergyType = "Wheat";

		if (allergy) {
			System.out.println("Lets check what allergy you have");

			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("please stay away from Peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("stay away from Dairy");
			} else {
				System.out.println("We need to do some tests");
			}

		} else {
			System.out.println("You are lucky");
		}
	}
}
