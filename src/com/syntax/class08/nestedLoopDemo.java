package com.syntax.class08;

public class nestedLoopDemo {
public static void main(String[] args) {
	
	for (int i =1;  i<3;  i++) { 		// --> outer loop
		System.out.println("hello");


		for (int j=1; j>=3; j++) { 		//--> nested loop
		System.out.println("bye");

		}
		}
}
}
