package com.syntax.class07;

import java.util.Scanner;

public class homework5 {
	public static void main(String[] args) {

		for (int b = 1; b <= 3; b++) {

			System.out.println("What is your name?");

			Scanner scanner = new Scanner(System.in);

			String name = scanner.nextLine();

			System.out.println("Good afretnoon!  " + name);
		}
	}
}
