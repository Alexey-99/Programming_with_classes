package by.koroza.programming_with_classes.composition.numberfive.validation;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;
import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;
import static by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration.getTypes;

import java.util.regex.Pattern;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.enums.MainOperationEnumeration;

public class Validation {
	private static final String REG_EXR_FOR_LASTNAME_FIRSTNAME_PATRONYMIC = "[A-Z]{1}[a-z]+";
	private static final String REG_EXR_HAVING_DIGITS = "\\d+";
	private static final String YOU_ENTERED_INCORRECTLY = "You entered incorrectly.";
	private static final String YOU_ENTERED_NUMBER_OPERATION_INCORRECTLY = "You entered number operation incorrectly.";
	private static final String ENTERED_NUMBER_TRAVEL_VOUCHER = "Entered number add travel voucher.";

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
			System.out.println(YOU_ENTERED_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationNumberMainOperation(String numberOperation) {
		boolean isCorrect = validationOnHavingDigits(numberOperation);
		if (isCorrect == true) {
			isCorrect = validationOnHavingThisNumberOperation(numberOperation);
		}
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_NUMBER_OPERATION_INCORRECTLY);
		}
		return isCorrect;
	}

	public static boolean validationNumberTravelVoucher(String numberOperation, TravelVoucher[] travelVoucher) {
		boolean isCorrect = validationOnHavingDigits(numberOperation);
		if (isCorrect == true) {
			isCorrect = validationOnHavingThisNumberTravelVoucher(numberOperation, travelVoucher);
		}
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_INCORRECTLY);
			System.out.println(ENTERED_NUMBER_TRAVEL_VOUCHER);
		}
		return isCorrect;
	}

	private static boolean validationOnHavingDigits(String numberOperation) {
		boolean isCorrect = Pattern.matches(REG_EXR_HAVING_DIGITS, numberOperation);
		return isCorrect;
	}

	private static boolean validationOnHavingThisNumberOperation(String numberOperation) { // TODO
		boolean isCorrect = false;
		int number = parseNumberOperation(numberOperation);
		if (number < MainOperationEnumeration.getOperations().length) {
			isCorrect = true;
		}
		return isCorrect;
	}

	private static int parseNumberOperation(String numberOperation) {
		int number = Integer.parseInt(numberOperation);
		return number;
	}

	private static boolean validationOnHavingThisNumberTravelVoucher(String numberOperation,
			TravelVoucher[] travelVoucher) {
		boolean isCorrect = false;
		int number = parseNumberOperation(numberOperation);
		if (number < travelVoucher.length + 2) {
			isCorrect = true;
		}
		return isCorrect;
	}
}