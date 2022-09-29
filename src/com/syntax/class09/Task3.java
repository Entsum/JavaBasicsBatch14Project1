package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 */
		
		String[] code= new String[5];
		
		code[0]="Java";
		code[1]="Saturday";
		code[2]="day";
		code[3]="coding";
		code[4]="is";
		
		System.out.println(code[1]+" "+code[4]+" "+code[0]+" "+code[3]+" "+code[2]);
		
	}

}
