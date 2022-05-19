package by.koroza.programming_with_classes.classes.numbereight;

public class Costomer {
	private static int count = 1;

	private int id;
	private String firstName;
	private String lastName;
	private String patronymic;
	private Address address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Costomer(String firstName, String lastName, String patronymic, Address address, int creditCardNumber,
			int bankAccountNumber) {
		this.id = count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Costomer(String firstName, String lastName, Address address, int creditCardNumber, int bankAccountNumber) {
		this.id = count++;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		result = result * prime + (firstName != null ? firstName.hashCode() : 1);
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (patronymic != null ? patronymic.hashCode() : 1);
		result = result * prime + (address != null ? address.hashCode() : 1);
		result = result * prime + creditCardNumber;
		result = result * prime + bankAccountNumber;
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
		if (firstName == null) {
			if (costomer.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(costomer.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (costomer.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(costomer.lastName)) {
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
		return builder.toString();
	}
}