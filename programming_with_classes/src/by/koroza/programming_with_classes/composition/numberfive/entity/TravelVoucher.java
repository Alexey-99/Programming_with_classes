package by.koroza.programming_with_classes.composition.numberfive.entity;

import by.koroza.programming_with_classes.composition.numberfive.enums.CityEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.enums.CountryEnumeration;
import by.koroza.programming_with_classes.composition.numberfive.enums.TypeEnumeration;

public class TravelVoucher {
	private static final String NEXT_LINE = "\n";
	private static final String WITHOUT_CITY = "without city";
	private static final String COUNTRY = "Country: ";
	private static final String CITY = "City: ";
	private static final String TOUR_TYPE = "Tour type: ";
	private static final String NUMBER_NIGHTS = "Number nights: ";
	private static final String PRICE = "Price: ";
	private static final String COMMENT = "Comment: ";
	private static final String TRAVEL_VOUCHER_ADDED = "Travel voucher added.";
	private static int count = 0;
	private int id;
	private String country;
	private String city;
	private String tourType;
	private int numberNights;
	private double price;
	private String comment;
	private boolean isStatusAdd;

	public TravelVoucher(String country, String tourType, int numberNights, double price, String comment) {
		this.id = count++;
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = WITHOUT_CITY;
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
		this.isStatusAdd = false;
	}

	public TravelVoucher(String country, String city, String tourType, int numberNights, double price) {
		this.id = count++;
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = city;
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.isStatusAdd = false;
	}

	public TravelVoucher(String country, String city, String tourType, int numberNights, double price, String comment) {
		this.id = count++;
		this.country = country;
		CountryEnumeration.addCountryInList(country);
		this.city = city;
		CityEnumeration.addCityInList(city);
		this.tourType = tourType;
		TypeEnumeration.addTypeInList(tourType);
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
		this.isStatusAdd = false;
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

	public boolean getIsStatusAdd() {
		return isStatusAdd;
	}

	public void setIsStatusAdd(boolean isStatusAdd) {
		this.isStatusAdd = isStatusAdd;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (country != null ? country.hashCode() : 1);
		result = result * prime + (city != null ? city.hashCode() : 1);
		result = result * prime + (tourType != null ? tourType.hashCode() : 1);
		result = result * prime + numberNights;
		result = result * prime + Double.hashCode(price);
		result = result * prime + (comment != null ? comment.hashCode() : 1);
		result = result * prime + Boolean.hashCode(isStatusAdd);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (WITHOUT_CITY != null ? WITHOUT_CITY.hashCode() : 1);
		result = result * prime + (COUNTRY != null ? COUNTRY.hashCode() : 1);
		result = result * prime + (CITY != null ? CITY.hashCode() : 1);
		result = result * prime + (TOUR_TYPE != null ? TOUR_TYPE.hashCode() : 1);
		result = result * prime + (NUMBER_NIGHTS != null ? NUMBER_NIGHTS.hashCode() : 1);
		result = result * prime + (PRICE != null ? PRICE.hashCode() : 1);
		result = result * prime + (COMMENT != null ? COMMENT.hashCode() : 1);
		result = result * prime + (TRAVEL_VOUCHER_ADDED != null ? TRAVEL_VOUCHER_ADDED.hashCode() : 1);
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
		if (id != travelVoucher.id) {
			return false;
		}
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
		if (isStatusAdd != travelVoucher.isStatusAdd) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(COUNTRY).append(country).append(NEXT_LINE);
		if (city != null) {
			builder.append(CITY).append(city).append(NEXT_LINE);
		}
		builder.append(TOUR_TYPE).append(tourType).append(NEXT_LINE);
		builder.append(NUMBER_NIGHTS).append(numberNights).append(NEXT_LINE);
		builder.append(PRICE).append(price).append(NEXT_LINE);
		if (comment != null) {
			builder.append(COMMENT).append(comment).append(NEXT_LINE);
		}
		if (isStatusAdd == true) {
			builder.append(TRAVEL_VOUCHER_ADDED).append(NEXT_LINE);
		}
		return builder.toString();
	}
}