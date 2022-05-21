package by.koroza.programming_with_classes.classes.numbernine;

public class Book {
	private static int count = 1;

	private int id;
	private String name;
	private String author;

	public Book() {
		this.id = count++;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (author != null ? author.hashCode() : 1);
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
		if (author == null) {
			if (book.author != null) {
				return false;
			}
		} else if (!author.equals(book.author)) {
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