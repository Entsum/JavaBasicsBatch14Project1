package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please write any sentence");
		String sentence = input.nextLine();
		System.out.println(sentence);

	}

}