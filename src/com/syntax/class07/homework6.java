package com.syntax.class07;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		
		 
        Scanner scanner= new Scanner(System.in);
        double priceCoffee=6;
        double pay;
        System.out.println("Please pay for your cofee");
    do {
        pay=scanner.nextDouble();
    if(pay<priceCoffee) {
        System.out.println("Please pay more");
    } 
    else if(pay>priceCoffee) {
        System.out.println("Please pay less ");
    }
    }while (pay!=priceCoffee);

        System.out.println("Please Enjoy Your Coffee");
            }

	}


