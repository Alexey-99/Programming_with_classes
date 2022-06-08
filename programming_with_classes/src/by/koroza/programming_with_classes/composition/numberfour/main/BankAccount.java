package by.koroza.programming_with_classes.composition.numberfour.main;

public class BankAccount {
	private static int count = 1;

	private int number;
	private double balance;
	private Operation[] operations;
	private String status;

	public BankAccount() {
		this.number = count++;
		this.balance = 0;
		this.status = "Active";
		this.operations = new Operation[1];
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Operation[] getOperations() {
		return operations;
	}

	public void setOperations(Operation[] operations) {
		this.operations = operations;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void addOperation(Operation operation) {
		if (this.operations[operations.length - 1] == null) {
			this.operations[operations.length - 1] = operation;
			changeInBalance(operation.getSum());
		} else {
			Operation[] operationsNew = new Operation[operations.length + 1];
			for (int i = 0; i < operationsNew.length; i++) {
				if (i < operations.length) {
					operationsNew[i] = this.operations[i];
				} else if (i == operations.length) {
					operationsNew[i] = operation;
					changeInBalance(operation.getSum());
				}
			}
			this.operations = operationsNew;
		}
	}

	public void addOperations(Operation[] operations) {
		if (this.operations[this.operations.length - 1] == null) {
			this.operations = operations;
			for (Operation operation : operations) {
				changeInBalance(operation.getSum());
			}
		} else {
			Operation[] operationsNew = new Operation[this.operations.length + operations.length];
			for (int i = 0; i < operationsNew.length; i++) {
				if (i < this.operations.length) {
					operationsNew[i] = this.operations[i];
				} else if (i >= this.operations.length) {
					operationsNew[i] = operations[i];
					changeInBalance(operations[i].getSum());
				}
			}
			this.operations = operationsNew;
		}
	}

	private void changeInBalance(double sum) {
		balance += sum;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + number;
		result = result * prime + (Double.hashCode(balance));
		result = result * prime + (operations != null ? operations.hashCode() : 1);
		result = result * prime + (status != null ? status.hashCode() : 1);
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
		BankAccount account = (BankAccount) object;
		if (number != account.number) {
			return false;
		}
		if (balance != account.balance) {
			return false;
		}
		if (operations == null) {
			if (account.operations != null) {
				return false;
			}
		} else if (!operations.equals(account.operations)) {
			return false;
		}
		if (status == null) {
			if (account.status != null) {
				return false;
			}
		} else if (!status.equals(account.status)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Number bank account: ").append(number).append("\n");
		builder.append("Sum money in the bank account: ").append(balance).append("\n");
		builder.append("Operations by bank account: ").append("\n");
		if (operations[0] != null) {
			for (int i = 0; i < operations.length; i++) {
				if (operations[i] != null) {
					builder.append(operations[i].toString());
				}
				if (i < operations.length - 1) {
					builder.append("\n");
				}
			}
		} else {
			builder.append("No operations found on the account").append("\n");
		}
		builder.append("Status: ").append(status).append("\n");
		return builder.toString();
	}

}