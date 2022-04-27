/* ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми
 * по-умолчанию и произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€,
 * и метод позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все
 * возможности класса.
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
			throw new Exception("Ќе верно задан диапазон! ћинимальна€ граница больше  начального числа!");
		} else if (max < number) {
			throw new Exception("Ќе верно задан диапазон! ћаксимальна€ граница меньше начального числа!");
		} else if (min > max) {
			throw new Exception("Ќе верно задан диапазон! ћаксимальна€ граница меньше минимальной!");
		}
	}

	public void increaseNumber() {
		if (number < max) {
			number++;
		} else {
			System.out.println("«аданное число больше верхней границы");
		}
	}

	public void reduceNumber() {
		if (number > min) {
			number--;
		} else {
			System.out.println("«аданное число меньше нижней границы");
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
