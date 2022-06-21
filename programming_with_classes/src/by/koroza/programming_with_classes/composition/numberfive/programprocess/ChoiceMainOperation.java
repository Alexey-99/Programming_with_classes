package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.enums.MainOperationEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationMainOperations;

public class ChoiceMainOperation {
	private static final String ENTER_NUMBER_OPERATION = "enter number operation";
	private static final String SPACE = " ";

	public static String choiceMainOperation(Person person) {
		MainOperationEnumeration.printOperations();
		String numberOperation = inputNumberOperation(person);
		return numberOperation;
	}

	@SuppressWarnings("resource")
	private static String inputNumberOperation(Person person) {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(ENTER_NUMBER_OPERATION);
		String numberOperation = "";
		do {
			System.out.println(builder);
			numberOperation = scan.nextLine();
		} while (ValidationMainOperations.validationNumberMainOperation(numberOperation) == false);
		return numberOperation;
	}
}