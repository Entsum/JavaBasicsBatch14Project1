package com.syntax.class10;

public class EnhancedForLoopArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] ar= {
                {"Yusuf","Hamza","Adam","John"},
                {"A","B","C","D"}
        };
		
		for (String[] singleArray:ar) {
			
			for (String el:singleArray) {
				
				System.out.println(el+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		
		String[][] arr= {
                {"Yusuf","Hamza","Adam","John"},
                {"A","B","C","D"}
        };
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.println( arr[i][j]);
            }
        }
	}

}
