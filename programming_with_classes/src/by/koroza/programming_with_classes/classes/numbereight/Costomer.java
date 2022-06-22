package by.koroza.programming_with_classes.classes.numbereight;

public class Costomer {
	private static final String ID = "ID: ";
	private static final String LAST_NAME = "Last name: ";
	private static final String FIRST_NAME = "First name: ";
	private static final String PATRONYMIC = "Patronymic: ";
	private static final String ADDRESS = "Address: ";
	private static final String CREDIT_CARD_NUMBER = "Credit card number: ";
	private static final String BANK_ACCOUNT_NUMBER = "Bank account number: ";
	private static final String NEXT_LINE = "\n";
	private static int count = 1;

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private Address address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Costomer(String lastName, String firstName, String patronymic, Address address, int creditCardNumber,
			int bankAccountNumber) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Costomer(String lastName, String firstName, Address address, int creditCardNumber, int bankAccountNumber) {
		this.id = count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
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
		result = result * prime + (address != null ? address.hashCode() : 1);
		result = result * prime + creditCardNumber;
		result = result * prime + bankAccountNumber;
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (ID != null ? ID.hashCode() : 1);
		result = result * prime + (LAST_NAME != null ? LAST_NAME.hashCode() : 1);
		result = result * prime + (FIRST_NAME != null ? FIRST_NAME.hashCode() : 1);
		result = result * prime + (PATRONYMIC != null ? PATRONYMIC.hashCode() : 1);
		result = result * prime + (ADDRESS != null ? ADDRESS.hashCode() : 1);
		result = result * prime + (CREDIT_CARD_NUMBER != null ? CREDIT_CARD_NUMBER.hashCode() : 1);
		result = result * prime + (BANK_ACCOUNT_NUMBER != null ? BANK_ACCOUNT_NUMBER.hashCode() : 1);
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
		Costomer costomer = (Costomer) object;
		if (id != costomer.id) {
			return false;
		}
		if (lastName == null) {
			if (costomer.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(costomer.lastName)) {
			return false;
		}
		if (firstName == null) {
			if (costomer.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(costomer.firstName)) {
			return false;
		}
		if (patronymic == null) {
			if (patronymic != null) {
				return false;
			}
		} else if (!patronymic.equals(costomer.patronymic)) {
			return false;
		}
		if (address == null) {
			if (costomer.address != null) {
				return false;
			}
		} else if (!address.equals(costomer.address)) {
			return false;
		}
		if (creditCardNumber != costomer.creditCardNumber) {
			return false;
		}
		if (bankAccountNumber != costomer.bankAccountNumber) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ID).append(id).append(NEXT_LINE);
		builder.append(LAST_NAME).append(lastName).append(NEXT_LINE);
		builder.append(FIRST_NAME).append(firstName).append(NEXT_LINE);
		if (patronymic != null) {
			builder.append(PATRONYMIC).append(patronymic).append(NEXT_LINE);
		}
		builder.append(ADDRESS).append(address.toString()).append(NEXT_LINE);
		builder.append(CREDIT_CARD_NUMBER).append(creditCardNumber).append(NEXT_LINE);
		builder.append(BANK_ACCOUNT_NUMBER).append(bankAccountNumber).append(NEXT_LINE);
		return builder.toString();
	}
}