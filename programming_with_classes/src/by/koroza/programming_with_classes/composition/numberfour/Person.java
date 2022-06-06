package by.koroza.programming_with_classes.composition.numberfour;

public class Person {
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private BankAccount[] bankAccounts;

	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
}