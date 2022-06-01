package by.koroza.programming_with_classes.composition.numberthree;

public class City {
	private String name;
	private District[] districts;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (districts != null ? districts.hashCode() : 1);
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
		City city = (City) object;
		if (name == null) {
			if (city.name != null) {
				return false;
			}
		} else if (!name.equals(city.name)) {
			return false;
		}
		if (districts == null) {
			if (city.districts != null) {
				return false;
			}
		} else if (!districts.equals(city.districts)) {
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