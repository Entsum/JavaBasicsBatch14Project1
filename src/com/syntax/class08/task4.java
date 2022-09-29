package com.syntax.class08;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever user done with payments program should say "Thank you for shopping!"
		 */

		Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy? ");
        String item = scanner.nextLine();
        System.out.println("How much does it cost?");
        double price = scanner.nextDouble();
        double money;
        double total = 0;
        do {
        System.out.print("How much money do you have? ");
        money= scanner.nextDouble();
        total+=money; //accumulate all money
        double need;
        double change;
        if(total<price) {
            need=price-total;
            System.out.println("You need to pay more "+need);
        }
        else if (total>price) {
            change=total-price;
            System.out.println("Here is your change "+change);
            break;
        }
    }while (total!=price);
        System.out.println("Thank you for shopping");
	}

}
