package by.koroza.programming_with_classes.composition.numberfive.entity;

public class Person {
	private String lastName;
	private String firstName;
	private String patronymic;
	private TravelVoucher[] travelVouchers;
	private static final String SPACE = " ";
	private static final String DOES_NOT_HAVE_TRAVEL_VOUCHERS = "doesn't have travel vouchers.";
	private static final String HAS_TRAVEL_VOUCHERS = " has travel vouchers: ";
	private static final String NEXT_LINE = "\n";
	private static final String LAST_NAME = "Last name: ";
	private static final String FIRST_NAME = "First name: ";
	private static final String PATRONYMIC = "Patronymic: ";

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

	public void deleteTravelVoucher(int indexElement) {
		int index = 0;
		TravelVoucher[] travelVoucherNew = new TravelVoucher[travelVouchers.length - 1];
		for (int i = 0; i < travelVouchers.length; i++) {
			if (i != indexElement) {
				travelVoucherNew[index] = travelVouchers[i];
				index++;
			}
		}
		travelVouchers = travelVoucherNew;
	}

	public void printTravelVouchers() {
		if (travelVouchers.length != 0) {
			for (int i = 0; i < travelVouchers.length; i++) {
				System.out.println(i + " - " + travelVouchers[i].toString());
			}
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append(lastName).append(SPACE);
			builder.append(firstName).append(SPACE);
			builder.append(patronymic).append(SPACE);
			builder.append(DOES_NOT_HAVE_TRAVEL_VOUCHERS);
			System.out.println(builder);
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (firstName != null ? firstName.hashCode() : 1);
		result = result * prime + (patronymic != null ? patronymic.hashCode() : 1);
		result = result * prime + (travelVouchers != null ? travelVouchers.hashCode() : 1);
		result = result * prime + (SPACE != null ? SPACE.hashCode() : 1);
		result = result * prime
				+ (DOES_NOT_HAVE_TRAVEL_VOUCHERS != null ? DOES_NOT_HAVE_TRAVEL_VOUCHERS.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (LAST_NAME != null ? LAST_NAME.hashCode() : 1);
		result = result * prime + (FIRST_NAME != null ? FIRST_NAME.hashCode() : 1);
		result = result * prime + (PATRONYMIC != null ? PATRONYMIC.hashCode() : 1);
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
		builder.append(LAST_NAME).append(lastName).append(NEXT_LINE);
		builder.append(FIRST_NAME).append(firstName).append(NEXT_LINE);
		builder.append(PATRONYMIC).append(patronymic).append(NEXT_LINE);
		builder.append(lastName).append(SPACE);
		builder.append(firstName).append(SPACE);
		builder.append(patronymic).append(HAS_TRAVEL_VOUCHERS).append(NEXT_LINE);
		for (int i = 0; i < travelVouchers.length; i++) {
			builder.append(travelVouchers[i].toString());
			if (i < travelVouchers.length - 1) {
				builder.append(NEXT_LINE);
			}
		}
		return builder.toString();
	}
}