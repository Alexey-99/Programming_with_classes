/* Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд. 
 */

package by.koroza.programming_with_classes.classes.numbersix;

import java.time.LocalTime;

public class Time {
	private LocalTime time;

	public Time() {
		this.time = LocalTime.of(00, 00, 00);
	}

	public Time(int hours, int minutes, int seconds) {
		this.time = LocalTime.of(Validation.validationHours(hours), Validation.validationMinutes(minutes),
				Validation.validationSeconds(seconds));
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(int hours, int minutes, int seconds) {
		this.time = LocalTime.of(Validation.validationHours(hours), Validation.validationMinutes(minutes),
				Validation.validationSeconds(seconds));
	}

	public void setHours(int hours) {
		time = LocalTime.of(Validation.validationHours(hours), time.getMinute(), time.getSecond());
	}

	public void setMinutes(int minutes) {
		time = LocalTime.of(time.getHour(), Validation.validationMinutes(minutes), time.getSecond());
	}

	public void setSeconds(int seconds) {
		time = LocalTime.of(time.getHour(), time.getMinute(), Validation.validationSeconds(seconds));
	}

	public void plusHours(int hours) {
		time = time.plusHours(hours);
	}

	public void minusHours(int hours) {
		time = time.minusHours(hours);
	}

	public void plusMinutes(int minutes) {
		time = time.plusMinutes(minutes);
	}

	public void minusMinutes(int minutes) {
		time = time.minusMinutes(minutes);
	}

	public void plusSeconds(int seconds) {
		time = time.plusSeconds(seconds);
	}

	public void minusSeconds(int seconds) {
		time = time.minusSeconds(seconds);
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (time != null ? time.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Time time = (Time) object;
		if (this.time == null) {
			if (time.time != null) {
				return false;
			}
		} else if (!this.time.equals(time.time)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("time: ").append(time);
		return build.toString();
	}
}