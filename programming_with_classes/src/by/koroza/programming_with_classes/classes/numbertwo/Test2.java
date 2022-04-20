package by.koroza.programming_with_classes.classes.numbertwo;

public class Test2 {
	private int numberOne;
	private int numberTwo;

	public Test2(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public Test2() {
		this.numberOne = 0;
		this.numberTwo = 0;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
}
