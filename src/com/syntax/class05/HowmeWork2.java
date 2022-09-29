package com.syntax.class05;

import java.util.Scanner;

public class HowmeWork2 {

	public static void main(String[] args) {

		  Scanner aaa = new Scanner(System.in);

	        System.out.println("What's your birth month");
	        String month = aaa.nextLine();

	        if (month.equals("January")||  month.equals("February") || month.equals("December")) {
	            System.out.println("your birth season is Winter ");

	        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
	            System.out.println("your birth season is Spring ");

	        }

	        else if (month.equals("June") || month.equals("July") || month.equals("August")) {
	            System.out.println("your birth season is Summer ");

	        } else if (month.equals("September") || month.equals("October")||  month.equals("November")) {
	            System.out.println("your birth season is Fall ");

	        }
		
		}

	}


