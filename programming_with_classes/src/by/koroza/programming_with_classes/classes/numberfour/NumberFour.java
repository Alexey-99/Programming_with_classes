/* Создайте класс Train, содержащий поля: + 
 * - название пункта назначения,  +
 * - номер поезда, +
 * - время отправления. +
 * Создайте данные в массив из пяти элементов типа Train, + 
 * добавьте возможность сортировки элементов массива по номерам поездов. +
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, 
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 */

package by.koroza.programming_with_classes.classes.numberfour;

import java.util.Scanner;

public class NumberFour {

	public static void main(String[] args) {
		Train[] trains = { new Train("Kiev", 1, "05:20"), new Train("Oslo", 3, "20:30"), new Train("Brest", 2, "15:35"),
				new Train("Kharkov", 4, "10:30"), new Train("Kharkov", 5, "00:30") };
		sortTrainsOnNumber(trains);

	}

	public static Train[] sortTrainsOnNumber(Train[] trains) {
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

	public static void conclusionInformationAboutTrain(Train[] trains) {
		int numberTrain = inputTrainNumber();
	}

	private static void inputTrainNumber() {
		Scanner scan = new Scanner(System.in);
		boolean flagCorrect;
		do {
			flagCorrect = false;
			System.out.println("");
			int numberTrain = 
		}while(flagCorrect == false);
	}
}