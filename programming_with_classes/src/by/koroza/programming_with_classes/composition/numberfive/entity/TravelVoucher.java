package by.koroza.programming_with_classes.composition.numberfive.entity;

import by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration;

public class TravelVoucher {
	private String country;
	private String city;
	private String tourType;
	private int numberNights;
	private double price;
	private String comment;
	private boolean statusAdd;

	public TravelVoucher(String country, String tourType, int numberNights, double price, String comment) {
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = "without city";
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
		this.statusAdd = false;
	}

	public TravelVoucher(String country, String city, String tourType, int numberNights, double price) {
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = city;
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.statusAdd = false;
	}

	public TravelVoucher(String country, String city, String tourType, int numberNights, double price, String comment) {
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = city;
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
		this.statusAdd = false;
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

	public String getTourType() {
		return tourType;
	}

	public void setTourType(String tourType) {
		this.tourType = tourType;
	}

	public int getNumberNights() {
		return numberNights;
	}

	public void setNumberNights(int numberNights) {
		this.numberNights = numberNights;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isStatusAdd() {
		return statusAdd;
	}

	public void setStatusAdd(boolean statusAdd) {
		this.statusAdd = statusAdd;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (country != null ? country.hashCode() : 1);
		result = result * prime + (city != null ? city.hashCode() : 1);
		result = result * prime + (tourType != null ? tourType.hashCode() : 1);
		result = result * prime + numberNights;
		result = result * prime + Double.hashCode(price);
		result = result * prime + (comment != null ? comment.hashCode() : 1);
		result = result * prime + Boolean.hashCode(statusAdd);
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
		TravelVoucher travelVoucher = (TravelVoucher) object;
		if (country == null) {
			if (travelVoucher.country != null) {
				return false;
			}
		} else if (!country.equals(travelVoucher.country)) {
			return false;
		}
		if (city == null) {
			if (travelVoucher.city != null) {
				return false;
			}
		} else if (!city.equals(travelVoucher.city)) {
			return false;
		}
		if (tourType == null) {
			if (travelVoucher.tourType != null) {
				return false;
			}
		} else if (!tourType.equals(travelVoucher.tourType)) {
			return false;
		}
		if (numberNights != travelVoucher.numberNights) {
			return false;
		}
		if (price != travelVoucher.price) {
			return false;
		}
		if (comment == null) {
			if (travelVoucher.comment != null) {
				return false;
			}
		} else if (!comment.equals(travelVoucher.comment)) {
			return false;
		}
		if (statusAdd != travelVoucher.statusAdd) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country: ").append(country).append("\n");
		if (city != null) {
			builder.append("City: ").append(city).append("\n");
		}
		builder.append("Tour type: ").append(tourType).append("\n");
		builder.append("Number nights: ").append(numberNights).append("\n");
		builder.append("Price: ").append(price).append("\n");
		if (comment != null) {
			builder.append("Comment: ").append(comment).append("\n");
		}
		return builder.toString();
	}
}