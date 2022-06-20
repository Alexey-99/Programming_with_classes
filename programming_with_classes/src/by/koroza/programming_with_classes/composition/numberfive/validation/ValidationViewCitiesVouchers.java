package by.koroza.programming_with_classes.composition.numberfive.validation;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;

import java.util.regex.Pattern;

public class ValidationViewCitiesVouchers {
	private static final String REG_EXR_HAVING_DIGITS = "\\d+";
	private static final String YES = "0";
	private static final String NO = "1";
	private static final String YOU_ENTERED_ANSWER_INCORRECTLY = "You entered answer incorrectly.";
	private static final int TWO_ADDITIONAL_OPERATIONS = 2;

	public static boolean validationEnterNumberCity(String number) {
		boolean isCorrect = validationOnHavingDigits(number);
		if (isCorrect == true) {
			isCorrect = validationOnHavingThisNumberCountry(number);
		}
		return isCorrect;
	}
	
	public static boolean validationAnswerOnExit(String answer) {
		boolean isCorrect = validationOnHavingDigits(answer);
		if (isCorrect == true) {
			isCorrect = validationOnHavingZeroOrOne(answer);
		}
		if (isCorrect == false) {
			System.out.println(YOU_ENTERED_ANSWER_INCORRECTLY);
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

	private static boolean validationOnHavingZeroOrOne(String answer) {
		boolean isCorrect = false;
		if (answer.equals(YES) || answer.equals(NO)) {
			isCorrect = true;
		}
		return isCorrect;
	}
}