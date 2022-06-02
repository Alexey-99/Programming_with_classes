package by.koroza.programming_with_classes.composition.numberthree;

public class City {
	private String name;
	private String cityStatus;
	private boolean stateCapital;
	private District[] districts;
	private final static String CITY_NAME = "City name: ";
	private final static String CITY_STATUS = "City status: ";
	private final static String CITY_CAPITAL_STATE = "This city is capital state.";
	private final static String CITY_DOES_NOT_HAVE_DISTRICTS = "This city doesn't have districts.";

	public City(String name) {
		this.name = name;
		this.stateCapital = false;
	}

	public City(String name, boolean stateCapital) {
		this.name = name;
		this.stateCapital = stateCapital;
	}

	public City(String name, String cityStatus) {
		this.name = name;
		this.cityStatus = cityStatus;
		this.stateCapital = false;
	}

	public City(String name, String cityStatus, boolean stateCapital) {
		this.name = name;
		this.cityStatus = cityStatus;
		this.stateCapital = stateCapital;
	}

	public City(String name, District[] districts) {
		this.name = name;
		this.districts = districts;
		this.stateCapital = false;
	}

	public City(String name, District[] districts, boolean stateCapital) {
		this.name = name;
		this.districts = districts;
		this.stateCapital = stateCapital;
	}

	public City(String name, District[] districts, String cityStatus) {
		this.name = name;
		this.districts = districts;
		this.cityStatus = cityStatus;
		this.stateCapital = false;
	}

	public City(String name, District[] districts, String cityStatus, boolean stateCapital) {
		this.name = name;
		this.districts = districts;
		this.cityStatus = cityStatus;
		this.stateCapital = stateCapital;
	}

	public City(String name, District district) {
		this.name = name;
		this.districts[0] = district;
		this.stateCapital = false;
	}

	public City(String name, District district, boolean stateCapital) {
		this.name = name;
		this.districts[0] = district;
		this.stateCapital = stateCapital;
	}

	public City(String name, District district, String cityStatus) {
		this.name = name;
		this.districts[0] = district;
		this.cityStatus = cityStatus;
		this.stateCapital = false;
	}

	public City(String name, District district, String cityStatus, boolean stateCapital) {
		this.name = name;
		this.districts[0] = district;
		this.cityStatus = cityStatus;
		this.stateCapital = stateCapital;
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

	public boolean getIsStateCapital() {
		return stateCapital;
	}

	public void setStateCapital(boolean stateCapital) {
		this.stateCapital = stateCapital;
	}

	public void addDistrict(District district) {
		District[] districtsNew = null;
		if (this.districts == null) {
			this.districts[0] = district;
		} else {
			districtsNew = new District[this.districts.length + 1];
			for (int i = 0; i < districtsNew.length; i++) {
				if (i < this.districts.length) {
					districtsNew[i] = this.districts[i];
				} else if (i == this.districts.length) {
					districtsNew[i] = district;
				}
			}
		}
		this.districts = districtsNew;
	}

	public void addDistricts(District[] districts) {
		District[] districtsNew = null;
		if (this.districts == null) {
			this.districts = districts;
		} else {
			districtsNew = new District[this.districts.length + districts.length];
			for (int i = 0; i < districtsNew.length; i++) {
				if (i < this.districts.length) {
					districtsNew[i] = this.districts[i];
				} else if (i >= this.districts.length) {
					districtsNew[i] = districts[i];
				}
			}
		}
		this.districts = districtsNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (cityStatus != null ? cityStatus.hashCode() : 1);
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (districts != null ? districts.hashCode() : 1);
		result = result * prime + Boolean.hashCode(stateCapital);
		result = result * prime + (CITY_NAME != null ? CITY_NAME.hashCode() : 1);
		result = result * prime + (CITY_STATUS != null ? CITY_STATUS.hashCode() : 1);
		result = result * prime + (CITY_CAPITAL_STATE != null ? CITY_CAPITAL_STATE.hashCode() : 1);
		result = result * prime + (CITY_DOES_NOT_HAVE_DISTRICTS != null ? CITY_DOES_NOT_HAVE_DISTRICTS.hashCode() : 1);
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
		if (stateCapital != city.stateCapital) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(CITY_NAME).append(name).append("\n");
		if (cityStatus != null) {
			builder.append(CITY_STATUS).append(cityStatus).append("\n");
		}
		if (stateCapital != false) {
			builder.append(CITY_CAPITAL_STATE).append("\n");
		}
		if (districts != null) {
			builder.append("Districts:").append("\n");
			for (int i = 0; i < districts.length; i++) {
				builder.append(i + 1).append(") ").append(districts[i].toString());
				if (i < districts.length - 1) {
					builder.append("\n");
				}
			}
		} else {
			builder.append(CITY_DOES_NOT_HAVE_DISTRICTS);
		}
		return builder.toString();
	}
}