/* Создайте класс Train, содержащий поля: 
 * - название пункта назначения, 
 * - номер поезда, 
 * - время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
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

}
