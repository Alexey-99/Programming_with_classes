package by.koroza.programming_with_classes.classes.numbernine;

public class BookAggregating {
	private Book[] books;

	public BookAggregating() {

	}

	public BookAggregating(Book[] books) {
		this.books = books;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (books != null ? books.hashCode() : 1);
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
		BookAggregating aggregating = (BookAggregating) object;
		if (books == null) {
			if (aggregating.books != null) {
				return false;
			}
		} else if (!books.equals(aggregating.books)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
}