package by.koroza.programming_with_classes.classes.numberten;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airline {
	private static int count = 1;

	private String destination;
	private int flightNumber;
	private String aircraftType;
	private LocalTime departureTime;
	private String dayWeek;

	public Airline(String destination, String aircraftType, String departureTime, String dayWeek) {
		this.destination = destination;
		this.flightNumber = count++;
		this.aircraftType = aircraftType;
		this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
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
		this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
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
		builder.append("Destination: ").append(destination).append("\n");
		builder.append("Flight number: ").append(flightNumber).append("\n");
		builder.append("Aircraft type: ").append(aircraftType).append("\n");
		builder.append("Departure time: ").append(departureTime).append("\n");
		builder.append("Day week: ").append(dayWeek).append("\n");
		return builder.toString();
	}
}