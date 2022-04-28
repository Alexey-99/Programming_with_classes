package by.koroza.programming_with_classes.classes.numberfive;

public class Counter {
	private int value;
	private int minValue;
	private int maxValue;

	public Counter() {
		this.value = 0;
		this.minValue = -10;
		this.maxValue = 10;
	}

	public Counter(int value, int minValue, int maxValue) {
		this.value = value;
		this.minValue = minValue;
		this.maxValue = maxValue;
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
	
	

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + value;
		result = result * prime + minValue;
		result = result * prime + maxValue;
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
		Counter count = (Counter) object;
		if (value != count.value) {
			return false;
		}
		if (minValue != count.minValue) {
			return false;
		}
		if (maxValue != count.maxValue) {
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