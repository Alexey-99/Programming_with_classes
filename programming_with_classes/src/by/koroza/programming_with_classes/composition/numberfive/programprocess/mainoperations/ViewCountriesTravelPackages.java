package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewAllVouchers;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewCountriesVouchers;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration.getCountries;

import java.util.Scanner;

public class ViewCountriesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_COUNTRY = "enter country number or back or exit program.";
	private static final String SPACE = " ";
	private static final String IF_ADD_TRAVEL_VOUCHER = "enter the number of the travel package if you want to add it to the desired package of travel packages, if not, enter the appropriate number";
	private static final String THIS_TRAVEL_VOUCHER_ADDED = "This travel voucher added.";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";
	private static final int TWO_ADDITIONAL_OPERATIONS = 2;

	public static boolean viewCountriesThatHaveTravelPackages(TravelCampany campany, Person person,
			boolean isMainProcess) {
		TravelVoucher[] travelVouchers = campany.getTravelVochers();
		boolean isExitOperation = true;
		String country = "";
		while (isExitOperation == true) {
			printCountries();
			String number = enterNumberCountry(person);
			int numberInt = Integer.parseInt(number);
			if (numberInt < getCountries().length) {
				country = getCountries()[numberInt];
				isMainProcess = viewAndAddTravelPackagesByCountry(person, isMainProcess, country, travelVouchers);
			} else if (numberInt == getCountries().length) {
				isExitOperation = false;
			} else if (numberInt == getCountries().length + 1) {
				isExitOperation = false;
				isMainProcess = false;
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

	private static void printTravelPackagesByCountry(TravelVoucher[] travelVouchersCountry, String country) {
		for (int i = 0; i < travelVouchersCountry.length + TWO_ADDITIONAL_OPERATIONS; i++) {
			if (i < travelVouchersCountry.length) {
				System.out.println(i + " - " + travelVouchersCountry[i].toString());
			} else if (i == travelVouchersCountry.length) {
				System.out.println(i + " - " + BACK);
			} else if (i == travelVouchersCountry.length + 1) {
				System.out.println(i + " - " + EXIT);
			}
		}
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

	private static boolean viewAndAddTravelPackagesByCountry(Person person, boolean isMainProcess, String country,
			TravelVoucher[] travelVouchers) {
		TravelVoucher[] travelVouchersByCountry = createArrayTravelVochersSelectCountry(travelVouchers, country);
		boolean isOperation = true;
		String answer = "";
		while (isOperation == true) {
			printTravelPackagesByCountry(travelVouchersByCountry, country);
			int number = enterNumberTravelVoucher(person, travelVouchersByCountry);
			if (number < travelVouchersByCountry.length) {
				if (travelVouchersByCountry[number].getIsStatusAdd() == false) {
					person.addTravelVoucher(travelVouchersByCountry[number]);
				} else {
					System.out.println(THIS_TRAVEL_VOUCHER_ADDED);
				}
			} else if (number == travelVouchersByCountry.length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isOperation = false;
				}
			} else if (number == travelVouchersByCountry.length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
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