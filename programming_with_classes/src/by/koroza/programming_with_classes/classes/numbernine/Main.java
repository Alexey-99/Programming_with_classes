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
	private final static String LIST_BOOKS_BY_GIVEN_AUTHOR = "List of books by a given author: ";
	private final static String LIST_BOOKS_RELEASED_AFTER_GIVEN_YEAR = "List of books released after a given year: ";
	private final static String LIST_BOOKS_PUBLISHED_BY_GIVEN_PUBLISHER = "List of books published by a given publisher: ";

	public static void main(String[] args) {
		Author[] authors1 = { new Author("A", "B", "C"), new Author("Niskov", "Max", "N") };
		Author authors2 = new Author("Z", "X", "C");

		Book[] books = { new Book("War", authors1, "H", 2020, 500, 5.20, "V"),
				new Book("A", authors2, "Vena", 2022, 500, 5.20, "V") };

		Book[] books1 = { new Book("War", authors2, "H", 2020, 500, 5.20, "V") };

		BookAggregating aggregating = new BookAggregating(books);

		System.out.println(LIST_BOOKS_RELEASED_AFTER_GIVEN_YEAR);
		aggregating.printBooksAfterSelectedYearPublishing(2021);
		System.out.println(LIST_BOOKS_BY_GIVEN_AUTHOR);
		aggregating.printBooksBySelectedAuthor(new Author("A", "B", "C"));
		aggregating.printBooksBySelectedFirstNameAuthor("X");
		aggregating.printBooksBySelectedLastNameAuthor("Z");
		aggregating.printBooksBySelectedPatronymicAuthor("C");
		System.out.println(LIST_BOOKS_PUBLISHED_BY_GIVEN_PUBLISHER);
		aggregating.printBooksBySelectedPublishingHouse("Vena");
	}
}