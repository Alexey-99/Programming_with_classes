package by.koroza.programming_with_classes.composition.numberfive.validation;

import java.util.regex.Pattern;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;

public class ValidationViewAndAddVoucher {
	private static final String REG_EXR_HAVING_DIGITS = "\\d+";
	private static final String YOU_ENTERED_INCORRECTLY = "You entered incorrectly.";
	private static final String ENTERED_NUMBER_TRAVEL_VOUCHER = "Entered number add travel voucher.";
	private static final String YOU_ENTERED_ANSWER_INCORRECTLY = "You entered answer incorrectly.";
	private static final String YES = "0";
	private static final String NO = "1";
	private static final int TWO_ADDITIONAL_OPERATIONS = 2;
	
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
	
	private static boolean validationOnHavingDigits(String numberOperation) {
		boolean isCorrect = Pattern.matches(REG_EXR_HAVING_DIGITS, numberOperation);
		return isCorrect;
	}
	
	private static boolean validationOnHavingThisNumberTravelVoucher(String numberOperation,
			TravelVoucher[] travelVoucher) {
		boolean isCorrect = false;
		int number = parseNumberOperation(numberOperation);
		if (number < travelVoucher.length + TWO_ADDITIONAL_OPERATIONS) {
			isCorrect = true;
		}
		return isCorrect;
	}

	private static int parseNumberOperation(String numberOperation) {
		int number = Integer.parseInt(numberOperation);
		return number;
	}
	
	private static boolean validationOnHavingZeroOrOne(String answer) {
		boolean isCorrect = false;
		if (answer.equals(YES) || answer.equals(NO)) {
			isCorrect = true;
		}
		return isCorrect;
	}
}