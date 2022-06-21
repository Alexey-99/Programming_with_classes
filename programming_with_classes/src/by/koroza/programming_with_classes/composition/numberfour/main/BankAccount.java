package by.koroza.programming_with_classes.composition.numberfour.main;

public class BankAccount {
	private static final String BANK_ACCOUNT_IS_NOT_ACTIVE = "Sorry, this bank account isn't active.";
	private static final String NEXT_LINE = "\n";
	private static final String NO_OPERATIONS_FOUND_ACCOUNT = "No operations found on the account";
	private static final String NUMBER_BANK_ACCOUNT = "Number bank account: ";
	private static final String SUM_MONEY_IN_BANK_ACCOUNT = "Sum money in the bank account: ";
	private static final String OPERATIONS_BY_BANK_ACCOUNT = "Operations by bank account: ";
	private static final String STATUS = "Status: ";
	private static int count = 1;

	private int number;
	private double balance;
	private Operation[] operations;
	private String status;

	public BankAccount() {
		this.number = count++;
		this.balance = 0;
		this.status = "active";
		this.operations = new Operation[0];
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
		if (this.status.equals("active")) {
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
		} else {
			System.out.println(BANK_ACCOUNT_IS_NOT_ACTIVE);
		}
	}

	public void addOperations(Operation[] operations) {
		if (this.status.equals("active")) {
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
		} else {
			System.out.println(BANK_ACCOUNT_IS_NOT_ACTIVE);
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
		result = result * prime + (BANK_ACCOUNT_IS_NOT_ACTIVE != null ? BANK_ACCOUNT_IS_NOT_ACTIVE.hashCode() : 1);
		result = result * prime + (NO_OPERATIONS_FOUND_ACCOUNT != null ? NO_OPERATIONS_FOUND_ACCOUNT.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (NUMBER_BANK_ACCOUNT != null ? NUMBER_BANK_ACCOUNT.hashCode() : 1);
		result = result * prime + (SUM_MONEY_IN_BANK_ACCOUNT != null ? SUM_MONEY_IN_BANK_ACCOUNT.hashCode() : 1);
		result = result * prime + (OPERATIONS_BY_BANK_ACCOUNT != null ? OPERATIONS_BY_BANK_ACCOUNT.hashCode() : 1);
		result = result * prime + (STATUS != null ? STATUS.hashCode() : 1);
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
		builder.append(NUMBER_BANK_ACCOUNT).append(number).append(NEXT_LINE);
		builder.append(SUM_MONEY_IN_BANK_ACCOUNT).append(balance).append(NEXT_LINE);
		builder.append(OPERATIONS_BY_BANK_ACCOUNT).append(NEXT_LINE);
		if (operations.length > 0) {
			for (int i = 0; i < operations.length; i++) {
				builder.append(operations[i].toString());
				if (i < operations.length - 1) {
					builder.append(NEXT_LINE);
				}
			}
		} else {
			builder.append(NO_OPERATIONS_FOUND_ACCOUNT).append(NEXT_LINE);
		}
		builder.append(STATUS).append(status).append(NEXT_LINE);
		return builder.toString();
	}

}