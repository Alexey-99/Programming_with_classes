/* Создайте класс Train, содержащий поля: 
 * - название пункта назначения, +
 * - номер поезда, +
 * - время отправления. +
 * Создайте данные в массив из пяти элементов типа Train, + 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, 
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 */

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
		return build.toString();
	}
}