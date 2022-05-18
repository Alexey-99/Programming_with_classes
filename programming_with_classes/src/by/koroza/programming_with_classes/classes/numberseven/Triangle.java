package by.koroza.programming_with_classes.classes.numberseven;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Triangle {
	private double sideAB;
	private double sideBC;
	private double sideCA;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private static final String INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS = "You entered the length of the sides or coordinates points of the triangle incorrectly";
	private static final String INCORRECT_LENGTH_SIDES = "You entered the length of the sides of the triangle incorrectly";
	private static final String INCORRECT_LENGTH_SIDE = "You entered the length of the side of the triangle incorrectly";
	private static final String INCORRECT_COORDINATE_POINT = "You entered coordinate point of the triangle incorrectly";

	public Triangle(double sideAB, double sideBC, double sideCA, Point pointA, Point pointB, Point pointC)
			throws Exception {
		if (Validation.validationCorrectSidesAndPoints(sideAB, sideBC, sideCA, pointA, pointB, pointC) == true) {
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS);
		}
	}

	public Triangle(double sideAB, double sideBC, double sideCA, double pointAX, double pointAY, double pointBX, // TODO
			double pointBY, double pointCX, double pointCY) throws Exception {
		if (Validation.validationCorrectSidesAndPoints(sideAB, sideBC, sideCA, pointA, pointB, pointC) == true) {
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
			this.pointA = new Point(pointAX, pointAY);
			this.pointB = pointB;
			this.pointC = pointC;
		} else {
			throw new Exception(INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS);
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
			throw new Exception(INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS);
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

	public double calculationArea() {
		double semiPerimeter = calculationSemiPerimeter();
		double area = Math
				.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
		return area;
	}

	public double calculationPerimeter() {
		double perimeter = sideAB + sideBC + sideCA;
		return perimeter;
	}

	private double calculationSemiPerimeter() {
		double perimeter = calculationPerimeter();
		double semiPerimeter = perimeter / 2;
		return semiPerimeter;
	}

	private Point findThirdPoint() {
		double cosACB = (pow(sideCA, 2) + pow(sideBC, 2) - pow(sideAB, 2)) / (2 * sideCA * sideBC);
		double sinACB = 0;
		double xThird = pointB.getX() + sideCA * cosACB;
		double yThird = pointB.getY() + sideCA * sinACB;
		Point pointC = new Point(xThird, yThird);
		return pointC;
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
		result = result * prime + (INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS != null
				? INCORRECT_LENGTH_SIDES_AND_COORDINATES_POINTS.hashCode()
				: 1);
		result = result * prime + (INCORRECT_LENGTH_SIDES != null ? INCORRECT_LENGTH_SIDES.hashCode() : 1);
		result = result * prime + (INCORRECT_LENGTH_SIDE != null ? INCORRECT_LENGTH_SIDE.hashCode() : 1);
		result = result * prime + (INCORRECT_COORDINATE_POINT != null ? INCORRECT_COORDINATE_POINT.hashCode() : 1);
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
		return build.toString();
	}
}