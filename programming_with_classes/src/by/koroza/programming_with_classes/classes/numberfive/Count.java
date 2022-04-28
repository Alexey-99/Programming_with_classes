package by.koroza.programming_with_classes.classes.numberfive;

public class Count {
	private int value;
	private int minValue;
	private int maxValue;

	public Count() {
		this.value = 0;
	}

	public Count(int value) {
		this.value = value;
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

	public boolean equals(Object object) {
		
		return true;
	}
}