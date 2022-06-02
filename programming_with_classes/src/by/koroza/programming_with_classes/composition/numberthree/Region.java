package by.koroza.programming_with_classes.composition.numberthree;

public class Region {
	private String name;
	private City[] cities;
	private final static String REGION_NAME = "Region name: ";
	private final static String CITIES_LIST = "Cities:";
	private final static String REGION_DOES_NOT_HAVE_CITIES = "This region doesn't have cities.";
	private final static String LINE_BREAK = "\n";

	public Region(String name) {
		this.name = name;
	}

	public Region(String name, City[] cities) {
		this.name = name;
		this.cities = cities;
	}

	public Region(String name, City city) {
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

	public void addCity(City city) {
		City[] citiesNew = null;
		if (this.cities == null) {
			this.cities[0] = city;
		} else {
			citiesNew = new City[this.cities.length + 1];
			for (int i = 0; i < citiesNew.length; i++) {
				if (i < this.cities.length) {
					citiesNew[i] = cities[i];
				} else if (i == this.cities.length) {
					citiesNew[i] = city;
				}
			}
		}
		this.cities = citiesNew;
	}

	public void addCities(City[] cities) {
		City[] citiesNew = null;
		if (this.cities == null) {
			this.cities = cities;
		} else {
			citiesNew = new City[this.cities.length + cities.length];
			for (int i = 0; i < citiesNew.length; i++) {
				if (i < this.cities.length) {
					citiesNew[i] = this.cities[i];
				} else if (i >= this.cities.length) {
					citiesNew[i] = cities[i];
				}
			}
		}
		this.cities = citiesNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (cities != null ? cities.hashCode() : 1);
		result = result * prime + (REGION_NAME != null ? REGION_NAME.hashCode() : 1);
		result = result * prime + (CITIES_LIST != null ? CITIES_LIST.hashCode() : 1);
		result = result * prime + (REGION_DOES_NOT_HAVE_CITIES != null ? REGION_DOES_NOT_HAVE_CITIES.hashCode() : 1);
		result = result * prime + (LINE_BREAK != null ? LINE_BREAK.hashCode() : 1);
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
		Region region = (Region) object;
		if (name == null) {
			if (region.name != null) {
				return false;
			}
		} else if (!name.equals(region.name)) {
			return false;
		}
		if (cities == null) {
			if (region.cities != null) {
				return false;
			}
		} else if (!cities.equals(region.cities)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(REGION_NAME).append(name).append(LINE_BREAK);
		if (cities != null) {
			builder.append(CITIES_LIST).append(LINE_BREAK);
			for (int i = 0; i < cities.length; i++) {
				builder.append(i + 1).append(") ").append(cities[i].toString()).append(LINE_BREAK);
			}
		} else {
			builder.append(REGION_DOES_NOT_HAVE_CITIES).append(LINE_BREAK);
		}
		return builder.toString();
	}
}