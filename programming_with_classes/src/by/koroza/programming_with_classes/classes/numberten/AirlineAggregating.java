package by.koroza.programming_with_classes.classes.numberten;

public class AirlineAggregating {
	private Airline[] airlines;

	public AirlineAggregating() {

	}

	public AirlineAggregating(Airline[] airlines) {
		this.airlines = airlines;
	}

	public Airline[] getAirlines() {
		return airlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	public void addAirline(Airline airline) {
		Airline[] airlineNew = null;
		if (this.airlines == null) {
			airlineNew = new Airline[1];
			airlineNew[0] = airline;
		} else {
			airlineNew = new Airline[airlines.length + 1];
			for (int i = 0; i < airlineNew.length; i++) {
				if (i < airlines.length) {
					airlineNew[i] = airlines[i];
				} else if (i == airlines.length) {
					airlineNew[i] = airline;
				}
			}
		}
		this.airlines = airlineNew;
	}

	public void addAirlines(Airline[] airlines) {
		Airline[] airlinesNew = null;
		if (this.airlines == null) {
			this.airlines = airlines;
		} else {
			airlinesNew = new Airline[this.airlines.length + airlines.length];
			for (int i = 0; i < airlinesNew.length; i++) {
				if (i < this.airlines.length) {
					airlinesNew[i] = this.airlines[i];
				} else if (i >= airlines.length) {
					airlinesNew[i] = airlines[i - this.airlines.length];
				}
			}
			this.airlines = airlinesNew;
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (airlines != null ? airlines.hashCode() : 1);
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
		AirlineAggregating aggregating = (AirlineAggregating) object;
		if (airlines == null) {
			if (aggregating.airlines != null) {
				return false;
			}
		} else if (!airlines.equals(aggregating.airlines)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(Airline airline: airlines) {
			builder.append(airline.toString());
		}
		return builder.toString();
	}
}