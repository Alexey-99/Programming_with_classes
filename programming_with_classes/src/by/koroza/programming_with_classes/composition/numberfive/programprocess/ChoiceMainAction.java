package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.enums.MainOperationEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class ChoiceMainAction {

	public static void choiceMainAction(Person person) {
		MainOperationEnumeration.printOperations();
		inputNumberOperation(person);

	}

	@SuppressWarnings("resource")
	private static void inputNumberOperation(Person person) {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(" ");
		builder.append(person.getFirstName()).append(" ");
		builder.append(person.getPatronymic()).append(" enter number operation");
		String numberOperation = "";
		do {
			System.out.println(builder);
			numberOperation = scan.nextLine();
		} while (Validation.validationNumberMainOperation(numberOperation) == false);
	}
}