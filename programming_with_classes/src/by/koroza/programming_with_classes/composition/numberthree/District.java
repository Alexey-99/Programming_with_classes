package by.koroza.programming_with_classes.composition.numberthree;

public class District {
	private String name;
	private final static String DISTRICT_NAME = "District name: ";

	public District(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (DISTRICT_NAME != null ? DISTRICT_NAME.hashCode() : 1);
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
		District district = (District) object;
		if (name == null) {
			if (district.name != null) {
				return false;
			}
		} else if (!name.equals(district.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(DISTRICT_NAME).append(name);
		return builder.toString();
	}
}