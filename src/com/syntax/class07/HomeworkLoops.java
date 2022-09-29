package com.syntax.class07;

public class HomeworkLoops {

	public static void main(String[] args) {
		/*
		 * 1. Print numbers from 1 to 100 in one line with spaces
		 * 2. print numbers from 100 to 1
		 * 3. print even numbers from 20 to 1 ( 2 ways)
		 * 4. print odd numbers between 20 and 50(2ways)
		 * 5. prompt the user to ask the name 3 times and print " good afternoon" + name
		 */

		// HW 1
		int i = 1;
		
		while (i<=100) {
			System.out.print(i + " ");
			i+=1;
		}
		System.out.println("--------------------------------------");
		
		//HW 2
		int j = 100;
		
		while (j>=1) {
			System.out.print(j+" ");
			j-=1;
		}
		System.out.println("---------------------------------------------");
		
		//HW 3
		int t = 20;
		
		while (t>=1) {
			System.out.print(t+" ");
			t-=2;
		}
		//2nd way
		while (t>=1) {
			if(t%2==0) {
				System.out.print(t+" ");
			}
			
		}
	}

}
