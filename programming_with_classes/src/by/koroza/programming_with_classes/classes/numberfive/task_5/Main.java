/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
 * по-умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 */

package by.epam.programming_with_classes.simplest_classes_and_objects.main.task_5;

public class Main {
	public static void main(String[] args) throws Exception {

		Counter counter = new Counter();
		print(counter);

		counter = new Counter(100, 90, 110);
		print(counter);
	}

	private static void print(Counter counter) {
		System.out.printf("Значения счётчика по умолчанию: number = %d, min = %d, max = %d\n", counter.getNumber(),
				counter.getMin(), counter.getMax());

		System.out.println("Увеличение");
		for (int i = counter.getNumber(); i < counter.getMax(); i++) {
			System.out.println(counter.getNumber());
			counter.increaseNumber();

		}

		System.out.println("Уменьшение");
		for (int i = counter.getNumber(); i > counter.getMin(); i--) {
			System.out.println(counter.getNumber());
			counter.reduceNumber();
		}
	}
}
