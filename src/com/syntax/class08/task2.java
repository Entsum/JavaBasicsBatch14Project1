package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		/*
		 * 2. create a secret number and let user guess the secret number
		 * once user guessed your secret number --> program says you won
		 */
		
		Scanner scan=new Scanner (System.in);
	     int secretno=20;
	    do {
	        System.out.println("Enter your secret number");
	        secretno=scan.nextInt();
	        }
	        while (secretno!=20);
	    System.out.println("You won!!");

		
	

	}

}
