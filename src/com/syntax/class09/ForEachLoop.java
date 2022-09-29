package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		 
		// only when we deal with arrays or collections
        // we can use for each loop, enhanced for loop, advanced for loop
		
		String[] iceCream = { "vanilla", "chocolate", "phistashio", "kulfi" };

		for (String flr : iceCream) {

			System.out.println(flr);
		}
		System.out.println("------------------------------------------------------------");

		 char[] letters = { 'A', 'B', 'C', 'D' };

	        for (char letter : letters) {

	            System.out.println(letter + "  ");
	        }
		System.out.println("-------------------------------------------------------------");
		
		int[] numbers= {12,25,46,16,7,3};
		
		//get all elements using regular for loop
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+" ");
		}
		System.out.println("--------------------------------------------------------------");
		
		//get all values using enhanced for loop
		// this loops only loops ONLY one way : from start to end
		for (int num:numbers) {
			System.out.println(num);
		}
	}

}
