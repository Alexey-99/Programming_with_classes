package by.koroza.programming_with_classes.composition.numberfour;

public class BankAccount {
	private static int count = 1;

	private int number;
	private double sum;
	private Operation[] operations;

	public BankAccount() {
		this.number = count++;
		this.sum = 0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public Operation[] getOperations() {
		return operations;
	}

	public void setOperations(Operation[] operations) {
		this.operations = operations;
	}

	public void addOperation(Operation operation) {
		if (this.operations == null) {
			this.operations[0] = operation;
		} else {
			this.operations[operations.length] = operation;
		}
	}

	public void addOperations(Operation[] operations) {
		if (this.operations == null) {
			this.operations = operations;
		} else {
			for (int i = 0; i < operations.length; i++) {
				this.operations[this.operations.length + i] = operations[i];
			}
		}
	}

}