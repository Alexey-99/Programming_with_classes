/* Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, 
 * и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса. 
 */

package by.koroza.programming_with_classes.classes.numberfive;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] array = { "Adfbdfb", "zdfbdfcb", "dfbdbvdxcb", "zvzcvxcvxcbx" };
		sort1(array);
		sort2(array);
	}

	private static void sort1(String[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void sort2(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int compare = array[i].compareTo(array[j]);
				if (compare > 0) {
					String tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}