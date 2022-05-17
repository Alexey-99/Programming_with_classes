/* Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд. 
 */

package test;

public class MainTest {

	public static void main(String[] args) {
		TimeTest time = new TimeTest();
		System.out.println("Время по умолчанию: " + time.getTime());

		time = new TimeTest(12, 24, 13);
		System.out.println("Время созданное через конструктор: " + time.getTime());

		time.setHours(14);
		System.out.println("Изменили количество часов: " + time.getTime());

		
		time.setMinutes(30);
		System.out.println("Изменили количество минут: " + time.getTime());

		time.setSeconds(48);
		System.out.println("Изменили количество секунд: " + time.getTime());

		time.setHours(25);
		time.setMinutes(-5);
		time.setSeconds(60);
		System.out.println("Введено недопустимое значене: " + time.getTime());
	}
}
