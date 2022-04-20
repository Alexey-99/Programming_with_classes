/* Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, 
 * имеющих оценки, равные только 9 или 10.*/

package by.koroza.programming_with_classes.classes.numberthree;

public class NumberThree {

	public static void main(String[] args) {
		Student[] students = { new Student("Koroza", "AM", 1), new Student("Sobol", "SL", 2),
				new Student("Abramson", "AN", 1), new Student("Howard", "HD", 1), new Student("Jacobson", "JN", 2),
				new Student("Keat", "KT", 2), new Student("Laird", "LD", 1), new Student("Macadam", "MM", 2),
				new Student("MacDonald", "MD", 1), new Student("Miller", "MR", 2) };
	}

}
