package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CountryEnumeration {
	private static String[] COUNTRIES = { "Turkey", "Egypt", "Russia", "Italy", "Belarus", "Georgia", "Hungary" };

	public static String[] getCOUNTRIES() {
		return COUNTRIES;
	}

	public static void addCountry(String country) {
		boolean isHavingCountry = Validation.checkingOnHavingCountryInList(country);
		if (isHavingCountry == false) {

		}
	}
}