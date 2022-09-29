package Practice;

import java.util.Scanner;

public class ageReplit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number:");
		
		double num2 = scan.nextDouble();
		
		System.out.println("Enter the Operator(+,-,*,/)");
		
		char operator = scan.next().charAt(0);
		double result = 0.0;
		
		if (operator == '+');{
			result = num1+num2;
		}else if (operator =='-'); {
			result = num1-num2;
		}else if (operator =='*');{
			result = num1*num2;
		}else if (operator == '/');{
			result = num1/num2;
		}else {
			result = 0.0;
					System.out.println("Please enter valid operator");
		}
		System.out.println("Your result is: "+result);
		
	}

}
