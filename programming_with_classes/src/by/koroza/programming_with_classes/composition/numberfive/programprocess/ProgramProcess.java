package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewAllTravelPackages;

public class ProgramProcess {

	public static void process(TravelCampany campany) {
		Person person = createPerson();
		String numberOperation = choiceMainOperation(person);
		switch (numberOperation) {
		case "0":
			ViewAllTravelPackages.viewAllTravelPackages(campany);
		case "1":
		case "2":
		case "3":
		case "4":
		}
	}

	private static Person createPerson() {
		Person person = CreatePerson.createPerson();
		return person;
	}

	private static String choiceMainOperation(Person person) {
		String numberOperation = ChoiceMainOperation.choiceMainOperation(person);
		return numberOperation;
	}
}