package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewAddedPersonTravelVouchers;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewAllTravelPackages;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewCitiesTravelPackages;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewCountriesTravelPackages;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations.ViewTypesTravelPackages;

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
				isMainProcess = ViewCountriesTravelPackages.viewCountriesThatHaveTravelPackages(campany, person,
						isMainProcess);
				break;
			case "2":
				isMainProcess = ViewCitiesTravelPackages.viewCitiesThatHaveTravelPackages(campany, person,
						isMainProcess);
				break;
			case "3":
				isMainProcess = ViewTypesTravelPackages.viewTypesThatHaveTravelPackages(campany, person, isMainProcess);
				break;
			case "4":
				isMainProcess = ViewAddedPersonTravelVouchers.viewAddedPersonTravelVouchers(isMainProcess, person);
			case "5":
				isMainProcess = false;
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