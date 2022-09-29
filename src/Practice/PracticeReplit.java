package Practice;

import java.util.Scanner;

public class PracticeReplit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.next();
		System.out.println("Enter your mobile number");
		String number = input.next();
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("Your name is " + name + ", Your age is " + age + " and your phone number is " + number);

	}

}
