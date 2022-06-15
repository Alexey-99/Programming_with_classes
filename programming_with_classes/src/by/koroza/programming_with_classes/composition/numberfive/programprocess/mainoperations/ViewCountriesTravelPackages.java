package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;

public class ViewCountriesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";

	public static boolean viewCountriesThatHaveTravelPackages(boolean isMainProcess) {
		printCountries();

		return isMainProcess;
	}

	private static void printCountries() {
		CountryEnumeration.printCountries();
		System.out.println(getCountries().length + " - " + BACK);
		System.out.println(getCountries().length + 1 + " - " + EXIT);
	}
}