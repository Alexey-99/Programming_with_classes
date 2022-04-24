package by.koroza.programming_with_classes.classes.numberfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static boolean validationOnCorrectInputNumberTrain(String numberTrain, Train[] trains) {
		boolean flagCorrectInput = validationOnDigitalInput(numberTrain);
		if (flagCorrectInput == true) {
			flagCorrectInput = validationOnPresenceTrainWithNumber(numberTrain, trains);
		}
		if (flagCorrectInput == false) {
			System.out.println("You entered the operation number incorrectly.");
		}
		return flagCorrectInput;
	}

	public static boolean validationOnCorrectInputNumberOperaion(String numberOperation) {
		Pattern p = Pattern.compile("[0|1|2|3|4]");
		Matcher m = p.matcher(numberOperation);
		boolean flagCorrectInput = m.matches();
		if (flagCorrectInput == false) {
			System.out.println("You entered the operation number incorrectly.");
		}
		return flagCorrectInput;
	}

	private static boolean validationOnDigitalInput(String numberTrain) {
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher(numberTrain);
		boolean flagCorrectInput = m.matches();
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
		return flagCorrectInput;
	}
}