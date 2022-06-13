package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CountryEnumeration {
	private static String[] countries = new String[0];

	public static String[] getCountries() {
		return countries;
	}

	public static void setCountries(String[] countries) {
		CountryEnumeration.countries = countries;
	}

	public static void addCountryInList(String country) {
		boolean isHavingCountry = Validation.checkingOnHavingCountryInList(country);
		if (isHavingCountry == false) {
			addCountry(country);
		}
	}
	
	private static void addCountry(String country) {
		String[] countriesNew = new String[countries.length + 1];
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