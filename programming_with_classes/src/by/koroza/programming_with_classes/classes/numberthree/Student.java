/* Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, 
 * имеющих оценки, равные только 9 или 10.
 * */

package by.koroza.programming_with_classes.classes.numberthree;

public class Student {
	private String lastName;
	private String initials;
	private int numberGroup;
	private int[] academicPerformance = new int[5];
	
	public Student(String lastName, String initials, int numberGrou, int[] academicPerformance) {
		this.lastName = lastName;
		this.initials = initials;
		this.numberGroup = numberGrou;
		this.academicPerformance = academicPerformance;
	}
}
