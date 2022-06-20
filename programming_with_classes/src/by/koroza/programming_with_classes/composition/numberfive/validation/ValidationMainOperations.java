package by.koroza.programming_with_classes.composition.numberfive.validation;

import java.util.regex.Pattern;

import by.koroza.programming_with_classes.composition.numberfive.enums.MainOperationEnumeration;

public class ValidationMainOperations {
	private static final String YOU_ENTERED_NUMBER_OPERATION_INCORRECTLY = "You entered number operation incorrectly.";
	private static final String REG_EXR_HAVING_DIGITS = "\\d+";

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

	private static boolean validationOnHavingDigits(String numberOperation) {
		boolean isCorrect = Pattern.matches(REG_EXR_HAVING_DIGITS, numberOperation);
		return isCorrect;
	}

	private static boolean validationOnHavingThisNumberOperation(String numberOperation) {
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
}