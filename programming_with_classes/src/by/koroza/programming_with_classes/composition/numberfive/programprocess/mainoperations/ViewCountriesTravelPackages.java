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
				printTravelPackagesByCountry(travelVouchers, country);
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

	private static void printTravelPackagesByCountry(TravelVoucher[] travelVouchers, String country) { 
		// 1 - new Array with Travel Vouchers with select Country
		//     a) array.length  count travel vouchers with select country 
		//     b) create array with array.lenth + 2
		//     с) add travel vouchers with select country to array
		// 2 - print
		int count = 0;
		for (int i = 0; i < travelVouchers.length + TWO_ADDITIONAL_OPERATIONS; i++) {
			if (i < travelVouchers.length) {
				if (travelVouchers[i].getCountry().equals(country)) {
					System.out.println(count + " - " + travelVouchers[i].toString());
					count++;
				}
			} else if (i == travelVouchers.length) {
				System.out.println(count + " - " + BACK);
				count++;
			} else if (i == travelVouchers.length + 1) {
				System.out.println(count + " - " + EXIT);
				count++;
			}
		}
	}
}