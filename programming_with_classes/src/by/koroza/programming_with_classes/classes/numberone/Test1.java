package by.koroza.programming_with_classes.classes.numberone;

public class Test1 {
	private int one = 1999;
	private int two = 23;

	public Test1() {

	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public void printOne() {
		System.out.println(one);
	}

	public void printTwo() {
		System.out.println(two);
	}

	public int sum() {
		int sum = one + two;
		return sum;
	}

	public int maxNumber() {
		int maxNumber = one;
		if (maxNumber < two) {
			maxNumber = two;
		}
		return maxNumber;
	}

	@Override
	public int hashCode() {
		int prime = 1;
		int result = 31;
		result = result * prime + one;
		result = result * prime + two;
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
		Test1 test1 = (Test1) object;
		if (one != test1.one) {
			return false;
		}
		if (two != test1.two) {
			return false;
		}
		return true;
	}
}