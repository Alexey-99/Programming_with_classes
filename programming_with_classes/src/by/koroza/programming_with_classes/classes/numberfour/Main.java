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

import java.util.Scanner;

public class Main {
	final static String SELECT_OPERATION = "Select one of the following items:";
	final static String OPERATION_ONE = "1 - Show original timetable.";
	final static String OPERATION_TWO = "2 - Sorting timetable by number train.";
	final static String OPERATION_THREE = "3 - Sorting timetable by destination";
	final static String OPERATION_FOUR = "4 - Display information about the train.";
	final static String OPERATION_ZERO = "0 - Exit";
	final static String INPUT_NUMBER_TRAIN = "Please, input interesting number train";
	final static String INFOMATION_ONE_MORE_TRAIN = "Do you want to know information about one nore train? Input, please, Yes - 1 or No - 0";
	final static String SELECT_NEW_OPERATION = "Do you want to select new operation? Input, please, Yes - 1 or No - 0.";

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
				String answerContinueOperation = "";
				do {
					Train.printOriginalTimetable(trains);
					String numberTrain = inputTrainNumber(trains);
					Train.printInformationAboutSelectedTrain(trains, numberTrain);
					answerContinueOperation = inputWantKnowInformationAboutOneMoreTrain(trains);
				} while (answerContinueOperation.equals("1"));
				break;
			}
			String answerNewOperation = inputWantContinue();
			if (answerNewOperation.equals("1")) {
				numberOperation = inputNumberOperation(trains);
			} else {
				numberOperation = answerNewOperation;
			}
		}
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
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean flagCorrect;
		String numberTrain = "";
		do {
			flagCorrect = false;
			System.out.println(INPUT_NUMBER_TRAIN);
			numberTrain = scan.nextLine();
			flagCorrect = Validation.validationOnCorrectInputNumberTrain(numberTrain, trains);
		} while (flagCorrect == false);
		return numberTrain;
	}

	private static String inputWantKnowInformationAboutOneMoreTrain(Train[] trains) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean isCorrectAnswer;
		String answer;
		do {
			System.out.println(INFOMATION_ONE_MORE_TRAIN);
			answer = scan.nextLine();
			isCorrectAnswer = Validation.validationAnswerOneOrZero(answer);
		} while (isCorrectAnswer == false);
		return answer;
	}

	private static String inputWantContinue() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean isCorrectAnswer;
		String answer;
		do {
			System.out.println(SELECT_NEW_OPERATION);
			answer = scan.nextLine();
			isCorrectAnswer = Validation.validationAnswerOneOrZero(answer);
		} while (isCorrectAnswer == false);
		return answer;
	}
}