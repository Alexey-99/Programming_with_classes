package by.koroza.programming_with_classes.composition.numberfive.programprocess.mainoperations;

import by.koroza.programming_with_classes.composition.numberfive.entity.Person;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;

public class ViewAllTravelPackages {

	public static boolean viewAllTravelPackages(TravelCampany campany, Person person, boolean isMainProcess) {
		TravelVoucher[] travelVouchers = campany.getTravelVochers();
		isMainProcess = ViewAndAddTravelPackages.viewAndAddTravelPackages(person, isMainProcess, travelVouchers);
		return isMainProcess;
	}
}