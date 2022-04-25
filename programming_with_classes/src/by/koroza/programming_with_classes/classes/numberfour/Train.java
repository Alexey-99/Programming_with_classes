package by.koroza.programming_with_classes.classes.numberfour;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {
	private String destination;
	private int numberTrain;
	private LocalTime timeDeparture;

	public Train(String destination, int numberTrain, String timeDeparture) {
		this.destination = destination;
		this.numberTrain = numberTrain;
		this.timeDeparture = LocalTime.parse(timeDeparture, DateTimeFormatter.ofPattern("HH:mm"));
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public LocalTime getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(LocalTime timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public static void printOriginalTimetable(Train[] trains) {
		printTimetable(trains);
	}

	public static void printSortingTimetableByNumberTrain(Train[] trains) {
		sortTrainsByNumber(trains);
		printTimetable(trains);
	}

	public static void printSortingTimetableByDestination(Train[] trains) {
		trains = sortTimetableByDestination(trains);
		printTimetable(trains);
	}

	private static Train[] sortTrainsByNumber(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = i; j < trains.length; j++) {
				if (trains[i].getNumberTrain() > trains[j].getNumberTrain()) {
					Train tmp = trains[i];
					trains[i] = trains[j];
					trains[j] = tmp;
				}
			}
		}
		return trains;
	}

	private static void printTimetable(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i].toString());
		}
	}

	private static Train[] sortTimetableByDestination(Train[] trains) {
		Train[] sortedTrainArray = trains.clone();
		int compare = 0;
		Train trainByffer;
		for (int i = 0; i < sortedTrainArray.length; i++) {
			for (int j = 0; j <= i; j++) {
				compare = sortedTrainArray[i].getDestination().compareTo(sortedTrainArray[j].getDestination());
				if (compare < 0) {
					trainByffer = sortedTrainArray[i];
					sortedTrainArray[i] = sortedTrainArray[j];
					sortedTrainArray[j] = trainByffer;
				} else if (compare == 0) {
					if (sortedTrainArray[i].getTimeDeparture().isBefore(sortedTrainArray[j].getTimeDeparture())) {
						trainByffer = sortedTrainArray[i];
						sortedTrainArray[i] = sortedTrainArray[j];
						sortedTrainArray[j] = trainByffer;
					}
				}
			}
		}
		return sortedTrainArray;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (destination != null ? destination.hashCode() : 1);
		result = result * prime + numberTrain;
		result = result * prime + (timeDeparture != null ? timeDeparture.hashCode() : 1);
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

		Train train = (Train) object;
		if (destination == null) {
			if (train.destination != null) {
				return false;
			}
		} else if (!destination.equals(train.destination)) {
			return false;
		}
		if (numberTrain != train.numberTrain) {
			return false;
		}
		if (timeDeparture != train.timeDeparture) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Destination - ").append(destination).append("\n");
		build.append("Number train - ").append(numberTrain).append("\n");
		build.append("Time departure - ").append(timeDeparture).append("\n");
		return build.toString();
	}
}