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
	private static final String CHANGE_HOURS = "Change hours - ";
	private static final String CHANGE_MINUTES = "Change minutes - ";
	private static final String CHANGE_SECONDS = "Change seconds - ";
	private static final String ADD_HOURS = "Add hours - ";
	private static final String ADD_MINUTES = "Add minutes - ";
	private static final String ADD_SECONDS = "Add seconds - ";
	private static final String MINUS_HOURS = "Minus hours - ";
	private static final String MINUS_MINUTES = "Minus minutes - ";
	private static final String MINUS_SECONDS = "Minus seconds - ";

	public static void main(String[] args) {
		Time time1 = new Time(12, 34, 56);
		System.out.println(TIME_GIVEN_IN_CONSTRUCTOR + time1.getTime());

		time1.setHours(3);
		System.out.println(CHANGE_HOURS + time1.getTime());
		time1.setMinutes(5);
		System.out.println(CHANGE_MINUTES + time1.getTime());
		time1.setSeconds(14);
		System.out.println(CHANGE_SECONDS + time1.getTime());

		time1.plusHours(1);
		System.out.println(ADD_HOURS + time1.getTime());
		time1.minusHours(2);
		System.out.println(MINUS_HOURS + time1.getTime());
		time1.plusMinutes(26);
		System.out.println(ADD_MINUTES + time1.getTime());
		time1.minusMinutes(32);
		System.out.println(MINUS_MINUTES + time1.getTime());
		time1.plusSeconds(10);
		System.out.println(ADD_SECONDS + time1.getTime());
		time1.minusSeconds(15);
		System.out.println(MINUS_SECONDS + time1.getTime());

		Time time2 = new Time();
		System.out.println(TIME_BY_DEFAULT_ZERO + time2.toString());

		time2.setHours(3);
		System.out.println(CHANGE_HOURS + time2.getTime());
		time2.setMinutes(5);
		System.out.println(CHANGE_MINUTES + time2.getTime());
		time2.setSeconds(14);
		System.out.println(CHANGE_SECONDS + time2.getTime());

		time2.plusHours(1);
		System.out.println(ADD_HOURS + time2.getTime());
		time2.minusHours(2);
		System.out.println(MINUS_HOURS + time2.getTime());
		time2.plusMinutes(26);
		System.out.println(ADD_MINUTES + time2.getTime());
		time2.minusMinutes(32);
		System.out.println(MINUS_MINUTES + time2.getTime());
		time2.plusSeconds(10);
		System.out.println(ADD_SECONDS + time2.getTime());
		time2.minusSeconds(15);
		System.out.println(MINUS_SECONDS + time2.getTime());
	}
}