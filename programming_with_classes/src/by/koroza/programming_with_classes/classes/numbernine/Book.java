package by.koroza.programming_with_classes.classes.numbernine;

public class Book {
	private static int count = 1;

	private int id;
	private String name;
	private Author[] authors;
	private String publishingHouse;
	private int yearPublishing;
	private int pageCount;
	private double cost;

	public Book(String name, Author author) {
		this.id = count++;
		this.name = name;
		this.authors[0] = author;
	}

	public Book(String name, Author[] authors) {
		this.id = count++;
		this.name = name;
		this.authors = authors;
	}

	public Book(String name) {
		this.id = count++;
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void addAuthor(Author author) {
		Author[] authorsNew = null;
		if (this.authors == null) {
			authorsNew = new Author[1];
			authorsNew[0] = author;
		} else {
			authorsNew = new Author[this.authors.length + 1];
			for (int i = 0; i < authorsNew.length; i++) {
				if (i < this.authors.length) {
					authorsNew[i] = this.authors[i];
				} else if (i == this.authors.length) {
					authorsNew[i] = author;
				}
			}
		}
		this.authors = authorsNew;
	}

	public void addAuthors(Author[] authors) { // TODO CHECK
		Author[] authorsNew = null;
		if (this.authors == null) {
			this.authors = authors;
		} else {
			authorsNew = new Author[this.authors.length + authors.length];
			for (int i = 0; i < authorsNew.length; i++) {
				if (i < this.authors.length) {
					authorsNew[i] = this.authors[i];
				} else if (i >= this.authors.length) {
					authorsNew[i] = authors[i - this.authors.length];
				}
			}
			this.authors = authorsNew;
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (authors != null ? authors.hashCode() : 1);
		result = result * prime + (publishingHouse != null ? publishingHouse.hashCode() : 1);
		result = result * prime + yearPublishing;
		result = result * prime + pageCount;
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
		Book book = (Book) object;
		if (id != book.id) {
			return false;
		}
		if (name == null) {
			if (book.name != null) {
				return false;
			}
		} else if (!name.equals(book.name)) {
			return false;
		}
		if (authors == null) {
			if (book.authors != null) {
				return false;
			}
		} else if (!authors.equals(book.authors)) {
			return false;
		}
		if (publishingHouse == null) {
			if (book.publishingHouse != null) {
				return false;
			}
		} else if (!publishingHouse.equals(book.publishingHouse)) {
			return false;
		}
		if (yearPublishing != book.yearPublishing) {
			return false;
		}
		if (pageCount != book.pageCount) {
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