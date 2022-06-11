package by.koroza.programming_with_classes.composition.numberfive;

public class TravelVoucher {
	private String country;
	private String city;
	private String tourType;
	private int numberNights;
	private double price;
	private String comment;

	public TravelVoucher(String country, String tourType, int numberNights, double price, String comment) {
		this.country = country;
		this.tourType = tourType;
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
	}

	public TravelVoucher(String country, String city, String tourType, int numberNights, double price) {
		this.country = country;
		this.city = city;
		this.tourType = tourType;
		this.numberNights = numberNights;
		this.price = price;
	}
	
	public TravelVoucher(String country, String city, String tourType, int numberNights, double price, String comment) {
		this.country = country;
		this.city = city;
		this.tourType = tourType;
		this.numberNights = numberNights;
		this.price = price;
		this.comment = comment;
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime;
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
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
}