package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewAndAddVoucher;

public class ViewAddedPersonTravelVouchers {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_TRAVEL_VOUCHER_DELETE = "enter the number of the travel voucher you want to delete or select another operation";
	private static final String SPACE = " ";

	public static boolean viewAddedPersonTravelVouchers(boolean isMainProcess, Person person) {
		boolean isExitOperation = true;
		String number = "";
		while (isExitOperation == true) {
			printPersonVouchersAndExit(person);
			number = enterNumberTravelVoucher(person);
			int numberInt = parseNumber(number);
			if (numberInt < person.getTravelVouchers().length) {

			} else if (numberInt == person.getTravelVouchers().length) {

			} else if (numberInt == person.getTravelVouchers().length + 1) {

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
		} while (ValidationViewAndAddVoucher.validationNumberTravelVoucher(number, person.getTravelVouchers()));
		return number;
	}

	private static int parseNumber(String number) {
		int numberInt = Integer.parseInt(number);
		return numberInt;
	}

	private static void deleteTravelVoucher(Person person, int number) {
		person.deleteTravelVoucher(number);
	}
}