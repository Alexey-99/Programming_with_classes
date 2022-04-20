package by.koroza.programming_with_classes.classes.numbertwo;

public class Test2 {
	private String numberOne;
	private int numberTwo;

	public Test2(String numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public Test2() {
		this.numberOne = "";
		this.numberTwo = 0;
	}

	public String getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(String numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
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
		Test2 test2 = (Test2) object;
		if (numberOne == null) {
			if (test2.numberOne != null) {
				return false;
			}
		} else if (!numberOne.equals(test2.numberOne)) {
			return false;
		}
		if (numberTwo != test2.numberTwo) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (numberOne != null ? numberOne.hashCode() : 1);
		result = result * prime + numberTwo;
		return result;
	}
}