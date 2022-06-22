package by.koroza.programming_with_classes.classes.numberseven;

public class Point {
	private double x;
	private double y;
	private static final String X = "x - ";
	private static final String Y = ", y - ";

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(x);
		result = result * prime + Double.hashCode(y);
		result = result * prime + (X != null ? X.hashCode() : 1);
		result = result * prime + (Y != null ? Y.hashCode() : 1);
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
		Point point = (Point) object;
		if (x != point.x) {
			return false;
		}
		if (y != point.y) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(X).append(x).append(Y).append(y);
		return builder.toString();
	}
}