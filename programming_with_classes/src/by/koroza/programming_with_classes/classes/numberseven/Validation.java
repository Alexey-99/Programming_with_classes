package by.koroza.programming_with_classes.classes.numberseven;

public class Validation {
	private static final double ZERO = 0;
	private static final double FIVE_TENTHS_FROM_FORMULA_CALCULATION_AREA_TRIANGLE = 0.5;

	public static boolean validationCorrectSidesAndPoints(double sideAB, double sideBC, double sideCA, Point a, Point b,
			Point c) {
		boolean flagCorrect = validationCorrectSides(sideAB, sideBC, sideCA);
		if (flagCorrect == true) {
			flagCorrect = validationCorrectPoints(a, b, c);
		}
		return flagCorrect;
	}

	public static boolean validationCorrectSidesAndPoints(double sideAB, double sideBC, double sideCA, double pointAX,
			double pointAY, double pointBX, double pointBY, double pointCX, double pointCY) {
		boolean flagCorrect = validationCorrectSides(sideAB, sideBC, sideCA);
		if (flagCorrect == true) {
			flagCorrect = validationCorrectPoints(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
		}
		return flagCorrect;
	}

	public static boolean validationCorrectSides(double sideAB, double sideBC, double sideCA) {
		boolean flagCorrect = validationExistenceTriangleWithSides(sideAB, sideBC, sideCA);
		if (flagCorrect == true) {
			flagCorrect = validationSidesOnZero(sideAB, sideBC, sideCA);
		}
		return flagCorrect;
	}

	public static boolean validationCorrectPoints(Point a, Point b, Point c) {
		boolean flagCorrect = false;
		if (colculationArea(a, b, c) > ZERO) {
			flagCorrect = true;
		}
		return flagCorrect;
	}

	public static boolean validationCorrectPoints(double pointAX, double pointAY, double pointBX, double pointBY,
			double pointCX, double pointCY) {
		boolean flagCorrect = false;
		if (colculationArea(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY) > ZERO) {
			flagCorrect = true;
		}
		return flagCorrect;
	}

	private static boolean validationExistenceTriangleWithSides(double sideAB, double sideBC, double sideCA) {
		boolean flag = false;
		if (((sideAB + sideBC > sideCA) && (sideBC + sideCA > sideAB)) && (sideCA + sideAB > sideBC)) {
			flag = true;
		}
		return flag;
	}

	private static boolean validationSidesOnZero(double sideAB, double sideBC, double sideCA) {
		boolean flag = true;
		if ((sideAB == ZERO || sideBC == ZERO) || sideCA == ZERO) {
			flag = false;
		}
		return flag;
	}

	private static double colculationArea(Point a, Point b, Point c) {
		double area = FIVE_TENTHS_FROM_FORMULA_CALCULATION_AREA_TRIANGLE * (Math
				.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY())));
		return area;
	}

	private static double colculationArea(double pointAX, double pointAY, double pointBX, double pointBY,
			double pointCX, double pointCY) {
		double area = FIVE_TENTHS_FROM_FORMULA_CALCULATION_AREA_TRIANGLE
				* (Math.abs((pointBX - pointAX) * (pointCY - pointAY) - (pointCX - pointAX) * (pointBY - pointAY)));
		return area;
	}
}