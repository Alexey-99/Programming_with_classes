package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

public class CreadPerson {

	public static void creadePerson() {
		String lastName = enterLastName();
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