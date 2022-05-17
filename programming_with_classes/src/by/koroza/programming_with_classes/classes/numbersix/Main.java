/* Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд. 
 */

package by.koroza.programming_with_classes.classes.numbersix;

public class Main {
	private static final String TIME_GIVEN_IN_CONSTRUCTOR = "Time given in the constructor - ";
	private static final String TIME_BY_DEFAULT_ZERO = "Time by default - ";

	public static void main(String[] args) {
		Time time1 = new Time(12, 34, 56);
		System.out.println(TIME_GIVEN_IN_CONSTRUCTOR + time1.toString());
		time1.setHours(3);
		System.out.println(time1.toString());
		//time1.plusHours(1);
		//System.out.println(time1.toString());
		//time1.plusMinutes(26);
		//System.out.println(time1.toString());
		//time1.plusHours(10);
		//System.out.println(time1.toString());
		//time1.plusHours(1);
		//System.out.println(time1.toString());

		Time time2 = new Time();
		System.out.println(TIME_BY_DEFAULT_ZERO + time2.toString());
	}
}
