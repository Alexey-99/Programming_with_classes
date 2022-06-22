package by.koroza.programming_with_classes.classes.numberten;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airline {
	private static int count = 1;
	private static final String TIME_FORMAT = "HH:mm";
	private static final String NEXT_LINE = "\n";
	private static final String DESTINATION = "Destination: ";
	private static final String FLIGHT_NUMBER = "Flight number: ";
	private static final String AIRCRAFT_TYPE = "Aircraft type: ";
	private static final String DEPARTURE_TIME = "Departure time: ";
	private static final String DAY_WEEK = "Day week: ";
	private String destination;
	private int flightNumber;
	private String aircraftType;
	private LocalTime departureTime;
	private String dayWeek;

	public Airline(String destination, String aircraftType, String departureTime, String dayWeek) {
		this.destination = destination;
		this.flightNumber = count++;
		this.aircraftType = aircraftType;
		this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern(TIME_FORMAT));
		this.dayWeek = dayWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern(TIME_FORMAT));
	}

	public String getDayWeek() {
		return dayWeek;
	}

	public void setDayWeek(String dayWeek) {
		this.dayWeek = dayWeek;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + (destination != null ? destination.hashCode() : 1);
		result = result * prime + flightNumber;
		result = result * prime + (aircraftType != null ? aircraftType.hashCode() : 1);
		result = result * prime + (departureTime != null ? departureTime.hashCode() : 1);
		result = result * prime + (dayWeek != null ? dayWeek.hashCode() : 1);
		result = result * prime + (TIME_FORMAT != null ? TIME_FORMAT.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (DESTINATION != null ? DESTINATION.hashCode() : 1);
		result = result * prime + (FLIGHT_NUMBER != null ? FLIGHT_NUMBER.hashCode() : 1);
		result = result * prime + (AIRCRAFT_TYPE != null ? AIRCRAFT_TYPE.hashCode() : 1);
		result = result * prime + (DEPARTURE_TIME != null ? DEPARTURE_TIME.hashCode() : 1);
		result = result * prime + (DAY_WEEK != null ? DAY_WEEK.hashCode() : 1);
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
		Airline airline = (Airline) object;
		if (destination == null) {
			if (airline.destination != null) {
				return false;
			}
		} else if (!destination.equals(airline.destination)) {
			return false;
		}
		if (flightNumber != airline.flightNumber) {
			return false;
		}
		if (aircraftType == null) {
			if (airline.aircraftType != null) {
				return false;
			}
		} else if (!aircraftType.equals(airline.aircraftType)) {
			return false;
		}
		if (departureTime == null) {
			if (airline.departureTime != null) {
				return false;
			}
		} else if (!departureTime.equals(airline.departureTime)) {
			return false;
		}
		if (dayWeek == null) {
			if (airline.dayWeek != null) {
				return false;
			}
		} else if (!dayWeek.equals(airline.dayWeek)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(DESTINATION).append(destination).append(NEXT_LINE);
		builder.append(FLIGHT_NUMBER).append(flightNumber).append(NEXT_LINE);
		builder.append(AIRCRAFT_TYPE).append(aircraftType).append(NEXT_LINE);
		builder.append(DEPARTURE_TIME).append(departureTime).append(NEXT_LINE);
		builder.append(DAY_WEEK).append(dayWeek).append(NEXT_LINE);
		return builder.toString();
	}
}