/* ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ���������
 * ���� �������� �� ������� � �������� ���������. ������������� ������������� �������� ����������
 * ��-��������� � ������������� ����������. ������� ����� ������ ���������� � ���������� ���������,
 * � ����� ����������� �������� ��� ������� ���������. �������� ���, ��������������� ���
 * ����������� ������.
 */

package by.epam.programming_with_classes.simplest_classes_and_objects.main.task_5;

public class Counter {

	private int number;
	private int min;
	private int max;

	public Counter() {

		this.number = 0;
		this.min = -10;
		this.max = 10;
	}

	public Counter(int number, int min, int max) throws Exception {
		this.number = number;
		this.min = min;
		this.max = max;

		if (min > number) {
			throw new Exception("�� ����� ����� ��������! ����������� ������� ������  ���������� �����!");
		} else if (max < number) {
			throw new Exception("�� ����� ����� ��������! ������������ ������� ������ ���������� �����!");
		} else if (min > max) {
			throw new Exception("�� ����� ����� ��������! ������������ ������� ������ �����������!");
		}
	}

	public void increaseNumber() {
		if (number < max) {
			number++;
		} else {
			System.out.println("�������� ����� ������ ������� �������");
		}
	}

	public void reduceNumber() {
		if (number > min) {
			number--;
		} else {
			System.out.println("�������� ����� ������ ������ �������");
		}
	}

	public int getNumber() {
		return number;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
