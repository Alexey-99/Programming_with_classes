package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CreatePerson {
	private static final String ENTER_LAST_NAME = "Enter last name (Example: Koroza)";
	private static final String ENTER_FIRST_NAME = "Enter first name (Example: Alexey)";
	private static final String ENTER_PATRONYMIC = "Enter patronymic (Example: Mikhailovich)";

	public static Person createPerson() {
		Person person = new Person(enterLastName(), enterFirstName(), enterPatronymic());
		return person;
	}

	@SuppressWarnings("resource")
	private static String enterLastName() {
		Scanner scan = new Scanner(System.in);
		String lastName = ""; 
		do {
			System.out.println(ENTER_LAST_NAME);
			lastName = scan.nextLine();
		} while (Validation.validationPersonName(lastName) == false);
		return lastName;
	}

	@SuppressWarnings("resource")
	private static String enterFirstName() {
		Scanner scan = new Scanner(System.in);
		String firstName = "";
		do {
			System.out.println(ENTER_FIRST_NAME);
			firstName = scan.nextLine();
		} while (Validation.validationPersonName(firstName) == false);
		return firstName;
	}

	@SuppressWarnings("resource")
	private static String enterPatronymic() {
		Scanner scan = new Scanner(System.in);
		String patronymic = "";
		do {
			System.out.println(ENTER_PATRONYMIC);
			patronymic = scan.nextLine();
		} while (Validation.validationPersonName(patronymic) == false);
		return patronymic;
	}
}