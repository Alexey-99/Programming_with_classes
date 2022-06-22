package by.koroza.programming_with_classes.classes.numbernine;

public class Book {
	private static int count = 1;
	private static final String NEXT_LINE = "\n";
	private static final String ID = "ID: ";
	private static final String NAME = "Name: ";
	private static final String AUTHORS = "Authors: ";
	private static final String DO_NOT_HAVE_AUTHORS = "Don't have authors";
	private static final String PUBLISHING_HOUSE = "Publishing house: ";
	private static final String YEAR_PUBLISHING = "Year publishing: ";
	private static final String PAGE_COUNT = "Page count: ";
	private static final String COST = "Cost: ";
	private static final String BUILDING_TYPE = "Binding type: ";

	private int id;
	private String name;
	private Author[] authors;
	private String publishingHouse;
	private int yearPublishing;
	private int pageCount;
	private double cost;
	private String bindingType;

	public Book(String name, Author author, String publishingHouse, int yearPublishing, int pageCount, double cost,
			String bindingType) {
		this.id = count++;
		this.name = name;
		this.authors = new Author[0];
		this.authors[0] = author;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.pageCount = pageCount;
		this.cost = cost;
		this.bindingType = bindingType;
	}

	public Book(String name, Author[] authors, String publishingHouse, int yearPublishing, int pageCount, double cost,
			String bindingType) {
		this.id = count++;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.pageCount = pageCount;
		this.cost = cost;
		this.bindingType = bindingType;
	}

	public Book(String name, String publishingHouse, int yearPublishing, int pageCount, double cost,
			String bindingType) {
		this.id = count++;
		this.name = name;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.pageCount = pageCount;
		this.cost = cost;
		this.bindingType = bindingType;
		this.authors = new Author[0];
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

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public void addAuthor(Author author) {
		Author[] authorsNew = new Author[this.authors.length + 1];
		for (int i = 0; i < authorsNew.length; i++) {
			if (i < this.authors.length) {
				authorsNew[i] = this.authors[i];
			} else if (i == this.authors.length) {
				authorsNew[i] = author;
			}
		}
		this.authors = authorsNew;
	}

	public void addAuthors(Author[] authors) {
		Author[] authorsNew = new Author[this.authors.length + authors.length];
		for (int i = 0; i < authorsNew.length; i++) {
			if (i < this.authors.length) {
				authorsNew[i] = this.authors[i];
			} else if (i >= this.authors.length) {
				authorsNew[i] = authors[i - this.authors.length];
			}
		}
		this.authors = authorsNew;
	}

	private void printAuthors(StringBuilder builder) {
		int count = 0;
		for (Author author : authors) {
			builder.append(author.toString());
			count++;
			if (count < authors.length) {
				builder.append(", ");
			}
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
		result = result * prime + Double.hashCode(cost);
		result = result * prime + (bindingType != null ? bindingType.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (ID != null ? ID.hashCode() : 1);
		result = result * prime + (NAME != null ? NAME.hashCode() : 1);
		result = result * prime + (AUTHORS != null ? AUTHORS.hashCode() : 1);
		result = result * prime + (DO_NOT_HAVE_AUTHORS != null ? DO_NOT_HAVE_AUTHORS.hashCode() : 1);
		result = result * prime + (PUBLISHING_HOUSE != null ? PUBLISHING_HOUSE.hashCode() : 1);
		result = result * prime + (YEAR_PUBLISHING != null ? YEAR_PUBLISHING.hashCode() : 1);
		result = result * prime + (PAGE_COUNT != null ? PAGE_COUNT.hashCode() : 1);
		result = result * prime + (COST != null ? COST.hashCode() : 1);
		result = result * prime + (BUILDING_TYPE != null ? BUILDING_TYPE.hashCode() : 1);
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
		if (cost != book.cost) {
			return false;
		}
		if (bindingType == null) {
			if (book.bindingType != null) {
				return false;
			}
		} else if (!bindingType.equals(book.bindingType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ID).append(id).append(NEXT_LINE);
		builder.append(NAME).append(name).append(NEXT_LINE);
		builder.append(AUTHORS);
		if (authors.length > 0) {
			printAuthors(builder);
			builder.append(NEXT_LINE);
		} else {
			builder.append(DO_NOT_HAVE_AUTHORS);
		}
		builder.append(PUBLISHING_HOUSE).append(publishingHouse).append(NEXT_LINE);
		builder.append(YEAR_PUBLISHING).append(yearPublishing).append(NEXT_LINE);
		builder.append(PAGE_COUNT).append(pageCount).append(NEXT_LINE);
		builder.append(COST).append(cost).append(NEXT_LINE);
		builder.append(BUILDING_TYPE).append(bindingType).append(NEXT_LINE);
		return builder.toString();
	}
}