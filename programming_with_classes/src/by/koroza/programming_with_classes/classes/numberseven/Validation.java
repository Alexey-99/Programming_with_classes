package by.koroza.programming_with_classes.classes.numberseven;

public class Validation {

	public static boolean validationCorrectSidesAndPoints(double sideAB, double sideBC, double sideCA, Point a, Point b,
			Point c) {
		boolean flagCorrect = validationCorrectSides(sideAB, sideBC, sideCA);
		if (flagCorrect == true) {
			flagCorrect = validationCorrectPoints(a, b, c);
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
		if (colculationArea(a, b, c) > 0) {
			flagCorrect = true;
		}
		return flagCorrect;
	}

	public static boolean validationCorrectPoints(double pointAX, double pointAY, double pointBX, double pointBY,
			double pointCX, double pointCY) {
		boolean flagCorrect = false;
		if (colculationArea(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY) > 0) {
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
		if ((sideAB == 0 || sideBC == 0) || sideCA == 0) {
			flag = false;
		}
		return flag;
	}

	private static double colculationArea(Point a, Point b, Point c) {
		double area = 0.5 * (Math
				.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY())));
		return area;
	}

	private static double colculationArea(double pointAX, double pointAY, double pointBX, double pointBY,
			double pointCX, double pointCY) {
		double area = 0.5
				* (Math.abs((pointBX - pointAX) * (pointCY - pointAY) - (pointCX - pointAX) * (pointBY - pointAY)));
		return area;
	}
}