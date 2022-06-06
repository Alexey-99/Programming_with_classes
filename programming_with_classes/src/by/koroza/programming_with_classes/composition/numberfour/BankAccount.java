package by.koroza.programming_with_classes.composition.numberfour;

public class BankAccount {
	private static int count = 1;

	private int number;
	
	public BankAccount() {
		this.number = count++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}