package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   for (int i = 1; i < 3; i++) { // --> outer loop controls inner loop

	            System.out.println("Hello");

	            for (int j = 1; j >= 3; j++) { // --> inner loop depends on outer loop
	                System.out.println("Bye");

	            }
	        }

	        System.out.println(" -----------------------------  ");

	        for(int i=0; i<=2; i++) {

	            for(int j=1; j<4; j++) {

	                System.out.println(i+" "+j);

	            }
	        }

	        System.out.println("End of the code");
	    
	
	
	        // multiplication table
	        for(int i=1; i<=9; i++) {

	            for(int j=1; j<=9; j++)  {
	                System.out.println(i+" x "+j+" = "+i*j);
	            }

	            System.out.println(" ---------------  ");
	        }


	    }
	
	}


