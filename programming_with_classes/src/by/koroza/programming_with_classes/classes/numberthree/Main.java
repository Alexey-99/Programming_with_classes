/* Создайте класс с именем Student, содержащий поля: 
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, 
 * имеющих оценки, равные только 9 или 10.
 * */

package by.koroza.programming_with_classes.classes.numberthree;

public class Main {

	public static void main(String[] args) {
		Student[] students = { new Student("Koroza", "AM", 1, 9, 9, 10, 9, 10),
				new Student("Sobol", "SL", 2, 5, 9, 10, 2, 4), new Student("Abramson", "AN", 1, 10, 9, 10, 9, 10),
				new Student("Howard", "HD", 1, 9, 9, 10, 9, 7), new Student("Jacobson", "JN", 2, 8, 6, 3, 9, 10),
				new Student("Keat", "KT", 2, 9, 9, 10, 9, 1), new Student("Laird", "LD", 1, 9, 9, 10, 9, 10),
				new Student("Macadam", "MM", 2, 9, 9, 10, 3, 10), new Student("MacDonald", "MD", 1, 9, 9, 10, 9, 10),
				new Student("Miller", "MR", 2, 9, 9, 5, 9, 10) };
		print(students);
	}

	private static void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			boolean flagAcademicPerformance = true;
			for (int j = 0; j < students[i].getAcademicPerformance().length; j++) {
				if (students[i].getAcademicPerformance()[j] < 9) {
					flagAcademicPerformance = false;
				}
			}
			if (flagAcademicPerformance == true) {
				StringBuilder build = new StringBuilder();
				build.append("LastName - ").append(students[i].getLastName());
				build.append(", Number group - ").append(students[i].getNumberGroup());
				System.out.println(build);
			}
		}
	}
}