/* �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
 * �������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ���������
 * ������� �� ������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������
 * �������������. �������� ����������� ���������� ������ �� ������ ����������, ������ ������ �
 * ����������� �������� ���������� ������ ���� ����������� �� ������� �����������.
 */

package by.koroza.programming_with_classes.classes.numberfour.task_4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {

	private String destinationName;
	private int numberTrain;
	private LocalTime departureTime;

	public Train(String destinationName, int numberTrain, String departureTime) {
		this.destinationName = destinationName;
		this.numberTrain = numberTrain;
		this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
	}

	public String getDestinationName() {
		return destinationName;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}
}
