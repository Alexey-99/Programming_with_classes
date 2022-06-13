package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

public class CreadPerson {

	public static void creadePerson() {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter last name (Example: Alexey)");
		String lastName = enterLastName();
		//System.out.println("Enter first name (Example: Koroza)");
		//String firstName = scan.nextLine();
	}

	private static String enterLastName() {
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		do {
			System.out.println("Enter last name (Example: Koroza)");
			lastName = scan.nextLine();
		} while (false);
		return lastName;
	}

}