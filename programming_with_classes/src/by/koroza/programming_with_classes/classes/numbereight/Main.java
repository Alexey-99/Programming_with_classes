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
		Costomer costomer1 = new Costomer("Alexey", "Koroza", "Mihaylovich",
				new Address("Belurus", "Minsk", "asanalieva", 5, 138), 500, 1000);
		System.out.println(costomer1.toString());
		
		Costomer costomer2 = new Costomer("Alexey", "Koroza", "Mihaylovich",
				new Address("Belurus", "Minsk", "asanalieva", 5, 138), 500, 1000);
		System.out.println(costomer2.toString());
	}

}
