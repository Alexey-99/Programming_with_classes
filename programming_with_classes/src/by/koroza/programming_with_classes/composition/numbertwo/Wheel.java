package by.koroza.programming_with_classes.composition.numbertwo;

public class Wheel {
	

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
		Wheel wheel = (Wheel) object;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}

}