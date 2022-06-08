package by.koroza.programming_with_classes.composition.numberfour;

public class Person {
	private static int count = 1;

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private BankAccount[] bankAccounts;

	public Person(String lastName, String firstName, String patronymic, BankAccount bankAccount) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.bankAccounts = new BankAccount[1];
		this.bankAccounts[0] = bankAccount;
	}

	public Person(String lastName, String firstName, String patronymic, BankAccount[] bankAccounts) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.bankAccounts = bankAccounts;
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

	public void addBankAccount(BankAccount bankAccount) {
		BankAccount[] bankAccountsNew = new BankAccount[this.bankAccounts.length + 1];
		for (int i = 0; i < bankAccountsNew.length; i++) {
			if (i < this.bankAccounts.length) {
				bankAccountsNew[i] = this.bankAccounts[i];
			} else if (i == this.bankAccounts.length) {
				bankAccountsNew[i] = bankAccount;
			}
		}
		this.bankAccounts = bankAccountsNew;
	}

	public void addBankAccounts(BankAccount[] bankAccounts) { 
		BankAccount[] bankAccountsNew = new BankAccount[this.bankAccounts.length + bankAccounts.length];
		for (int i = 0; i < bankAccountsNew.length; i++) {
			if (i < this.bankAccounts.length) {
				bankAccountsNew[i] = this.bankAccounts[i];
			} else if (i >= this.bankAccounts.length) {
				bankAccountsNew[i] = bankAccounts[i - this.bankAccounts.length];
			}
		}
		this.bankAccounts = bankAccountsNew;
	}

	public void searchBySum(double min, double max) { 
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() >= min && account.getBalance() <= max) {
				System.out.println(account.toString());
			}
		}
	}
	
	public void searchByMinSum(double min) { 
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() >= min) {
				System.out.println(account.toString());
			}
		}
	}
	
	public void searchByMaxSum(double max) {
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() <= max) {
				System.out.println(account.toString());
			}
		}
	}

	public void searchByNumber() { // TODO searchByNumber()
		// return [];
	}

	public void sortingByCum() {// TODO sortingByCum()

	}
	
	public void sumByAllBankAccounts() {// TODO sumByBankAccounts()

	}
	
	public void sumByBankAccountsWithPositiveBalance() {// TODO sumByBankAccountsWithPositiveBalance()

	}
	
	public void sumByBankAccountsWithNegativeBalance() {// TODO sumByBankAccountsWithNegativeBalance()

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (firstName != null ? firstName.hashCode() : 1);
		result = result * prime + (patronymic != null ? patronymic.hashCode() : 1);
		result = result * prime + (bankAccounts != null ? bankAccounts.hashCode() : 1);
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
		Person person = (Person) object;
		if (id != person.id) {
			return false;
		}
		if (lastName == null) {
			if (person.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(person.lastName)) {
			return false;
		}
		if (firstName == null) {
			if (person.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(person.firstName)) {
			return false;
		}
		if (patronymic == null) {
			if (person.patronymic != null) {
				return false;
			}
		} else if (!patronymic.equals(person.patronymic)) {
			return false;
		}
		if (bankAccounts == null) {
			if (person.bankAccounts != null) {
				return false;
			}
		} else if (!bankAccounts.equals(person.bankAccounts)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ").append(id).append("\n");
		builder.append("Last name, first name, patronymic: ");
		builder.append(lastName).append(" ").append(firstName).append(" ").append(patronymic).append("\n");
		builder.append("Bank Accounts: ").append("\n");
		for(BankAccount account : bankAccounts) {
			builder.append(account.toString()).append("\n");
		}
		return builder.toString();
	}
}