package by.koroza.programming_with_classes.composition.numberfive.validation;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;

import java.util.regex.Pattern;

public class ValidationViewCitiesVouchers {

	private static final String REG_EXR_HAVING_DIGITS = "\\d+";
	private static final int TWO_ADDITIONAL_OPERATIONS = 2;

	public static boolean validationEnterNumberCity(String number) {
		boolean isCorrect = validationOnHavingDigits(number);
		if (isCorrect == true) {
			isCorrect = validationOnHavingThisNumberCountry(number);
		}
		return isCorrect;
	}

	private static boolean validationOnHavingDigits(String number) {
		boolean isCorrect = Pattern.matches(REG_EXR_HAVING_DIGITS, number);
		return isCorrect;
	}

	private static boolean validationOnHavingThisNumberCountry(String number) {
		boolean isCorrect = true;
		int numberInt = parseIntNumber(number);
		if (numberInt >= getCities().length + TWO_ADDITIONAL_OPERATIONS) {
			isCorrect = false;
		}
		return isCorrect;
	}

	private static int parseIntNumber(String number) {
		int numberParse = Integer.parseInt(number);
		return numberParse;
	}
	
}