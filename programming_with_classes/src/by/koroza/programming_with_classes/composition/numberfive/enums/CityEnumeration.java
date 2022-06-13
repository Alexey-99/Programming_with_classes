package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.Validation;

public class CityEnumeration {
	// private static String[] cities = { "Alanya", "Sharm El Sheikh", "St.
	// Petersburg", "San Marino", "Tbilisi",
	// "Kobuleti", "Slovakia", "Istanbul", "Moskow", "Kemer" };
	private static String[] cities = new String[0];

	public static String[] getCities() {
		return cities;
	}

	public static void setCities(String[] cities) {
		CityEnumeration.cities = cities;
	}

	public static void addCityInList(String city) {
		boolean isHavingCity = Validation.checkingOnHavingCityInList(city);
		if (isHavingCity == false) {
			addCity(city);
		}
	}

	private static void addCity(String city) {
		String[] citiesNew = new String[cities.length + 1];
		for (int i = 0; i < citiesNew.length; i++) {
			if (i < cities.length) {
				citiesNew[i] = cities[i];
			} else if (i == cities.length) {
				citiesNew[i] = city;
			}
		}
		cities = citiesNew;
	}
}