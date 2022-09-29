package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {

		int[] num = { 23, 44, 71, 16, 5555, 89, 345, 457 };
		
		int j = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > j)
				
				j = num[i];
		}
		System.out.println(j);

	}

}
