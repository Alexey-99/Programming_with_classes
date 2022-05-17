package by.koroza.programming_with_classes.classes.numbersix;

public class Validation {

	public static int validationHours(int hours) {
		int hoursMethod = 0;
		if (hours >= 0 && hours < 24) {
			hoursMethod = hours;
		} else {
			hoursMethod = 0;
		}
		return hoursMethod;
	}

	public static int validationMinutes(int minutes) {
		int minutesMethod = 0;
		if (minutes >= 0 && minutesMethod < 60) {
			minutesMethod = minutes;
		} else {
			minutesMethod = 0;
		}
		return minutesMethod;
	}

	public static int validationSeconds(int seconds) {
		int secondsMethod = 0;
		if (seconds >= 0 && seconds < 60) {
			secondsMethod = seconds;
		} else {
			secondsMethod = 0;
		}
		return secondsMethod;
	}

}
