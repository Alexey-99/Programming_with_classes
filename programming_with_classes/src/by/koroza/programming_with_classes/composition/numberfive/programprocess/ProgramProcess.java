package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewAllTravelPackages;

public class ProgramProcess {

	public static void process(TravelCampany campany) {
		Person person = createPerson();
		boolean isMainProcess = true;
		while (isMainProcess == true) {
			String numberOperation = choiceMainOperation(person);
			switch (numberOperation) {
			case "0":
				isMainProcess = ViewAllTravelPackages.viewAllTravelPackages(campany, person, isMainProcess);
				break;
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			}
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