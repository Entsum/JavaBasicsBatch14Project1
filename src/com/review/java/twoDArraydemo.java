package com.review.java;

public class twoDArraydemo {

	public static void main(String[] args) {
		
		String[] indiv = new String [] {"Taras", "Shah","Mina"};
		String[] indiv1 = new String [] {"Tanya", "Shaha","Minara"};
		String[] indiv2 = new String [] {"Tarasiy", "KShah","Milana"};
		
		//2D Array that will store 3 single D arrays
		
		String[][] rooms=new String[3][];
		rooms[0]=indiv;
		rooms[1]=indiv1;
		rooms[2]=indiv2;
		
		System.out.println(rooms[2][2]);
		

	}

}
