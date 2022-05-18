package by.koroza.programming_with_classes.classes.numberseven;

public class Triangle {
	private double sideAB;
	private double sideBC;
	private double sideCA;
	private Point a;
	private Point b;
	private Point c;

	public Triangle(double sideAB, double sideBC, double sideCAы, Point a, Point b, Point c) throws Exception {
		if (Validation.validationCorrectSidesAndPoints(sideAB, sideBC, sideCA, a, b, c) == true) {
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new Exception("");
		}
	}

	public Triangle(double sideAB, double sideBC, double sideCA) throws Exception { // TODO CALCULATION POINTS
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideAB = sideAB;
			this.sideBC = sideBC;
			this.sideCA = sideCA;
			
		} else {
			throw new Exception("You entered the length of the sides of the triangle incorrectly");
		}
	}

	public Triangle(Point a, Point b, Point c) throws Exception { // TODO CALCULATION SIDES http://mathhelpplanet.com/viewtopic.php?f=33&t=10392
		if (Validation.validationCorrectPoints(a, b, c) == true) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new Exception("");
		}
	}

	public double getSideAB() {
		return sideAB;
	}

	public void setSideAB(double sideAB) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideAB = sideAB;
		} else {
			throw new Exception("You entered the length of the side of the triangle incorrectly");
		}
	}

	public double getSideBC() {
		return sideBC;
	}

	public void setSideBC(double sideBC) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideBC = sideBC;
		} else {
			throw new Exception("You entered the length of the side of the triangle incorrectly");
		}
	}

	public double getSideCA() {
		return sideCA;
	}

	public void setSideCA(double sideCA) throws Exception {
		if (Validation.validationCorrectSides(sideAB, sideBC, sideCA) == true) {
			this.sideCA = sideCA;
		} else {
			throw new Exception("You entered the length of the side of the triangle incorrectly");
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(sideAB);
		result = result * prime + Double.hashCode(sideBC);
		result = result * prime + Double.hashCode(sideCA);
		result = result * prime + a.hashCode();
		result = result * prime + b.hashCode();
		result = result * prime + c.hashCode();
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
		if (a == null) {
			if (triangle.a != null) {
				return false;
			}
		} else if (!a.equals(triangle.a)) {
			return false;
		}
		if (b == null) {
			if (triangle.b != null) {
				return false;
			}
		} else if (!b.equals(triangle.b)) {
			return false;
		}
		if (c == null) {
			if (triangle.c != null) {
				return false;
			}
		} else if (!c.equals(triangle.c)) {
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