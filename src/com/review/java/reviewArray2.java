package com.review.java;
import java.util.Arrays;
public class reviewArray2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 30 };
		// last index is always size -1 because arrays index starts from zero
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {

		}
		System.out.println("-----------------------------------------------------------------------------------------");

		String[] dresses = new String[] { "Pink Dress", "cocktail", "Summer Dress", "Night Dress", "Pencil Dress" };
		// last index is always size-1 because arrays
		// index start from zero
		System.out.println(dresses.length);
		// Mostly used
		for (int i = 0; i < dresses.length; i++) {
			System.out.println("Lets try " + dresses[i]);
		}

		for (String dress : dresses) {
			System.out.println(dress);
		}
		System.out.println("*****************************************************************************************");

		// prints all the elements of an array without a loop
		System.out.println(Arrays.toString(dresses));

	}

}
