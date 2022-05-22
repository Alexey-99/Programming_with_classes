package by.koroza.programming_with_classes.classes.numberten;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AirlineAggregating {
	private Airline[] airlines;
	private static final String NO_MATCHES_FOUND_THIS_QUERY = "No matches were found for this query.";

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

	public void addAirlines(Airline[] airlines) { // TODO CHECK
		Airline[] airlinesNew = null;
		if (this.airlines == null) {
			this.airlines = airlines;
		} else {
			airlinesNew = new Airline[this.airlines.length + airlines.length];
			for (int i = 0; i < airlinesNew.length; i++) {
				if (i < this.airlines.length) {
					airlinesNew[i] = this.airlines[i];
				} else if (i >= this.airlines.length) {
					airlinesNew[i] = airlines[i - this.airlines.length];
				}
			}
			this.airlines = airlinesNew;
		}
	}

	public void printAirlinesByDestination(String destination) {
		int countReapitions = 0;
		for (Airline airline : airlines) {
			if (airline.getDestination().equals(destination)) {
				System.out.println(airline.toString());
				countReapitions++;
			}
		}
		if (countReapitions == 0) {
			System.out.println(NO_MATCHES_FOUND_THIS_QUERY);
		}
	}

	public void printAirlinesByDayWeek(String dayWeek) {
		int countReapitions = 0;
		for (Airline airline : airlines) {
			if (airline.getDayWeek().equals(dayWeek)) {
				System.out.println(airline.toString());
				countReapitions++;
			}
		}
		if (countReapitions == 0) {
			System.out.println(NO_MATCHES_FOUND_THIS_QUERY);
		}
	}

	public void printAirlinesByDayWeekAndDepartureTime(String dayWeek, String departureTime) {
		int countReapitions = 0;
		LocalTime time = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
		int compare;
		for (Airline airline : airlines) {
			if (airline.getDayWeek().equals(dayWeek)) {
				compare = airline.getDepartureTime().compareTo(time);
				if (compare > 0) {
					System.out.println(airline.toString());
					countReapitions++;
				}
			}
		}
		if (countReapitions == 0) {
			System.out.println(NO_MATCHES_FOUND_THIS_QUERY);
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (airlines != null ? airlines.hashCode() : 1);
		result = result * prime + (NO_MATCHES_FOUND_THIS_QUERY != null ? NO_MATCHES_FOUND_THIS_QUERY.hashCode() : 1);
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
		for (Airline airline : airlines) {
			builder.append(airline.toString());
		}
		return builder.toString();
	}
}