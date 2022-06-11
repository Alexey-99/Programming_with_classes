package by.koroza.programming_with_classes.composition.numberfive;

public class TravelCampany {
	private String name;
	private TravelVoucher[] travelVochers;

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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (travelVochers != null ? travelVochers.hashCode() : 1);
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
		return builder.toString();
	}

}