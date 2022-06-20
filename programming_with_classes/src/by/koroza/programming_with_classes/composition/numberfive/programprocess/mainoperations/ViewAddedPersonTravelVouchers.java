package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewAndAddVoucher;

public class ViewAddedPersonTravelVouchers {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_TRAVEL_VOUCHER_DELETE = "enter the number of the travel voucher you want to delete or select another operation";
	private static final String SPACE = " ";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";

	public static boolean viewAddedPersonTravelVouchers(boolean isMainProcess, Person person) {
		boolean isExitOperation = true;
		String number = "";
		String answer = "";
		while (isExitOperation == true) {
			printPersonVouchersAndExit(person);
			number = enterNumberTravelVoucher(person);
			int numberInt = parseNumber(number);
			if (numberInt < person.getTravelVouchers().length) {
				deleteTravelVoucher(person, numberInt);
			} else if (numberInt == person.getTravelVouchers().length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isExitOperation = false;
				}
			} else if (numberInt == person.getTravelVouchers().length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isExitOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
	}

	private static void printPersonVouchersAndExit(Person person) {
		person.printTravelVouchers();
		System.out.println(person.getTravelVouchers().length + " - " + BACK);
		System.out.println(person.getTravelVouchers().length + 1 + " - " + EXIT);
	}

	@SuppressWarnings("resource")
	private static String enterNumberTravelVoucher(Person person) {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(ENTER_NUMBER_TRAVEL_VOUCHER_DELETE);
		String number = "";
		do {
			System.out.println(builder);
			number = scan.nextLine();
		} while (ValidationViewAndAddVoucher.validationNumberTravelVoucher(number, person.getTravelVouchers()) == false);
		return number;
	}

	private static int parseNumber(String number) {
		int numberInt = Integer.parseInt(number);
		return numberInt;
	}

	private static void deleteTravelVoucher(Person person, int number, TravelCampany campany) {
		person.deleteTravelVoucher(number);
		campany.getTravelVochers();
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromOperation() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_OPERATION);
			answer = scan.nextLine();
		} while (ValidationViewAndAddVoucher.validationAnswerOnExit(answer) == false);
		return answer;
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromProgramProcess() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_PROGRAM);
			answer = scan.nextLine();
		} while (ValidationViewAndAddVoucher.validationAnswerOnExit(answer) == false);
		return answer;
	}
}