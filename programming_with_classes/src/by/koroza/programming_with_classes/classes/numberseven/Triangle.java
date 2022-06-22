package by.koroza.programming_with_classes.classes.numberseven;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;

public class Triangle {
	private double sideAB;
	private double sideBC;
	private double sideCA;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private static final String INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS = "You entered the length of the sides or coordinates points of the triangle incorrectly";
	private static final String INCORRECT_LENGTH_SIDES = "You entered the length of the sides of the triangle incorrectly";
	private static final String INCORRECT_LENGTH_SIDE = "You entered the length of the side of the triangle incorrectly";
	private static final String INCORRECT_COORDINATE_POINT = "You entered coordinate point of the triangle incorrectly";
	private static final String NEXT_LINE = "\n";
	private static final String SIDE_AB = "SideAB - ";
	private static final String SIDE_BC = "SideBC - ";
	private static final String SIDE_CA = "SideCA - ";
	private static final String POINT_A = "Point A: ";
	private static final String POINT_B = "Point B: ";
	private static final String POINT_C = "Point C: ";

	private static final String AREA_TRIANGLE = "Area triangle - ";
	private static final String PERIMETER_TRIANGLE = "Perimeter triangle - ";
	private static final String POINT_INTERSECTION_MEDIANS = "Point intersection medians: ";

	private static final double THREE_FROM_FORMULA_CALCULATION_POINT_INTERSCTION__MEDIANS = 3;
	private static final double TWO_FROM_FORMULA_CALCULATION_SEMI_PERIMETER = 2;
	private static final double TWO_FROM_FORMULA_CALCULATION_COSINE_ANGLE_FOR_THRIRD_POINT = 2;
	private static final double ONE_FROM_FORMULA_CALCULATION_SINE_ANGLE_FOR_THRIRD_POINT = 1;
	private static final double DEFAULT_SIDE_LENGTH_OF_TRIANGLE = 1;
	private static final double DEFAULT_COORDINATE_POINT_OF_TRIANGLE = 0;

