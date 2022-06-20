package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationOnHavingInList;

public class CityEnumeration {
	private static String[] cities = new String[0];

	public static String[] getCities() {
		return cities;
	}

	public static void setCities(String[] cities) {
		CityEnumeration.cities = cities;
	}

	public static void addCityInList(String city) {
		boolean isHavingCity = ValidationOnHavingInList.checkingOnHavingCityInList(city);
		if (isHavingCity == false) {
			addCity(city);
		}
	}

	public static void printCities() {
		for (int i = 0; i < cities.length; i++) {
			System.out.println(i + " - " + cities[i]);
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