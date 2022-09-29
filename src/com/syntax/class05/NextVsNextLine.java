package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter full name");
		
		String name=scan.nextLine();
		System.out.println(name);

	}

}