	public Triangle() throws Exception {
		double aB = DEFAULT_SIDE_LENGTH_OF_TRIANGLE;
		double bC = DEFAULT_SIDE_LENGTH_OF_TRIANGLE;
		double cA = DEFAULT_SIDE_LENGTH_OF_TRIANGLE;
		Point a = new Point(DEFAULT_COORDINATE_POINT_OF_TRIANGLE, DEFAULT_COORDINATE_POINT_OF_TRIANGLE);
		Point b = new Point(DEFAULT_COORDINATE_POINT_OF_TRIANGLE, bC);
		Point c = findThirdPoint(aB, bC, cA, b);
		if (Validation.validationCorrectSidesAndPoints(aB, bC, cA, a, b, c) == true) {
			this.sideAB = aB;
			this.sideBC = bC;
			this.sideCA = cA;
			this.pointA = a;
			this.pointB = b;
			this.pointC = c;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS);
		}
	}

	public Triangle(double sideAB, double sideBC, double sideCA, Point pointA, Point pointB, Point pointC)
			throws Exception {
		double aB = abs(sideAB);
		double bC = abs(sideBC);
		double cA = abs(sideCA);
		if (Validation.validationCorrectSidesAndPoints(aB, bC, cA, pointA, pointB, pointC) == true) {
			this.sideAB = aB;
			this.sideBC = bC;
			this.sideCA = cA;
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS);
		}
	}

	public Triangle(double sideAB, double sideBC, double sideCA, double pointAX, double pointAY, double pointBX,
			double pointBY, double pointCX, double pointCY) throws Exception {
		double aB = abs(sideAB);
		double bC = abs(sideBC);
		double cA = abs(sideCA);
		if (Validation.validationCorrectSidesAndPoints(aB, bC, cA, pointAX, pointAY, pointBX, pointBY, pointCX,
				pointCY) == true) {
			this.sideAB = aB;
			this.sideBC = bC;
			this.sideCA = cA;
			this.pointA = new Point(pointAX, pointAY);
			this.pointB = new Point(pointBX, pointBY);
			this.pointC = new Point(pointCX, pointCY);
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS);
		}
	}

	public Triangle(double sideAB, double sideBC, double sideCA) throws Exception {
		double aB = abs(sideAB);
		double bC = abs(sideBC);
		double cA = abs(sideCA);
		if (Validation.validationCorrectSides(aB, bC, cA) == true) {
			this.sideAB = aB;
			this.sideBC = bC;
			this.sideCA = cA;
			this.pointA = new Point(0, 0);
			this.pointB = new Point(0, bC);
			this.pointC = findThirdPoint();
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES);
		}
	}

	public Triangle(Point pointA, Point pointB, Point pointC) throws Exception {
		double sideAB = abs(sqrt(pow((pointB.getX() - pointA.getX()), 2) + pow((pointB.getY() - pointA.getY()), 2)));
		double sideBC = abs(sqrt(pow((pointC.getX() - pointB.getX()), 2) + pow((pointC.getY() - pointB.getY()), 2)));
		double sideCA = abs(sqrt(pow((pointA.getX() - pointC.getX()), 2) + pow((pointA.getY() - pointC.getY()), 2)));
		if (Validation.validationCorrectSidesAndPoints(sideAB, sideBC, sideCA, pointA, pointB, pointC) == true) {
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS);
		}
	}

	public Triangle(double pointAX, double pointAY, double pointBX, double pointBY, double pointCX, double pointCY)
			throws Exception {
		double sideAB = abs(sqrt(pow((pointBX - pointAX), 2) + pow((pointBY - pointAY), 2)));
		double sideBC = abs(sqrt(pow((pointCX - pointBX), 2) + pow((pointCY - pointBY), 2)));
		double sideCA = abs(sqrt(pow((pointAX - pointCX), 2) + pow((pointAY - pointCY), 2)));
		if (Validation.validationCorrectSidesAndPoints(sideAB, sideBC, sideCA, pointAX, pointAY, pointBX, pointBY,
				pointCX, pointCY) == true) {
			this.pointA = new Point(pointAX, pointAY);
			this.pointB = new Point(pointBX, pointBY);
			this.pointC = new Point(pointCX, pointCY);
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS);
		}
	}

	public double getSideAB() {
		return sideAB;
	}

	public void setSideAB(double sideAB) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideAB = sideAB;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDE);
		}
	}

	public double getSideBC() {
		return sideBC;
	}

	public void setSideBC(double sideBC) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideBC = sideBC;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDE);
		}
	}

	public double getSideCA() {
		return sideCA;
	}

	public void setSideCA(double sideCA) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideCA = sideCA;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDE);
		}
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) throws Exception {
		if (Validation.validationCorrectPoints(pointA, pointB, pointC) == true) {
			this.pointA = pointA;
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public void setPointA(double pointAX, double pointAY) throws Exception {
		if (Validation.validationCorrectPoints(pointAX, pointAY, pointB.getX(), pointB.getY(), pointC.getX(),
				pointC.getY()) == true) {
			this.pointA = new Point(pointAX, pointAY);
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) throws Exception {
		if (Validation.validationCorrectPoints(pointA, pointB, pointC) == true) {
			this.pointB = pointB;
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public void setPointB(double pointBX, double pointBY) throws Exception {
		if (Validation.validationCorrectPoints(pointA.getX(), pointA.getY(), pointBX, pointBY, pointC.getX(),
				pointC.getY()) == true) {
			this.pointB = new Point(pointBX, pointBY);
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) throws Exception {
		if (Validation.validationCorrectPoints(pointA, pointB, pointC) == true) {
			this.pointC = pointC;
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public void setPointC(double pointCX, double pointCY) throws Exception {
		if (Validation.validationCorrectPoints(pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY(), pointCX,
				pointCY) == true) {
			this.pointC = new Point(pointCX, pointCY);
		} else {
			throw new Exception(INCORRECT_COORDINATE_POINT);
		}
	}

	public double calculationArea() {
		double semiPerimeter = calculationSemiPerimeter();
		double area = Math
				.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
		double areaRounding = roundingNumber(area);
		return areaRounding;
	}

	public double calculationPerimeter() {
		double perimeter = sideAB + sideBC + sideCA;
		return perimeter;
	}

	public Point calculationPointIntersectionMedians() {
		double x = (pointA.getX() + pointB.getX() + pointC.getX())
				/ THREE_FROM_FORMULA_CALCULATION_POINT_INTERSCTION__MEDIANS;
		double y = (pointA.getY() + pointB.getY() + pointC.getY())
				/ THREE_FROM_FORMULA_CALCULATION_POINT_INTERSCTION__MEDIANS;
		double xRounding = roundingNumber(x);
		double yRounding = roundingNumber(y);
		Point pointIntersectionMedians = new Point(xRounding, yRounding);
		return pointIntersectionMedians;
	}

	private double calculationSemiPerimeter() {
		double perimeter = calculationPerimeter();
		double semiPerimeter = perimeter / TWO_FROM_FORMULA_CALCULATION_SEMI_PERIMETER;
		double semiPerimeterRounding = roundingNumber(semiPerimeter);
		return semiPerimeterRounding;
	}

	private Point findThirdPoint() {
		double cosACB = (pow(sideCA, 2) + pow(sideBC, 2) - pow(sideAB, 2))
				/ (TWO_FROM_FORMULA_CALCULATION_COSINE_ANGLE_FOR_THRIRD_POINT * sideCA * sideBC);
		double sinACB = sqrt(ONE_FROM_FORMULA_CALCULATION_SINE_ANGLE_FOR_THRIRD_POINT - pow(cosACB, 2));
		double xThird = pointB.getX() + sideCA * cosACB;
		double yThird = pointB.getY() + sideCA * sinACB;
		double xThirdRounding = roundingNumber(xThird);
		double yThirdRounding = roundingNumber(yThird);
		Point pointC = new Point(xThirdRounding, yThirdRounding);
		return pointC;
	}

	private Point findThirdPoint(double sideAB, double sideBC, double sideCA, Point pointB) {
		double cosACB = (pow(sideCA, 2) + pow(sideBC, 2) - pow(sideAB, 2))
				/ (TWO_FROM_FORMULA_CALCULATION_COSINE_ANGLE_FOR_THRIRD_POINT * sideCA * sideBC);
		double sinACB = sqrt(ONE_FROM_FORMULA_CALCULATION_SINE_ANGLE_FOR_THRIRD_POINT - pow(cosACB, 2));
		double xThird = pointB.getX() + sideCA * cosACB;
		double yThird = pointB.getY() + sideCA * sinACB;
		double xThirdRounding = roundingNumber(xThird);
		double yThirdRounding = roundingNumber(yThird);
		Point pointC = new Point(xThirdRounding, yThirdRounding);
		return pointC;
	}

	private double roundingNumber(double number) {
		BigDecimal bigDecigmal = new BigDecimal(number);
		double roundingNumber = bigDecigmal.setScale(3, RoundingMode.DOWN).doubleValue();
		return roundingNumber;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(sideAB);
		result = result * prime + Double.hashCode(sideBC);
		result = result * prime + Double.hashCode(sideCA);
		result = result * prime + pointA.hashCode();
		result = result * prime + pointB.hashCode();
		result = result * prime + pointC.hashCode();
		result = result * prime + (INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS != null
				? INCORRECT_LENGTH_SIDES_OR_COORDINATES_POINTS.hashCode()
				: 1);
		result = result * prime + (INCORRECT_LENGTH_SIDES != null ? INCORRECT_LENGTH_SIDES.hashCode() : 1);
		result = result * prime + (INCORRECT_LENGTH_SIDE != null ? INCORRECT_LENGTH_SIDE.hashCode() : 1);
		result = result * prime + (INCORRECT_COORDINATE_POINT != null ? INCORRECT_COORDINATE_POINT.hashCode() : 1);
		result = result * prime + Double.hashCode(THREE_FROM_FORMULA_CALCULATION_POINT_INTERSCTION__MEDIANS);
		result = result * prime + Double.hashCode(TWO_FROM_FORMULA_CALCULATION_SEMI_PERIMETER);
		result = result * prime + Double.hashCode(TWO_FROM_FORMULA_CALCULATION_COSINE_ANGLE_FOR_THRIRD_POINT);
		result = result * prime + Double.hashCode(ONE_FROM_FORMULA_CALCULATION_SINE_ANGLE_FOR_THRIRD_POINT);
		result = result * prime + Double.hashCode(DEFAULT_SIDE_LENGTH_OF_TRIANGLE);
		result = result * prime + Double.hashCode(DEFAULT_COORDINATE_POINT_OF_TRIANGLE);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (SIDE_AB != null ? SIDE_AB.hashCode() : 1);
		result = result * prime + (SIDE_BC != null ? SIDE_BC.hashCode() : 1);
		result = result * prime + (SIDE_CA != null ? SIDE_CA.hashCode() : 1);
		result = result * prime + (POINT_A != null ? POINT_A.hashCode() : 1);
		result = result * prime + (POINT_B != null ? POINT_B.hashCode() : 1);
		result = result * prime + (POINT_C != null ? POINT_C.hashCode() : 1);

		result = result * prime + (AREA_TRIANGLE != null ? AREA_TRIANGLE.hashCode() : 1);
		result = result * prime + (PERIMETER_TRIANGLE != null ? PERIMETER_TRIANGLE.hashCode() : 1);
		result = result * prime + (POINT_INTERSECTION_MEDIANS != null ? POINT_INTERSECTION_MEDIANS.hashCode() : 1);

		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Triangle triangle = (Triangle) object;
		if (sideAB != triangle.sideAB) {
			return false;
		}
		if (sideBC != triangle.sideBC) {
			return false;
		}
		if (sideCA != triangle.sideCA) {
			return false;
		}
		if (pointA == null) {
			if (triangle.pointA != null) {
				return false;
			}
		} else if (!pointA.equals(triangle.pointA)) {
			return false;
		}
		if (pointB == null) {
			if (triangle.pointB != null) {
				return false;
			}
		} else if (!pointB.equals(triangle.pointB)) {
			return false;
		}
		if (pointC == null) {
			if (triangle.pointC != null) {
				return false;
			}
		} else if (!pointC.equals(triangle.pointC)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append(SIDE_AB).append(sideAB).append(NEXT_LINE);
		build.append(SIDE_BC).append(sideBC).append(NEXT_LINE);
		build.append(SIDE_CA).append(sideCA).append(NEXT_LINE);

		build.append(POINT_A).append(pointA.toString()).append(NEXT_LINE);
		build.append(POINT_B).append(pointB.toString()).append(NEXT_LINE);
		build.append(POINT_C).append(pointC.toString()).append(NEXT_LINE);

		build.append(AREA_TRIANGLE).append(calculationArea()).append(NEXT_LINE);
		build.append(PERIMETER_TRIANGLE).append(calculationPerimeter()).append(NEXT_LINE);
		build.append(POINT_INTERSECTION_MEDIANS).append(calculationPointIntersectionMedians().toString())
				.append(NEXT_LINE);
		return build.toString();
	}
}