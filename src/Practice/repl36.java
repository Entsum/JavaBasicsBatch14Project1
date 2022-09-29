package Practice;

import java.util.Scanner;

public class repl36 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name = scanner.nextLine();
		String instructor;

		switch (name) {
		case  "Will take care of Java Assignment":
			instructor = "Asghar";
			break;
		case  "Will take care of SDLC Assignment":
			instructor = "Moazzam";
			break;
		case  "will take care of Selenium Assignment":
			instructor = "Wequas";
			break;
		case "Will take care of every Assignment":
			instructor = "Asel";
			break;
		default:
			instructor = "Invalid instructor selected";
			break;
		}
		System.out.println("Other than these for names " +name+ " Invalid instructor selected " +instructor);
	}

}
