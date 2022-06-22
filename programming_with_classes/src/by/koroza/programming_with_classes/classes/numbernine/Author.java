package by.koroza.programming_with_classes.classes.numbernine;

public class Author {
	private String lastName;
	private String firstName;
	private String patronymic;
	private static final String SPACE = " ";

	public Author(String lastName, String firstName, String patronymic) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
	}

	public Author(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Author(String lastName) {
		this.lastName = lastName;
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (firstName != null ? firstName.hashCode() : 1);
		result = result * prime + (patronymic != null ? patronymic.hashCode() : 1);
		result = result * prime + (SPACE != null ? SPACE.hashCode() : 1);
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
		Author author = (Author) object;
		if (lastName == null) {
			if (author.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(author.lastName)) {
			return false;
		}
		if (firstName == null) {
			if (author.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(author.firstName)) {
			return false;
		}
		if (patronymic == null) {
			if (author.patronymic != null) {
				return false;
			}
		} else if (!patronymic.equals(author.patronymic)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(lastName).append(SPACE).append(firstName).append(SPACE).append(patronymic);
		return builder.toString();
	}
}