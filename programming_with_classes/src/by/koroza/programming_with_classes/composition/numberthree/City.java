package by.koroza.programming_with_classes.composition.numberthree;

public class City {
	private String name;
	private String cityStatus;
	private District[] districts;

	public City(String name) {
		this.name = name;
	}

	public City(String name, String cityStatus) {
		this.name = name;
		this.cityStatus = cityStatus;
	}

	public City(String name, District[] districts) {
		this.name = name;
		this.districts = districts;
	}

	public City(String name, District[] districts, String cityStatus) {
		this.name = name;
		this.districts = districts;
		this.cityStatus = cityStatus;
	}

	public City(String name, District district) {
		this.name = name;
		this.districts[0] = district;
	}

	public City(String name, District district, String cityStatus) {
		this.name = name;
		this.districts[0] = district;
		this.cityStatus = cityStatus;
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

	public String getCityStatus() {
		return cityStatus;
	}

	public void setCityStatus(String cityStatus) {
		this.cityStatus = cityStatus;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (cityStatus != null ? cityStatus.hashCode() : 1);
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
		if (cityStatus == null) {
			if (city.cityStatus != null) {
				return false;
			}
		} else if (!cityStatus.equals(city.cityStatus)) {
			return false;
		}
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