package by.koroza.programming_with_classes.composition.numberthree;

public class District {
	private String name;
	private City[] cities;

	public District(String name) {
		this.name = name;
	}

	public District(String name, City[] cities) {
		this.name = name;
		this.cities = cities;
	}

	public District(String name, City city) {
		this.name = name;
		this.cities[0] = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (cities != null ? cities.hashCode() : 1);
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
		if (cities == null) {
			if (district.cities != null) {
				return false;
			}
		} else if (!cities.equals(district.cities)) {
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