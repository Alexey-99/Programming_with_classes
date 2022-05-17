package by.koroza.programming_with_classes.classes.numberseven;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) throws Exception {
		if (Validation.validationSide(sideA, sideB, sideC) == true) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		} else {
			throw new Exception("You entered the length of the sides of the triangle incorrectly");
		}
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(sideA);
		result = result * prime + Double.hashCode(sideB);
		result = result * prime + Double.hashCode(sideC);
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
		if (sideA != triangle.sideA) {
			return false;
		}
		if (sideB != triangle.sideB) {
			return false;
		}
		if (sideC != triangle.sideC) {
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