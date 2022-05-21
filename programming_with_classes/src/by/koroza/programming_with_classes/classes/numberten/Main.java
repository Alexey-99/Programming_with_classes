/* Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *    
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
 * Найти и вывести:  
 * a) список рейсов для заданного пункта назначения;  
 * b) список рейсов для заданного дня недели; 
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
 */

package by.koroza.programming_with_classes.classes.numberten;

public class Main {

	public static void main(String[] args) {
		Airline[] airlines = { new Airline("Kiev", "cargo", "12:30", "Manday"),
				new Airline("Minsk", "t", "13:30", "Manday") };

		AirlineAggregating aggregating = new AirlineAggregating(airlines);
		System.out.println(aggregating.toString());
		System.out.println("Print list of flights for a given destination: ");
		aggregating.printAirlinesByDestination("Minsk");
		System.out.println("Print list of flights for a given day of the week: ");
		aggregating.printAirlinesByDayWeek("M");
		System.out.println(
				"printing a list of flights for a given day of the week, the departure time for which is greater than the specified one. ");
		aggregating.printAirlinesByDayWeekAndDepartureTime("Manday", "13:29");
	}
}