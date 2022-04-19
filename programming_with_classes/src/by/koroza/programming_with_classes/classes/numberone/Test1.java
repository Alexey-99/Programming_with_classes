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
}