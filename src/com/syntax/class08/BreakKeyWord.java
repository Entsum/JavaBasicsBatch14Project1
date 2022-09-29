package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			System.out.println("Hello");

			if (i == 3) {
				break; 
				// breaks the loop and it usually used inside so type of conditions
			}

		}

		boolean hungry = true;
		while (hungry) {
			System.out.println("GIVE ME FOOD!!!!");
			break;
		}
		System.out.println("End");
	}

}
