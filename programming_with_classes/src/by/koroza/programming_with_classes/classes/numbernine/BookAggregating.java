package by.koroza.programming_with_classes.classes.numbernine;

public class BookAggregating {
	private Book[] books;

	public BookAggregating() {

	}

	public void addBook(Book book) {
		Book[] booksNew = null;
		if (this.books == null) {
			booksNew = new Book[1];
			booksNew[0] = book;
		} else {
			booksNew = new Book[this.books.length + 1];
			for (int i = 0; i < booksNew.length; i++) {
				if (i < this.books.length) {
					booksNew[i] = this.books[i];
				} else if (i == this.books.length) {
					booksNew[i] = book;
				}
			}
		}
		this.books = booksNew;
	}

	public void addBooks(Book[] books) { // TODO CHECK
		Book[] booksNew = null;
		if (this.books == null) {
			this.books = books;
		} else {
			booksNew = new Book[this.books.length + books.length];
			for (int i = 0; i < booksNew.length; i++) {
				if (i < this.books.length) {
					booksNew[i] = this.books[i];
				} else if (i >= this.books.length) {
					booksNew[i] = books[i - this.books.length];
				}
			}
			this.books = booksNew;
		}
	}
}