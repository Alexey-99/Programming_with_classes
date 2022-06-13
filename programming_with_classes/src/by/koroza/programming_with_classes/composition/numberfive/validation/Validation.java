package by.koroza.programming_with_classes.composition.numberfive.validation;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;
import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;

public class Validation {

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
}