package by.koroza.programming_with_classes.classes.numberseven;

public class Validation {

	public static boolean validationSide(double sideAB, double sideBC, double sideCA) {
		boolean flag = false;
		if (((sideAB + sideBC > sideCA) && (sideBC + sideCA > sideAB)) && (sideCA + sideAB > sideBC)) {
			flag = true;
		}
		return flag;
	}

}