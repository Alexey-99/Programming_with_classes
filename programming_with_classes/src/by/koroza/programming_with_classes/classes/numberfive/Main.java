/* Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. +
 * Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса. 
 */

package by.koroza.programming_with_classes.classes.numberfive;

public class Main {
	final static String COUNTER_WITHOUT_CONSTRUCTER = "Counter without constructer";
	final static String COUNTER_WITH_CONSTRUCTER = "Counter with constructer";
	final static String COUNTER_INCREASES = "The counter increases";
	final static String COUNTER_DECREASES = "The counter decreases";
	final static String COUNTER_DEFAULT_VALUES = "Counter default values: ";

	public static void main(String[] args) throws Exception {
		System.out.println(COUNTER_WITHOUT_CONSTRUCTER);
		Counter counter1 = new Counter();
		playCount(counter1);

		System.out.println();

		System.out.println(COUNTER_WITH_CONSTRUCTER);
		Counter counter2 = new Counter(50, 40, 80);
		playCount(counter2);
	}

	public static void playCount(Counter counter) {
		System.out.printf(COUNTER_DEFAULT_VALUES + "value = %d, minimum value = %d, maximum value = %d\n",
				counter.getValue(), counter.getMinValue(), counter.getMaxValue());
		counterIncreases(counter);
		counterDecreases(counter);
	}

	private static void counterIncreases(Counter counter) {
		System.out.println(COUNTER_INCREASES);
		for (int i = counter.getValue(); i <= counter.getMaxValue(); i++) {
			System.out.println(counter.getValue());
			if (i < counter.getMaxValue()) {
				counter.increaseNumber();
			}
		}
	}

	private static void counterDecreases(Counter counter) {
		System.out.println(COUNTER_DECREASES);
		for (int i = counter.getValue(); i >= counter.getMinValue(); i--) {
			System.out.println(counter.getValue());
			if (i > counter.getMinValue()) {
				counter.reduceNumber();
			}
		}
	}
}