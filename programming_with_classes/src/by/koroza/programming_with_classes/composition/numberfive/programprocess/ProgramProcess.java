package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;

public class ProgramProcess {

	public static void process(TravelCampany campany) {
		creadePerson();
		

	}
	
	private static void creadePerson() {
		CreadPerson.creadePerson();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter last name (Example: Alexey)");
		String lastName = scan.nextLine();
		System.out.println("Enter first name (Example: Koroza)");
		String firstName = scan.nextLine();
	}
	
}