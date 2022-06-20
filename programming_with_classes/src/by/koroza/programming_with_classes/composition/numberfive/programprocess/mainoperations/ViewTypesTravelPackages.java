package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import static by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration.getTypes;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewTypesVouchers;

public class ViewTypesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_TYPE = "enter type number or back or exit program.";
	private static final String SPACE = " ";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";

	public static boolean viewTypesThatHaveTravelPackages(TravelCampany campany, Person person, boolean isMainProcess) {
		TravelVoucher[] travelVouchers = campany.getTravelVouchers();
		boolean isExitOperation = true;
		String type = "";
		String answer = "";
		while (isExitOperation == true) {
			printTypes();
			String number = enterNumberType(person);
			int numberInt = Integer.parseInt(number);
			if (numberInt < getTypes().length) {
				type = getTypes()[numberInt];
				TravelVoucher[] travelVouchersByType = createArrayTravelVochersSelectType(travelVouchers, type);
				isMainProcess = ViewAndAddTravelPackages.viewAndAddTravelPackages(person, isMainProcess,
						travelVouchersByType);
			} else if (numberInt == getTypes().length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isExitOperation = false;
				}
			} else if (numberInt == getTypes().length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isExitOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
	}

	private static void printTypes() {
		TypeEnumeration.printCities();
		System.out.println(getTypes().length + " - " + BACK);
		System.out.println(getTypes().length + 1 + " - " + EXIT);
	}

	@SuppressWarnings("resource")
	private static String enterNumberType(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(ENTER_NUMBER_TYPE);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			System.out.println(builder);
			number = scan.nextLine();
		} while (ValidationViewTypesVouchers.validationEnterNumberType(number) == false);
		return number;
	}

	private static TravelVoucher[] createArrayTravelVochersSelectType(TravelVoucher[] travelVouchers, String type) {
		int length = countTravelVouchersWithType(travelVouchers, type);
		TravelVoucher[] travelVouchersType = new TravelVoucher[length];
		initializationArrayTravelVouchers(travelVouchers, travelVouchersType, type);
		return travelVouchersType;
	}

	private static int countTravelVouchersWithType(TravelVoucher[] travelVouchers, String type) {
		int count = 0;
		for (TravelVoucher voucher : travelVouchers) {
			if (voucher.getTourType().equals(type)) {
				count++;
			}
		}
		return count;
	}

	private static void initializationArrayTravelVouchers(TravelVoucher[] travelVouchers,
			TravelVoucher[] travelVouchersType, String type) {
		int index = 0;
		for (int i = 0; i < travelVouchers.length; i++) {
			if (travelVouchers[i].getTourType().equals(type)) {
				travelVouchersType[index] = travelVouchers[i];
				index++;
			}
		}
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromOperation() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_OPERATION);
			answer = scan.nextLine();
		} while (ValidationViewTypesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromProgramProcess() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_PROGRAM);
			answer = scan.nextLine();
		} while (ValidationViewTypesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}
}