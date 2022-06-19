package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewAllVouchers;

public class ViewAndAddTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String SPACE = " ";
	private static final String IF_ADD_TRAVEL_VOUCHER = "enter the number of the travel package if you want to add it to the desired package of travel packages, if not, enter the appropriate number";
	private static final String THIS_TRAVEL_VOUCHER_ADDED = "This travel voucher added.";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";
	private static final int TWO_ADDITIONAL_OPERATIONS = 2;

	public static boolean viewAndAddTravelPackages(Person person, boolean isMainProcess,
			TravelVoucher[] travelVouchers) {
		boolean isOperation = true;
		String answer = "";
		while (isOperation == true) {
			printTravelPackages(travelVouchers);
			int number = enterNumberTravelVoucher(person, travelVouchers);
			if (number < travelVouchers.length) {
				if (travelVouchers[number].getIsStatusAdd() == false) {
					person.addTravelVoucher(travelVouchers[number]);
				} else {
					System.out.println(THIS_TRAVEL_VOUCHER_ADDED);
				}
			} else if (number == travelVouchers.length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isOperation = false;
				}
			} else if (number == travelVouchers.length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
	}

	private static void printTravelPackages(TravelVoucher[] travelVouchers) {
		for (int i = 0; i < travelVouchers.length + TWO_ADDITIONAL_OPERATIONS; i++) {
			if (i < travelVouchers.length) {
				System.out.println(i + " - " + travelVouchers[i].toString());
			} else if (i == travelVouchers.length) {
				System.out.println(i + " - " + BACK);
			} else if (i == travelVouchers.length + 1) {
				System.out.println(i + " - " + EXIT);
			}
		}
	}

	@SuppressWarnings("resource")
	private static int enterNumberTravelVoucher(Person person, TravelVoucher[] travelVouchers) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(IF_ADD_TRAVEL_VOUCHER);
		System.out.println(builder);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			number = scan.nextLine();
		} while (ValidationViewAllVouchers.validationNumberTravelVoucher(number, travelVouchers) == false);
		return parseNumber(number);
	}

	private static int parseNumber(String number) {
		int numberParse = Integer.parseInt(number);
		return numberParse;
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromOperation() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_OPERATION);
			answer = scan.nextLine();
		} while (ValidationViewAllVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromProgramProcess() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_PROGRAM);
			answer = scan.nextLine();
		} while (ValidationViewAllVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}
}