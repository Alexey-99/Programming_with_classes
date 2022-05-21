/* Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.   
 * 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 *  Найти и вывести:  
 *  a) список покупателей в алфавитном порядке;  
 *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
*/

package by.koroza.programming_with_classes.classes.numbereight;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Costomer[] costomers = {
				new Costomer("Maxim", "Ivanov", "Mihaylovich", new Address("Belurus", "Minsk", "Asanalieva", 5, 39),
						500, 1000),
				new Costomer("Alexey", "Koroza", "Mihaylovich", new Address("Belurus", "Minsk", "Asanalieva", 5, 39),
						501, 2000) };

		CostomerAggregating costomerAggregating1 = new CostomerAggregating(costomers);
		CostomerAggregating costomerAggregating2 = new CostomerAggregating();

		costomerAggregating1.addCostomer(new Costomer("Alexey", "Koroza", "Mihaylovich",
				new Address("Belurus", "Minsk", "asanalieva", 5, 39), 500, 1000));
		costomerAggregating1.addCostomers(costomers);

		Costomer costomer1 = new Costomer("Alexey", "Koroza", "Mihaylovich",
				new Address("Belurus", "Minsk", "asanalieva", 5, 39), 500, 1000);
		System.out.println(costomer1.toString());

		Costomer costomer2 = new Costomer("Alexey", "Koroza", new Address("Belurus", "Minsk", "asanalieva", 10, 38),
				500, 1000);
		System.out.println(costomer2.toString());
	}

}
