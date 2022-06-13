package by.koroza.programming_with_classes.composition.numberfive.entity;

public class TravelCampany {
	private String name;
	private TravelVoucher[] travelVochers;
	private static final String COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS = "At the moment, the company does not have tourist vouchers";

	public TravelCampany(String name) {
		this.name = name;
		this.travelVochers = new TravelVoucher[0];
	}

	public TravelCampany(String name, TravelVoucher travelVocher) {
		this.name = name;
		this.travelVochers = new TravelVoucher[1];
		this.travelVochers[0] = travelVocher;
	}

	public TravelCampany(String name, TravelVoucher[] travelVochers) {
		this.name = name;
		this.travelVochers = travelVochers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TravelVoucher[] getTravelVochers() {
		return travelVochers;
	}

	public void setTravelVochers(TravelVoucher[] travelVochers) {
		this.travelVochers = travelVochers;
	}

	public void addTravelVocher(TravelVoucher travelVocher) {
		TravelVoucher[] travelVochersNew = new TravelVoucher[this.travelVochers.length + 1];
		for (int i = 0; i < travelVochersNew.length; i++) {
			if (i < this.travelVochers.length) {
				travelVochersNew[i] = this.travelVochers[i];
			} else if (i == this.travelVochers.length) {
				travelVochersNew[i] = travelVocher;
			}
		}
		this.travelVochers = travelVochersNew;
	}

	public void addTravelVochers(TravelVoucher[] travelVochers) {
		TravelVoucher[] travelVochersNew = new TravelVoucher[this.travelVochers.length + travelVochers.length];
		for (int i = 0; i < travelVochersNew.length; i++) {
			if (i < this.travelVochers.length) {
				travelVochersNew[i] = this.travelVochers[i];
			} else if (i >= this.travelVochers.length) {
				travelVochersNew[i] = travelVochers[i - this.travelVochers.length];
			}
		}
		this.travelVochers = travelVochersNew;

	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (travelVochers != null ? travelVochers.hashCode() : 1);
		result = result * prime
				+ (COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS != null ? COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS.hashCode()
						: 1);
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
		TravelCampany campany = (TravelCampany) object;
		if (name == null) {
			if (campany.name != null) {
				return false;
			}
		} else if (!name.equals(campany.name)) {
			return false;
		}
		if (travelVochers == null) {
			if (campany.travelVochers != null) {
				return false;
			}
		} else if (!travelVochers.equals(campany.travelVochers)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < travelVochers.length; i++) {
			if (travelVochers[i] != null) {
				builder.append(travelVochers[i].toString());
			}
		}
		if ((travelVochers[0] == null) && (travelVochers.length == 1)) {
			builder.append(COMPANY_DOES_NOT_HAVE_TOURIST_VOUCHERS);
		}
		return builder.toString();
	}
}