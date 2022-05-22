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
		Author[] authors1 = { new Author("A", "B", "C"), new Author("Niskov", "Max", "N") };
		Author[] authors2 = { new Author("Z", "X", "C"), new Author("Niskov", "Max", "N") };
		Book book = new Book("War", authors1, "Vena", 2021, 500, 5.20, "V");
		System.out.println(book.toString());

		Book[] books = { new Book("War", authors1, "H", 2020, 500, 5.20, "V"),
				new Book("A", authors2, "Vena", 2022, 500, 5.20, "V") };

		BookAggregating aggregating = new BookAggregating(books);
		aggregating.printBooksAfterSelectedYearPublishing(2021);
		aggregating.printBooksBySelectedAuthor(new Author("A", "B", "C"));
		aggregating.printBooksBySelectedFirstNameAuthor("X");
		aggregating.printBooksBySelectedLastNameAuthor("Z");
		aggregating.printBooksBySelectedPatronymicAuthor("C");
		aggregating.printBooksBySelectedPublishingHouse("Vena");
	}
}