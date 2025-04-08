package collections.sets;

public class Book {
	String title;
	String author;
	double price;
	int pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthror() {
		return author;
	}

	public void setAuthror(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(String title, String author, double price, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages + "]";
	}

	
}