package by.koroza.programming_with_classes.composition.numberfour;

public class Person {
	private static int count = 1;

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private BankAccount[] bankAccounts;

	public Person(String lastName, String firstName, String patronymic, BankAccount bankAccounts) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
	}

	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public void addBankAccount() { // TODO addBankAccount(){}
		
	}

	public void addBankAccounts() { // TODO addBankAccounts(){}

	}
}