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

	public static void main(String[] args) {
		Costomer[] costomers = {
				new Costomer("Djumayev", "Alexander", "Aleksandrovich",
						new Address("Austria", "Vienna", "Asanalieva", 5, 39), 500, 641611),
				new Costomer("Kuznetsova", "Alexandra", new Address("Azerbaijan", "Baku", "Asanalieva", 5, 39), 450,
						616687),
				new Costomer("Chistovich", "Daniel", "Valeryevich",
						new Address("Bahrain", "Manama", "Asanalieva", 5, 39), 600, 115156),
				new Costomer("Tatishev", "Svyatoslav", "Victorovich",
						new Address("The Bahamas", "Nassau", "Asanalieva", 10, 38), 300, 361631) };

		CostomerAggregating costomerAggregating1 = new CostomerAggregating(costomers);
		CostomerAggregating costomerAggregating2 = new CostomerAggregating();

		costomerAggregating1.addCostomer(
				new Costomer("Hasymov", "Elias", new Address("Canada", "Ottawa", "Asanalieva", 5, 39), 550, 646468));
		costomerAggregating1.addCostomer(new Costomer("Podyomny", "German", "Anatolyevich",
				new Address("China", "Beijing", "Asanalieva", 5, 39), 100, 651616));
		costomerAggregating2.addCostomer(
				new Costomer("Hasymov", "Elias", new Address("Canada", "Ottawa", "Asanalieva", 5, 39), 550, 646468));
		costomerAggregating2.addCostomers(costomers);

		System.out.println("Print costomers sorting by alphabetical order: ");
		costomerAggregating1.printCostomersByAlphabeticalOrder();
		System.out.println();
		System.out.println("Print credit card number in diapason: ");
		costomerAggregating1.printCreditCardNumberInDiapason(500, 600);
	}
}