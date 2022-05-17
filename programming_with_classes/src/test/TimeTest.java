/* Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд. 
 */

package test;

public class TimeTest {
	private int hours;
	private int minutes;
	private int seconds;
	
	public TimeTest() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public TimeTest(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	public String getTime() {
		return hours + ":" + minutes + ":" + seconds;
	}
	
	public void setHours(int hours) {
		if (hours >= 0 && hours <= 24) {
			this.hours = hours;
		}
		else {
			this.hours = 0;
		}
	}
	
	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		}
		else {
			this.minutes = 0;
		}
	}
	
	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds <= 59) {
			this.seconds = seconds;
		}
		else {
			this.seconds = 0;
		}
	}

	
}