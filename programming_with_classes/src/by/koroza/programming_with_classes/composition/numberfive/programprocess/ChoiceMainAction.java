package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.enums.MainOperationEnumeration;

public class ChoiceMainAction {

	public static void choiceMainAction(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(" ");
		builder.append(person.getFirstName()).append(" ");
		builder.append(person.getPatronymic()).append(" enter number operation");
		System.out.println(builder);
		MainOperationEnumeration.printOperations();
	}
}