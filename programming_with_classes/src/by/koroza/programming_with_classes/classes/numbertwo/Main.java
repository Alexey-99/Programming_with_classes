/* Создйте класс Test2 двумя переменными. 
 * Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса. 
 */

package by.koroza.programming_with_classes.classes.numbertwo;

public class Main {

	public static void main(String[] args) {
		Test2 test1 = new Test2("sfbdfcfv", 6561);
		test1.setNumberOne("java");
		System.out.println(test1.getNumberOne());
		test1.setNumberTwo(646);
		System.out.println(test1.getNumberTwo());

		Test2 test2 = new Test2();
		test2.setNumberOne("java2");
		System.out.println(test2.getNumberOne());
		test2.setNumberTwo(6166161);
		System.out.println(test2.getNumberTwo());
	}
}