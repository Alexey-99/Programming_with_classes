package by.koroza.programming_with_classes.composition.numberfive.entity;

public class Person {
	private String lastName;
	private String firstName;
	private String patronymic;
	private TravelVoucher[] travelVouchers;

	public Person(String lastName, String firstName, String patronymic) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.travelVouchers = new TravelVoucher[0];
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

	public TravelVoucher[] getTravelVouchers() {
		return travelVouchers;
	}

	public void setTravelVouchers(TravelVoucher[] travelVouchers) {
		this.travelVouchers = travelVouchers;
	}

	public void addTravelVoucher(TravelVoucher travelVoucher) {
		TravelVoucher[] travelVouchersNew = new TravelVoucher[travelVouchers.length + 1];
		for (int i = 0; i < travelVouchersNew.length; i++) {
			if (i < travelVouchers.length) {
				travelVouchersNew[i] = travelVouchers[i];
			} else if (i == travelVouchers.length) {
				travelVouchersNew[i] = travelVoucher;
				travelVouchersNew[i].setIsStatusAdd(true);
			}
		}
		travelVouchers = travelVouchersNew;
	}
	
	public void deleteTravelVoucher() {
		
	}

	public void printTravelVouchers() {
		if (travelVouchers.length != 0) {
			for (int i = 0; i < travelVouchers.length; i++) {
				System.out.println(i + " - " + travelVouchers[i].toString());
			}
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = prime * result + (lastName != null ? lastName.hashCode() : 1);
		result = prime * result + (firstName != null ? firstName.hashCode() : 1);
		result = prime * result + (patronymic != null ? patronymic.hashCode() : 1);
		result = prime * result + (travelVouchers != null ? travelVouchers.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Person person = (Person) object;
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
		if (travelVouchers == null) {
			if (person.travelVouchers != null) {
				return false;
			}
		} else if (!travelVouchers.equals(person.travelVouchers)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Last name: ").append(lastName).append("\n");
		builder.append("First name: ").append(firstName).append("\n");
		builder.append("Patronymic: ").append(patronymic).append("\n");
		builder.append(lastName).append(" ");
		builder.append(firstName).append(" ");
		builder.append(patronymic).append(" has next travel vouchers: ").append("\n");
		for (int i = 0; i < travelVouchers.length; i++) {
			builder.append(travelVouchers[i].toString());
			if (i < travelVouchers.length - 1) {
				builder.append("\n");
			}
		}
		return builder.toString();
	}
}