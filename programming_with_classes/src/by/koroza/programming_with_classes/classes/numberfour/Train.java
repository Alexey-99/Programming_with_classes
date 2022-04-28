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
		Train[] trainsClone = sortTrainsByNumber(trains);
		printTimetable(trainsClone);
	}

	public static void printSortingTimetableByDestination(Train[] trains) {
		Train[] trainsClone = sortTimetableByDestination(trains);
		printTimetable(trainsClone);
	}

	public static void printInformationAboutSelectedTrain(Train[] trains, String numberTrain) {
		int number = Integer.parseInt(numberTrain);
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].numberTrain == number) {
				System.out.println(trains[i].toString());
			}
		}
	}

	private static Train[] sortTrainsByNumber(Train[] trains) {
		Train[] trainsClone = trains.clone();
		for (int i = 0; i < trainsClone.length; i++) {
			for (int j = i; j < trainsClone.length; j++) {
				if (trainsClone[i].getNumberTrain() > trainsClone[j].getNumberTrain()) {
					Train tmp = trainsClone[i];
					trainsClone[i] = trainsClone[j];
					trainsClone[j] = tmp;
				}
			}
		}
		return trainsClone;
	}

	private static void printTimetable(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i].toString());
		}
	}

	private static Train[] sortTimetableByDestination(Train[] trains) {
		Train[] trainsClone = trains.clone();
		int compare = 0;
		Train trainByffer;
		for (int i = 0; i < trainsClone.length; i++) {
			for (int j = 0; j <= i; j++) {
				compare = trainsClone[i].destination.compareTo(trainsClone[j].destination);
				if (compare < 0) {
					trainByffer = trainsClone[i];
					trainsClone[i] = trainsClone[j];
					trainsClone[j] = trainByffer;
				} else if (compare == 0) {
					if (trainsClone[i].timeDeparture.isBefore(trainsClone[j].timeDeparture)) {
						trainByffer = trainsClone[i];
						trainsClone[i] = trainsClone[j];
						trainsClone[j] = trainByffer;
					}
				}
			}
		}
		return trainsClone;
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