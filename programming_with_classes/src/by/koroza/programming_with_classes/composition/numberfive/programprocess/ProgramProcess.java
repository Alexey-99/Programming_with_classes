package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;

public class ProgramProcess {

	public static void process(TravelCampany campany) {
		Person person = createPerson();
		choiceMainAction();
	}

	private static Person createPerson() {
		Person person = CreatePerson.createPerson();
		return person;
	}
	
	private static void choiceMainAction() {
		ChoiceMainAction.choiceMainAction();
		
		
	}
}