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

	public Student(String lastName, String initials, int numberGrou, int academicPerformanceOne,
			int academicPerformanceTwo, int academicPerformanceThree, int academicPerformanceFour,
			int academicPerformanceFive) {
		this.lastName = lastName;
		this.initials = initials;
		this.numberGroup = numberGrou;
		this.academicPerformance[0] = academicPerformanceOne;
		this.academicPerformance[1] = academicPerformanceTwo;
		this.academicPerformance[2] = academicPerformanceThree;
		this.academicPerformance[3] = academicPerformanceFour;
		this.academicPerformance[4] = academicPerformanceFive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getNumberGroup() {
		return numberGroup;
	}
	
	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}
	
	public int[] getAcademicPerformance() {
		return academicPerformance;
	}
	
	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}
}