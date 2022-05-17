package by.koroza.programming_with_classes.classes.numberseven;

public class Validation {

	public static boolean validationSide(double sideA, double sideB, double sideC) {
		boolean flag = false;
		if (((sideA + sideB > sideC) && (sideB + sideC > sideA)) && (sideC + sideA > sideB)) {
			flag = true;
		}
		return flag;
	}

}
//127