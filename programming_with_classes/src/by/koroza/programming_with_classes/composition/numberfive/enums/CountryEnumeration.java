package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationOnHavingInList;

public class CountryEnumeration {
	private static String[] countries = new String[0];
	private static final int ONE_ELEMENT = 1;

	public static String[] getCountries() {
		return countries;
	}

	public static void setCountries(String[] countries) {
		CountryEnumeration.countries = countries;
	}

	public static void addCountryInList(String country) {
		boolean isHavingCountry = ValidationOnHavingInList.checkingOnHavingCountryInList(country);
		if (isHavingCountry == false) {
			addCountry(country);
		}
	}

	public static void printCountries() {
		for (int i = 0; i < countries.length; i++) {
			System.out.println(i + " - " + countries[i]);
		}
	}

	private static void addCountry(String country) {
		String[] countriesNew = new String[countries.length + ONE_ELEMENT];
		for (int i = 0; i < countriesNew.length; i++) {
			if (i < countries.length) {
				countriesNew[i] = countries[i];
			} else if (i == countries.length) {
				countriesNew[i] = country;
			}
		}
		countries = countriesNew;
	}
}