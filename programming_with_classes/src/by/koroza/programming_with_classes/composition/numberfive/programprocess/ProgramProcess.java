package by.koroza.programming_with_classes.composition.numberfive.programprocess;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;

public class ProgramProcess {

	public static void process(TravelCampany campany) {
		Person person = createPerson();
		String numberOperation = choiceMainOperation(person);
		switch (numberOperation) {
		case "0":
			viewAllTravelPackages(campany);
		case "1":
		case "2":
		case "3":
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

	private static void viewAllTravelPackages(TravelCampany campany) {
		TravelVoucher[] travelVoucher = campany.getTravelVochers();
		for (int i = 0; i < travelVoucher.length; i++) {
			System.out.println(i + " - " + travelVoucher[i].toString());
		}
	}
}