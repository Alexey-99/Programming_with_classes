package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CreatePerson {

	public static Person createPerson() {
		String lastName = enterLastName();
		String firstName = enterFirstName();
		String patronymic = enterPatronymic();
		Person person = new Person(lastName, firstName, patronymic);
		return person;
	}

	private static String enterLastName() {
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		do {
			System.out.println("Enter last name (Example: Koroza)");
			lastName = scan.nextLine();
		} while (Validation.validationPersonName(lastName));
		scan.close();
		return lastName;
	}

	private static String enterFirstName() {
		Scanner scan = new Scanner(System.in);
		String firstName = "";
		do {
			System.out.println("Enter first name (Example: Alexey)");
			firstName = scan.nextLine();
		} while (Validation.validationPersonName(firstName));
		scan.close();
		return firstName;
	}

	private static String enterPatronymic() {
		Scanner scan = new Scanner(System.in);
		String patronymic = "";
		do {
			System.out.println("Enter patronymic (Example: Alexey)");
			patronymic = scan.nextLine();
		} while (Validation.validationPersonName(patronymic));
		scan.close();
		return patronymic;
	}

}