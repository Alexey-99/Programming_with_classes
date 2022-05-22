/* Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *    
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 * Найти и вывести:  
 * a) список книг заданного автора;  
 * b) список книг, выпущенных заданным издательством;  
 * c) список книг, выпущенных после заданного года. 
 */

package by.koroza.programming_with_classes.classes.numbernine;

public class Main {

	public static void main(String[] args) {
		Author[] authors = { new Author("Koroza", "Alexey", "M"), new Author("Niskov", "Max", "N") };
		Book book = new Book("War", authors, "Vena", 2021, 500, 5.20, "V");
		System.out.println(book.toString());
	}
}