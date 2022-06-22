package by.koroza.programming_with_classes.classes.numbernine;

public class BookAggregating {
	private Book[] books;
	private static final String NEXT_LINE = "\n";

	public BookAggregating() {
		this.books = new Book[0];
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
		Book[] booksNew = new Book[this.books.length + 1];
		for (int i = 0; i < booksNew.length; i++) {
			if (i < this.books.length) {
				booksNew[i] = this.books[i];
			} else if (i == this.books.length) {
				booksNew[i] = book;
			}
		}
		this.books = booksNew;
	}

	public void addBooks(Book[] books) {
		Book[] booksNew = new Book[this.books.length + books.length];
		for (int i = 0; i < booksNew.length; i++) {
			if (i < this.books.length) {
				booksNew[i] = this.books[i];
			} else if (i >= this.books.length) {
				booksNew[i] = books[i - this.books.length];
			}
			this.books = booksNew;
		}
	}

	public void printBooksBySelectedLastNameAuthor(String lastNameAuthor) {
		for (Book book : books) {
			Author[] authors = book.getAuthors();
			for (Author author : authors) {
				if (author.getLastName().equals(lastNameAuthor)) {
					System.out.println(book.toString());
				}
			}
		}
	}

	public void printBooksBySelectedFirstNameAuthor(String firstNameAuthor) {
		for (Book book : books) {
			Author[] authors = book.getAuthors();
			for (Author author : authors) {
				if (author.getFirstName().equals(firstNameAuthor)) {
					System.out.println(book.toString());
				}
			}
		}
	}

	public void printBooksBySelectedPatronymicAuthor(String patronymic) {
		for (Book book : books) {
			Author[] authors = book.getAuthors();
			for (Author author : authors) {
				if (author.getPatronymic().equals(patronymic)) {
					System.out.println(book.toString());
				}
			}
		}
	}

	public void printBooksBySelectedAuthor(Author selectedAuthor) {
		for (Book book : books) {
			Author[] authors = book.getAuthors();
			for (Author author : authors) {
				if (author.equals(selectedAuthor)) {
					System.out.println(book.toString());
				}
			}
		}
	}

	public void printBooksBySelectedPublishingHouse(String publishingHouse) {
		for (Book book : books) {
			if (book.getPublishingHouse().equals(publishingHouse)) {
				System.out.println(book.toString());
			}
		}
	}

	public void printBooksAfterSelectedYearPublishing(int yearPublishing) {
		for (Book book : books) {
			if (book.getYearPublishing() > yearPublishing) {
				System.out.println(book.toString());
			}
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (books != null ? books.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
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
		for (Book book : books) {
			builder.append(book.toString()).append(NEXT_LINE);
		}
		return builder.toString();
	}
}