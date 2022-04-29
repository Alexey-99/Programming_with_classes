package by.koroza.programming_with_classes.classes.numbersix;

public class Time {

	public Time() {

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime;
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
		Time time = (Time) object;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		return build.toString();
	}
}