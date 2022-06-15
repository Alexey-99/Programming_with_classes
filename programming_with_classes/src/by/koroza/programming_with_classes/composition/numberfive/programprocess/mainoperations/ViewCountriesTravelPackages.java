package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;

import java.util.Scanner;

public class ViewCountriesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_COUNTRY = "enter country number or back or exit program.";

	public static boolean viewCountriesThatHaveTravelPackages(Person person, boolean isMainProcess) {
		boolean isExitOperation = true;
		while (isExitOperation == true) {
			printCountries();
			enterNumberCountry(person);
		}
		return isMainProcess;
	}

	private static void printCountries() {
		CountryEnumeration.printCountries();
		System.out.println(getCountries().length + " - " + BACK);
		System.out.println(getCountries().length + 1 + " - " + EXIT);
	}

	@SuppressWarnings("resource")
	private static String enterNumberCountry(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(" ");
		builder.append(person.getFirstName()).append(" ");
		builder.append(person.getPatronymic()).append(" ");
		builder.append(ENTER_NUMBER_COUNTRY);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			System.out.println(builder);
			number = scan.nextLine();
		} while (false);
		return number;
	}
}