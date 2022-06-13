package by.koroza.programming_with_classes.composition.numberfive.validation;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;
import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;
import static by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration.getTypes;

import java.util.regex.Pattern;

public class Validation {
	private static final String REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC = "[A-Z]{1}[a-z]+";

	public static boolean checkingOnHavingCountryInList(String country) {
		boolean isHavingCountry = false;
		for (String countryElement : getCountries()) {
			if (countryElement.equals(country)) {
				isHavingCountry = true;
			}
		}
		return isHavingCountry;
	}

	public static boolean checkingOnHavingCityInList(String city) {
		boolean isHavingCity = false;
		for (String cityElement : getCities()) {
			if (cityElement.equals(city)) {
				isHavingCity = true;
			}
		}
		return isHavingCity;
	}

	public static boolean checkingOnHavingTypeInList(String type) {
		boolean isHavingType = false;
		for (String typeElement : getTypes()) {
			if (typeElement.equals(type)) {
				isHavingType = true;
			}
		}
		return isHavingType;
	}

	public static boolean validationPersonName(String lastName) {
		boolean isCorrect = Pattern.matches(REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC, lastName);
		if (isCorrect == false) {
			System.out.println("You entered the last name incorrectly.");
		}
		return isCorrect;
	}
}