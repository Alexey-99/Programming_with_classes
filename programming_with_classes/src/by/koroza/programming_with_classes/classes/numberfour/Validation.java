package by.koroza.programming_with_classes.classes.numberfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static boolean validationOnCorrectInputNumberTrain(String numberTrain, Train[] trains) {
		boolean flagCorrectInput = validationOnDigitalInput(numberTrain);
		if (flagCorrectInput == true) {
			flagCorrectInput = validationOnAvailabilityTrainWithNumber(numberTrain, trains);
		}
		return flagCorrectInput;
	}

	private static boolean validationOnDigitalInput(String numberTrain) {
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher(numberTrain);
		boolean flagCorrectInput = m.matches();
		return flagCorrectInput;
	}

	private static boolean validationOnAvailabilityTrainWithNumber(String numberTrain, Train[] trains) {
		boolean flagCorrectInput = false;
		int number = Integer.parseInt(numberTrain);
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumberTrain() == number) {
				flagCorrectInput = true;
			}
		}
		return flagCorrectInput;
	}
}
