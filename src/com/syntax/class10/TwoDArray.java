package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		
		String[][] countries = {

                { "Usa", "Canada" }, // 1 array with index 0
                { "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
                { "Ethiopia", "Egypt", "Kenya" }, { "Germany", "Turkiye", "Moldova", "Ukraine" },
                { "Kazakhstan", "Afghanistan", "Korea" } };

        System.out.println(" ------- getting all values from 2d array using for each loop -----");

        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }

	}

}
