/* �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
 * �������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ���������
 * ������� �� ������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������
 * �������������. �������� ����������� ���������� ������ �� ������ ����������, ������ ������ �
 * ����������� �������� ���������� ������ ���� ����������� �� ������� �����������.
 */

package by.koroza.programming_with_classes.classes.numberfour.task_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		final int numberOfTrains = 5;
		Train[] trainArray = new Train[numberOfTrains];
		trainArray[0] = new Train("�����", 5, "12:25");
		trainArray[1] = new Train("����", 18, "01:59");
		trainArray[2] = new Train("�����", 36, "07:17");
		trainArray[3] = new Train("�����", 14, "08:34");
		trainArray[4] = new Train("������", 1, "17:40");

		printToScreen(trainArray);

	}

	private static void sortTrainArrayByTrainNumber(Train[] trainArray) {

		int i = 0;
		Train trainByffer;
		Train[] sortedTrainArray = trainArray.clone();

		while (i < trainArray.length - 1) {
			if (sortedTrainArray[i].getNumberTrain() > sortedTrainArray[i + 1].getNumberTrain()) {
				trainByffer = sortedTrainArray[i];
				sortedTrainArray[i] = sortedTrainArray[i + 1];
				sortedTrainArray[i + 1] = trainByffer;

				if (i > 0) {
					i--;
				}
			} else if (i < trainArray.length - 1) {
				i++;
			}
		}
		System.out.println("���������� ��������������� �� ������� �������");
		printTrainArray(sortedTrainArray);
	}

	private static void sortTrainArrayByDestinationName(Train[] trainArray) {
		Train[] sortedTrainArray = trainArray.clone();
		int compare = 0;
		Train trainByffer;

		for (int i = 0; i < sortedTrainArray.length; i++) {
			for (int j = 0; j <= i; j++) {
				compare = sortedTrainArray[i].getDestinationName().compareTo(sortedTrainArray[j].getDestinationName());
				if (compare < 0) {
					trainByffer = sortedTrainArray[i];
					sortedTrainArray[i] = sortedTrainArray[j];
					sortedTrainArray[j] = trainByffer;
				} else if (compare == 0) {
					if (sortedTrainArray[i].getDepartureTime().isBefore(sortedTrainArray[j].getDepartureTime())) {
						trainByffer = sortedTrainArray[i];
						sortedTrainArray[i] = sortedTrainArray[j];
						sortedTrainArray[j] = trainByffer;
					}
				}
			}
		}
		System.out.println("���������� ��������������� �� ������ ����������");
		printTrainArray(sortedTrainArray);
	}

	private static void printToScreen(Train[] trainArray) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
		int number = 1;
		while (number != 0) {

			System.out.println("�������� ���� �� ��������� �������:");
			System.out.println("1 - �������� �������� ����������.");
			System.out.println("2 - ����������� ���������� �� ������� �������");
			System.out.println("3 - ����������� ���������� �� ������ ����������");
			System.out.println("4 - ������� ���������� � ������");
			System.out.println("0 - �����");

			
			number = scan.nextInt();
			if (number < 0 || number > 5) {
				System.out.println("�� ����� ������������ ��������! ������� ����������? 1 - ��, 0 - ���.");
				number = scan.nextInt();
				if (number != 1) {
					System.out.println("�� ����� ����� ������������ ��������! ������ ����������.");
					break;
				} else {
					System.out.print("������� �������� ������ ��� ��������: ");
					number = scan.nextInt();
				}
			}
			switch (number) {
			case 1:
				System.out.println("�������� ����������");
				printTrainArray(trainArray);
				System.out.println("������ ����������? 1 - ��, 0 - ���.");
				number = scan.nextInt();
				if (number == 0) {
					System.out.println("������ ���������.");
					break;
				} else if (number == 1) {
					number = 0;
					continue;
				} else {
					System.out.println("������ ����������! �������� ����!");
					number = 0;
					break;
				}
			case 2:
				sortTrainArrayByTrainNumber(trainArray);
				System.out.println("������ ����������? 1 - ��, 0 - ���.");
				number = scan.nextInt();
				if (number == 0) {
					System.out.println("������ ���������.");
					break;
				} else if (number == 1) {
					continue;
				} else {
					System.out.println("������ ����������! �������� ����!");
					number = 0;
					break;
				}
			case 3:
				sortTrainArrayByDestinationName(trainArray);
				System.out.println("������ ����������? 1 - ��, 0 - ���.");
				number = scan.nextInt();
				if (number == 0) {
					System.out.println("������ ���������.");
					break;
				} else if (number == 1) {
					continue;
				} else {
					System.out.println("������ ����������! �������� ����!");
					number = 0;
					break;
				}
			case 4:
				boolean find = false;
				int i = 0;

				System.out.println("������ ������� �� ������� ����� ������ ����������:");
				for (int j = 0; j < trainArray.length; j++) {
					System.out.print(trainArray[j].getNumberTrain() + " ");
				}
				System.out.print("\n������� ����� ������������� ������: ");
				number = scan.nextInt();

				while (i < trainArray.length && find == false) {
					if (trainArray[i].getNumberTrain() == number) {
						System.out.println("\n���������� � ������:");
						System.out.println("�������� ������ ���������� | ����� ������ | ����� �����������");
						System.out.printf("%-27s| %-13d| %s\n", trainArray[i].getDestinationName(),
								trainArray[i].getNumberTrain(), trainArray[i].getDepartureTime());

						System.out.println("\n������ ����������? 1 - ��, 0 - ���.");
						number = scan.nextInt();
						if (number == 0) {
							System.out.println("������ ���������.");
							find = true;
							i = -1;
							number = 0;
						} else if (number == 1) {
							System.out.print("\n������� ����� ������������� ������: ");
							number = scan.nextInt();
							i = -1;
						} else {
							System.out.println("������ ����������! �������� ����!");
							number = 0;
							break;

						}
					}

					i++;

					if (i == trainArray.length && find == false) {
						System.out.println("�� ����� ������������ ��������! ������� ����������? 1 - ��, 0 - ���.");
						number = scan.nextInt();
						if (number != 1) {
							System.out.println("�� ����� ����� ������������ ��������! ������ ����������.");
							number = 0;
							break;
						} else {
							System.out.print("������� ����� ������� ��� ������: ");
							number = scan.nextInt();
							i = 0;
						}
					}
				}
			}
		}
	}
		catch (InputMismatchException e) {
			System.out.print("������! �� ����� �� �����! ������ ����������!");
		}
	}

	private static void printTrainArray(Train[] trainArray) {
		System.out.println("�������� ������ ���������� | ����� ������ | ����� �����������");

		for (Train train : trainArray) {
			System.out.printf("%-27s| %-13d| %s\n", train.getDestinationName(), train.getNumberTrain(),
					train.getDepartureTime());
		}
		System.out.println("");
	}
}
