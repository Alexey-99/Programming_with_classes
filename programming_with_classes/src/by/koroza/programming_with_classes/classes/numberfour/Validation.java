package by.koroza.programming_with_classes.classes.numberfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	final static String ENTERED_OPERATION_NUMBER_INCORRACTLY = "You entered the operation number incorrectly.";
	final static String ENTERED_TRAIN_NUMBER_INCORRACTLY = "You entered the train number incorrectly.";
	final static String ENTERED_ANSWER_NUMBER_INCORRACTLY = "You entered the answer number incorrectly.";
	final static String DOES_NOT_HAVE_TRAIN_WITH_NUMBER = "Doesn't have train with this number '";
	final static String REG_EXR_ON_DIGITAL_INPUT = "\\d*";
	final static String REG_EXR_ENTERED_OPERATION_NUMBER_INCORRACTLY = "[0|1|2|3|4]";
	final static String REG_EXR_ENTERED_ANSWER_NUMBER_INCORRACTLY = "[0|1]";

	public static boolean validationOnCorrectInputNumberTrain(String numberTrain, Train[] trains) {
		boolean flagCorrectInput = validationOnDigitalInput(numberTrain);
		if (flagCorrectInput == true) {
			flagCorrectInput = validationOnPresenceTrainWithNumber(numberTrain, trains);
		}
		return flagCorrectInput;
	}

	public static boolean validationOnCorrectInputNumberOperaion(String numberOperation) {
		Pattern p = Pattern.compile(REG_EXR_ENTERED_OPERATION_NUMBER_INCORRACTLY);
		Matcher m = p.matcher(numberOperation);
		boolean flagCorrectInput = m.matches();
		if (flagCorrectInput == false) {
			System.out.println(ENTERED_OPERATION_NUMBER_INCORRACTLY);
		}
		return flagCorrectInput;
	}

	public static boolean validationAnswerOneOrZero(String answer) {
		Pattern p = Pattern.compile(REG_EXR_ENTERED_ANSWER_NUMBER_INCORRACTLY);
		Matcher m = p.matcher(answer);
		boolean isCorrectAnswer = m.matches();
		if (isCorrectAnswer == false) {
			System.out.println(ENTERED_ANSWER_NUMBER_INCORRACTLY);
		}
		return isCorrectAnswer;
	}

	private static boolean validationOnDigitalInput(String numberTrain) {
		Pattern p = Pattern.compile(REG_EXR_ON_DIGITAL_INPUT);
		Matcher m = p.matcher(numberTrain);
		boolean flagCorrectInput = m.matches();
		if (flagCorrectInput == false) {
			System.out.println(ENTERED_TRAIN_NUMBER_INCORRACTLY);
		}
		return flagCorrectInput;
	}

	private static boolean validationOnPresenceTrainWithNumber(String numberTrain, Train[] trains) {
		boolean flagCorrectInput = false;
		int number = Integer.parseInt(numberTrain);
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumberTrain() == number) {
				flagCorrectInput = true;
			}
		}
		if (flagCorrectInput == false) {
			System.out.println(DOES_NOT_HAVE_TRAIN_WITH_NUMBER + numberTrain + "'.");
		}
		return flagCorrectInput;
	}

}