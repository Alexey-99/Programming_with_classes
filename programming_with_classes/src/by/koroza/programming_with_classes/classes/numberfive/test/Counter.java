/* ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ���������
 * ���� �������� �� ������� � �������� ���������. ������������� ������������� �������� ����������
 * ��-��������� � ������������� ����������. ������� ����� ������ ���������� � ���������� ���������,
 * � ����� ����������� �������� ��� ������� ���������. �������� ���, ��������������� ���
 * ����������� ������.
 */

package by.koroza.programming_with_classes.classes.numberfive.test;

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
			throw new Exception("Не верно задан диапазон! Минимальная граница больше  начального числа!");
		} else if (max < number) {
			throw new Exception("Не верно задан диапазон! Максимальная граница меньше начального числа!");
		} else if (min > max) {
			throw new Exception("Не верно задан диапазон! Максимальная граница меньше минимальной!");
		}
	}

	public void increaseNumber() {
		if (number < max) {
			number++;
		} else {
			System.out.println("Заданное число больше верхней границы");
		}
	}

	public void reduceNumber() {
		if (number > min) {
			number--;
		} else {
			System.out.println("Заданное число меньше нижней границы");
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