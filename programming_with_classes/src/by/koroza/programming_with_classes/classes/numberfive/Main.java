/* Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. +
 * Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса. 
 */

package by.koroza.programming_with_classes.classes.numberfive;

public class Main {

	public static void main(String[] args) throws Exception {
		Counter counter1 = new Counter();
		playCount(counter1);

		Counter counter2 = new Counter(50, 60, 40);
		playCount(counter2);
	}

	public static void playCount(Counter counter) {

	}
}