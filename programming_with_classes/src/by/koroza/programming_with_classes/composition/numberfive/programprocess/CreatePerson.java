package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CreatePerson {
	private static final String ENTER_LAST_NAME = "Enter last name (Example: Koroza)";
	private static final String ENTER_FIRST_NAME = "Enter first name (Example: Alexey)";
	private static final String ENTER_PATRONYMIC = "Enter patronymic (Example: Mikhailovich)";

	public static Person createPerson() {
		String lastName = enterLastName();
		String firstName = enterFirstName();
		String patronymic = enterPatronymic();
		Person person = new Person(lastName, firstName, patronymic);
		return person;
	}

	private static String enterLastName() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		do {
			System.out.println(ENTER_LAST_NAME);
			lastName = scan.nextLine();
		} while (Validation.validationPersonName(lastName) == false);
		return lastName;
	}

	private static String enterFirstName() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String firstName = "";
		do {
			System.out.println(ENTER_FIRST_NAME);
			firstName = scan.nextLine();
		} while (Validation.validationPersonName(firstName) == false);
		return firstName;
	}

	private static String enterPatronymic() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String patronymic = "";
		do {
			System.out.println(ENTER_PATRONYMIC);
			patronymic = scan.nextLine();
		} while (Validation.validationPersonName(patronymic) == false);
		return patronymic;
	}
}