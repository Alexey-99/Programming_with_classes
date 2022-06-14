package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;

public class ViewAllTravelPackages {
	private static final String ADD_TRAVEL_VOUCHER = "Enter the number of the travel package if you want to add it to the desired package of travel packages, if not, enter the appropriate number";
	private static final String EXIT = "Exit";

	public static void viewAllTravelPackages(TravelCampany campany) {
		TravelVoucher[] travelVoucher = campany.getTravelVochers();
		printTravelPackages(travelVoucher);
		System.out.println(ADD_TRAVEL_VOUCHER);
	}

	private static void printTravelPackages(TravelVoucher[] travelVoucher) {
		for (int i = 0; i <= travelVoucher.length; i++) {
			if (i < travelVoucher.length) {
				System.out.println(i + " - " + travelVoucher[i].toString());
			}
			if (i == travelVoucher.length) {
				System.out.println(i + " - " + EXIT);
			}
		}
	}
}