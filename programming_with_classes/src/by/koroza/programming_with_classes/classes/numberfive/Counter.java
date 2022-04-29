package by.koroza.programming_with_classes.classes.numberfive;

public class Counter {
	private int value;
	private int minValue;
	private int maxValue;
	final static String EXCEPTION_MAXVALUE_LESS_MINVALUE = "The range is incorrect! The maximum limit is less than the minimum!";
	final static String EXCEPTION_VALUE_LESS_MINVALUE = "The range is incorrect! The minimum limit is greater than the initial number!";
	final static String EXCEPTION_VALUE_MORE_MAXVALUE = "The range is incorrect! The maximum limit is less than the initial number!";
	final static String IF_VALUE_MORE_UPPER_LIMIT = "The given number is greater than the upper limit";
	final static String IF_VALUE_LESS_LOWER_LIMIT = "The specified number is less than the lower limit";

	public Counter() {
		this.value = 0;
		this.minValue = -10;
		this.maxValue = 10;
	}

	public Counter(int value, int minValue, int maxValue) throws Exception {
		this.value = value;
		this.minValue = minValue;
		this.maxValue = maxValue;

		if (maxValue < minValue) {
			throw new Exception(EXCEPTION_MAXVALUE_LESS_MINVALUE);
		} else if (value < minValue) {
			throw new Exception(EXCEPTION_VALUE_LESS_MINVALUE);
		} else if (value > maxValue) {
			throw new Exception(EXCEPTION_VALUE_MORE_MAXVALUE);
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public void increaseNumber() {
		if (value <= maxValue) {
			value++;
		} else {
			System.out.println(IF_VALUE_MORE_UPPER_LIMIT);
		}
	}

	public void reduceNumber() {
		if (value >= minValue) {
		value--;
		} else {
			System.out.println(IF_VALUE_LESS_LOWER_LIMIT);
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + value;
		result = result * prime + minValue;
		result = result * prime + maxValue;
		result = result * prime
				+ (EXCEPTION_MAXVALUE_LESS_MINVALUE != null ? EXCEPTION_MAXVALUE_LESS_MINVALUE.hashCode() : 1);
		result = result * prime
				+ (EXCEPTION_VALUE_LESS_MINVALUE != null ? EXCEPTION_VALUE_LESS_MINVALUE.hashCode() : 1);
		result = result * prime
				+ (EXCEPTION_VALUE_MORE_MAXVALUE != null ? EXCEPTION_VALUE_MORE_MAXVALUE.hashCode() : 1);
		result = result * prime + (IF_VALUE_MORE_UPPER_LIMIT != null ? IF_VALUE_MORE_UPPER_LIMIT.hashCode() : 1);
		result = result * prime + (IF_VALUE_LESS_LOWER_LIMIT != null ? IF_VALUE_LESS_LOWER_LIMIT.hashCode() : 1);
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
		Counter counter = (Counter) object;
		if (value != counter.value) {
			return false;
		}
		if (minValue != counter.minValue) {
			return false;
		}
		if (maxValue != counter.maxValue) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Start value - ").append(value);
		build.append("Minimum value - ").append(minValue);
		build.append("Maximum value - ").append(maxValue);
		return build.toString();
	}
}