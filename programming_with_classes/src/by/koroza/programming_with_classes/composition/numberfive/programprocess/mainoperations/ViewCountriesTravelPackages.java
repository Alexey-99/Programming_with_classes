package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewCountriesVouchers;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;

import java.util.Scanner;

public class ViewCountriesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_COUNTRY = "enter country number or back or exit program.";
	private static final String SPACE = " ";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";

	public static boolean viewCountriesThatHaveTravelPackages(TravelCampany campany, Person person,
			boolean isMainProcess) {
		TravelVoucher[] travelVouchers = campany.getTravelVochers();
		boolean isExitOperation = true;
		String country = "";
		String answer = "";
		while (isExitOperation == true) {
			printCountries();
			String number = enterNumberCountry(person);
			int numberInt = Integer.parseInt(number);
			if (numberInt < getCountries().length) {
				country = getCountries()[numberInt];
				TravelVoucher[] travelVouchersByCountry = createArrayTravelVochersSelectCountry(travelVouchers,
						country);
				isMainProcess = ViewAndAddTravelPackages.viewAndAddTravelPackages(person, isMainProcess,
						travelVouchersByCountry);
			} else if (numberInt == getCountries().length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isExitOperation = false;
				}
			} else if (numberInt == getCountries().length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isExitOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
	}

	private static void printCountries() {
		CountryEnumeration.printCountries();
		System.out.println(getCountries().length + " - " + BACK);
		System.out.println(getCountries().length + 1 + " - " + EXIT);
	}

	@SuppressWarnings("resource")
	private static String enterNumberCountry(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(ENTER_NUMBER_COUNTRY);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			System.out.println(builder);
			number = scan.nextLine();
		} while (ValidationViewCountriesVouchers.validationEnterNumberCountry(number) == false);
		return number;
	}

	private static TravelVoucher[] createArrayTravelVochersSelectCountry(TravelVoucher[] travelVouchers,
			String country) {
		int length = countTravelVouchersWithCountry(travelVouchers, country);
		TravelVoucher[] travelVouchersCountry = new TravelVoucher[length];
		initializationArrayTravelVouchers(travelVouchers, travelVouchersCountry, country);
		return travelVouchersCountry;
	}

	private static int countTravelVouchersWithCountry(TravelVoucher[] travelVouchers, String country) {
		int count = 0;
		for (TravelVoucher voucher : travelVouchers) {
			if (voucher.getCountry().equals(country)) {
				count++;
			}
		}
		return count;
	}

	private static void initializationArrayTravelVouchers(TravelVoucher[] travelVouchers,
			TravelVoucher[] travelVouchersCountry, String country) {
		int index = 0;
		for (int i = 0; i < travelVouchers.length; i++) {
			if (travelVouchers[i].getCountry().equals(country)) {
				travelVouchersCountry[index] = travelVouchers[i];
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
		} while (ValidationViewCountriesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}

	@SuppressWarnings("resource")
	private static String confirmationExitFromProgramProcess() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_PROGRAM);
			answer = scan.nextLine();
		} while (ValidationViewCountriesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}
}