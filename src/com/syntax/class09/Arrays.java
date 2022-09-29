package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		
		int [] arr= new int [4];
		//store elements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		System.out.println(arr[2]); //30
		System.out.println(arr[1]+arr[2]); //50
		
		// creating arrays and store classmates
		
		String[] names= new String[5];
		names[0]="Vera";
		names[1]="Shah";
		names[2]="Roman";
		names[3]="Guljan";
		names[4]="Viktoriia";
		
		System.out.println("Hello "+names[4]);
	}

}
