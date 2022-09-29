package com.syntax.class08;

public class continueKeyWord {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			if (i == 3) {
				continue; //
			}
			System.out.println("you");
			System.out.println("I'm");
			System.out.println("soooo lost");
			System.out.println(i);

		}
			//print #'s from 1 to 20 except #'s 3,7 and 11
		
		for (int i=1; i<=20; i++) {
			
			if (i==3 || i==7 || i==11) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
