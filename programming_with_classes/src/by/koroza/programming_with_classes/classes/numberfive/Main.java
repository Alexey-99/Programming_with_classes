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
	final static String COUNTERER_INCREASES = "The counter increases";
	final static String COUNTERER_DECREASES = "The counter decreases";

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
		counterIncreases(counter);
		counterDecreases(counter);
	}

	private static void counterIncreases(Counter counter) {
		System.out.println(COUNTERER_INCREASES);
		for (int i = counter.getValue(); i <= counter.getMaxValue(); i++) {
			System.out.println(counter.getValue());
			counter.increaseNumber();
		}
	}

	private static void counterDecreases(Counter counter) {
		System.out.println(COUNTERER_DECREASES);
		
	}
}