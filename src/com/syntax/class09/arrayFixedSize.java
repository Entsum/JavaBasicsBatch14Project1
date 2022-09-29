package com.syntax.class09;

public class arrayFixedSize {

	public static void main(String[] args) {
		
		   int[] nums=new int[3];
	        nums[1]=12;
	        nums[2]=13;
	        System.out.println(nums[1]);


	        String[] colors=new String[3];
	        colors[0]="White";
	        colors[1]="Pint";
	        colors[2]="Black";
	        //colors[3]="Yellow"; // Array IndexOutOfBoundsExceptions :3
	        System.out.println(colors);
	    

	}

}
