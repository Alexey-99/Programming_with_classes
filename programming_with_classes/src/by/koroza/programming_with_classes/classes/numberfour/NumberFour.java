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
	final static String SELECT_OPERATION = "Select one of the following items:";
	final static String OPERATION_ONE = "1 - Show original timetable.";
	final static String OPERATION_TWO = "2 - Sorting timetable by number train.";
	final static String OPERATION_THREE = "3 - Sorting timetable by destination";
	final static String OPERATION_FOUR = "4 - Display information about the train.";
	final static String OPERATION_ZERO = "0 - Exit";

	public static void main(String[] args) {
		Train[] trains = { new Train("Kiev", 1, "05:20"), new Train("Oslo", 3, "20:30"), new Train("Brest", 2, "15:35"),
				new Train("Kharkov", 4, "10:30"), new Train("Mariupol", 5, "00:30") };
		conclusionInformationAboutTrains(trains);

	}

	public static void conclusionInformationAboutTrains(Train[] trains) {
		String numberOperation = inputNumberOperation(trains);
		while (!numberOperation.equals("0")) {
			switch (numberOperation) {
			case "1":
				Train.printOriginalTimetable(trains);
				break;
			case "2":
				Train.printSortingTimetableByNumberTrain(trains);
				break;
			case "3":
				Train.printSortingTimetableByDestination(trains);
				break;
			case "4":
				break;
			}
			numberOperation = inputNumberOperation(trains);
		}

		// String numberTrain = inputTrainNumber(trains);

	}

	private static String inputNumberOperation(Train[] trains) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String numberOperation = "";
		boolean flagCorrect = true;
		do {
			System.out.println(SELECT_OPERATION);
			System.out.println(OPERATION_ONE);
			System.out.println(OPERATION_TWO);
			System.out.println(OPERATION_THREE);
			System.out.println(OPERATION_FOUR);
			System.out.println(OPERATION_ZERO);
			numberOperation = scan.nextLine();
			flagCorrect = Validation.validationOnCorrectInputNumberOperaion(numberOperation);
		} while (flagCorrect == false);
		return numberOperation;
	}

	private static String inputTrainNumber(Train[] trains) {
		Scanner scan = new Scanner(System.in);
		boolean flagCorrect;
		String numberTrain = "";
		do {
			flagCorrect = false;
			System.out.println("Please, input interesting number train");
			numberTrain = scan.nextLine();
			flagCorrect = Validation.validationOnCorrectInputNumberTrain(numberTrain, trains);
		} while (flagCorrect == false);
		scan.close();
		return numberTrain;
	}
}