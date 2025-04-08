package AggregationLibrary;

public class LibraryMain {

	public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("R. K. Narayan");
        Author author2 = new Author("Rabindranath Tagore");

        // Create books
        Book book1 = new Book("The Guide", author1);
        Book book2 = new Book("Gitanjali", author2);

        // Create library and add books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Display all books in the library
        library.displayBooks();
    }
}