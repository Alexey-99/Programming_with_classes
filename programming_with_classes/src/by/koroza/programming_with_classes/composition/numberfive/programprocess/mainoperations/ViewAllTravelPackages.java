package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class ViewAllTravelPackages {
	private static final String IF_ADD_TRAVEL_VOUCHER = "Enter the number of the travel package if you want to add it to the desired package of travel packages, if not, enter the appropriate number";
	private static final String EXIT = "Exit from program";
	private static final String BACK = "Back";

	public static void viewAllTravelPackages(TravelCampany campany, Person person) {
		TravelVoucher[] travelVoucher = campany.getTravelVochers();
		printTravelPackages(travelVoucher);
		int number = enterNumberTravelVoucher(person, travelVoucher);
		if (number < travelVoucher.length) {
			person.addTravelVoucher(travelVoucher[number]);
		}
	}

	private static void printTravelPackages(TravelVoucher[] travelVoucher) {
		for (int i = 0; i < travelVoucher.length + 2; i++) {
			if (i < travelVoucher.length) {
				System.out.println(i + " - " + travelVoucher[i].toString());
			} else if (i == travelVoucher.length) {
				System.out.println(i + " - " + BACK);
			} else if (i == travelVoucher.length + 1) {
				System.out.println(i + " - " + EXIT);
			}
		}
	}

	@SuppressWarnings("resource")
	private static int enterNumberTravelVoucher(Person person, TravelVoucher[] travelVoucher) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(" ");
		builder.append(person.getFirstName()).append(" ");
		builder.append(person.getPatronymic()).append(" ");
		builder.append(IF_ADD_TRAVEL_VOUCHER);
		System.out.println(builder);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			number = scan.nextLine();
		} while (Validation.validationNumberTravelVoucher(number, travelVoucher) == false);
		return parseNumber(number);
	}

	private static int parseNumber(String number) {
		int numberParse = Integer.parseInt(number);
		return numberParse;
	}
}