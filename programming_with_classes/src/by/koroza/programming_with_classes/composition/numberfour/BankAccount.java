package by.koroza.programming_with_classes.composition.numberfour;

public class BankAccount {
	private static int count = 1;

	private int number;
	private double sum;
	private Operation[] operations;
	private String status;

	public BankAccount() {
		this.number = count++;
		this.sum = 0;
		this.status = "Active";
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + number;
		result = result * prime + (Double.hashCode(sum));
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
		if (sum != account.sum) {
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
		return builder.toString();
	}

}