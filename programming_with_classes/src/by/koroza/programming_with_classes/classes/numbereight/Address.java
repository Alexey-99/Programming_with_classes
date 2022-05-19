package by.koroza.programming_with_classes.classes.numbereight;

public class Address {
	private String country;
	private String city;
	private String street;
	private int house;
	private int apartment;

	public Address(String country, String city, String street, int house, int apartment) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house;
		this.apartment = apartment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public int getApartment() {
		return apartment;
	}

	public void setApartment(int apartment) {
		this.apartment = apartment;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (country != null ? country.hashCode() : 1);
		result = result * prime + (city != null ? city.hashCode() : 1);
		result = result * prime + (street != null ? street.hashCode() : 1);
		result = result * prime + house;
		result = result * prime + apartment;
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
		Address address = (Address) object;
		if (country == null) {
			if (address.country != null) {
				return false;
			}
		} else if (!country.equals(address.country)) {
			return false;
		}
		if (city == null) {
			if (address.city != null) {
				return false;
			}
		} else if (!city.equals(address.city)) {
			return false;
		}
		if (street == null) {
			if (address.street != null) {
				return false;
			}
		} else if (!street.equals(address.street)) {
			return false;
		}
		if (house != address.house) {
			return false;
		}
		if (apartment != address.apartment) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append("Country: ").append(country).append(", ");
		builder.append("City: ").append(city).append(", ");
		builder.append("Street: ").append(street).append(", ");
		builder.append("Number house: ").append(house).append(", ");
		builder.append("Number apartment: ").append(apartment);
		return builder.toString();
	}
}