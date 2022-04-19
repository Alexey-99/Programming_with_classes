/* Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных. 
 */

package by.koroza.programming_with_classes.classes.numberone;

public class NumberOne {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.printOne();
		test1.printTwo();
		System.out.println(test1.sum());
		System.out.println(test1.maxNumber());
	}
}
