package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import static by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration.getCities;

import java.util.Scanner;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationViewCitiesVouchers;

public class ViewCitiesTravelPackages {
	private static final String BACK = "Back";
	private static final String EXIT = "Exit from program";
	private static final String ENTER_NUMBER_CITY = "enter city number or back or exit program.";
	private static final String SPACE = " ";
	private static final String ARE_YOU_SURE_WANT_EXIT_OPERATION = "Are you sure you want to exit this operation? Yes - 0, No - 1";
	private static final String YES = "0";
	private static final String ARE_YOU_SURE_WANT_EXIT_PROGRAM = "Are you sure you want to exit the program? Yes - 0, No - 1";

	public static boolean viewCitiesThatHaveTravelPackages(TravelCampany campany, Person person,
			boolean isMainProcess) {
		TravelVoucher[] travelVouchers = campany.getTravelVouchers();
		boolean isExitOperation = true;
		String city = "";
		String answer = "";
		while (isExitOperation == true) {
			printCities();
			String number = enterNumberCity(person);
			int numberInt = Integer.parseInt(number);
			if (numberInt < getCities().length) {
				city = getCities()[numberInt];
				TravelVoucher[] travelVouchersByCity = createArrayTravelVochersSelectCity(travelVouchers, city);
				isMainProcess = ViewAndAddTravelPackages.viewAndAddTravelPackages(person, isMainProcess,
						travelVouchersByCity);
			} else if (numberInt == getCities().length) {
				answer = confirmationExitFromOperation();
				if (answer.equals(YES)) {
					isExitOperation = false;
				}
			} else if (numberInt == getCities().length + 1) {
				answer = confirmationExitFromProgramProcess();
				if (answer.equals(YES)) {
					isExitOperation = false;
					isMainProcess = false;
				}
			}
		}
		return isMainProcess;
	}

	private static void printCities() {
		CityEnumeration.printCities();
		System.out.println(getCities().length + " - " + BACK);
		System.out.println(getCities().length + 1 + " - " + EXIT);
	}

	@SuppressWarnings("resource")
	private static String enterNumberCity(Person person) {
		StringBuilder builder = new StringBuilder();
		builder.append(person.getLastName()).append(SPACE);
		builder.append(person.getFirstName()).append(SPACE);
		builder.append(person.getPatronymic()).append(SPACE);
		builder.append(ENTER_NUMBER_CITY);
		Scanner scan = new Scanner(System.in);
		String number = "";
		do {
			System.out.println(builder);
			number = scan.nextLine();
		} while (ValidationViewCitiesVouchers.validationEnterNumberCity(number) == false);
		return number;
	}

	private static TravelVoucher[] createArrayTravelVochersSelectCity(TravelVoucher[] travelVouchers, String city) {
		int length = countTravelVouchersWithCity(travelVouchers, city);
		TravelVoucher[] travelVouchersCity = new TravelVoucher[length];
		initializationArrayTravelVouchers(travelVouchers, travelVouchersCity, city);
		return travelVouchersCity;
	}

	private static int countTravelVouchersWithCity(TravelVoucher[] travelVouchers, String city) {
		int count = 0;
		for (TravelVoucher voucher : travelVouchers) {
			if (voucher.getCity().equals(city)) {
				count++;
			}
		}
		return count;
	}

	private static void initializationArrayTravelVouchers(TravelVoucher[] travelVouchers,
			TravelVoucher[] travelVouchersCity, String city) {
		int index = 0;
		for (int i = 0; i < travelVouchers.length; i++) {
			if (travelVouchers[i].getCity().equals(city)) {
				travelVouchersCity[index] = travelVouchers[i];
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
		} while (ValidationViewCitiesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}
	
	@SuppressWarnings("resource")
	private static String confirmationExitFromProgramProcess() {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println(ARE_YOU_SURE_WANT_EXIT_PROGRAM);
			answer = scan.nextLine();
		} while (ValidationViewCitiesVouchers.validationAnswerOnExit(answer) == false);
		return answer;
	}
}