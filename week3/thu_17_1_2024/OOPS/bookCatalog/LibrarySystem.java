package bookCatalog;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Jane Doe");
        Author author2 = new Author("John Smith");

        // Create books
        Book book1 = new Book("Introduction to Java", author1);
        Book book2 = new Book("Data Structures and Algorithms", author1);
        Book book3 = new Book("Python for Beginners", author2);

        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Check out and return books
        library.checkOutBook(book1);
        library.checkOutBook(book2);
        library.checkOutBook(book3);

        library.returnBook(book1);
        library.returnBook(book2);

        // Search for books by an author
        List<Book> booksByAuthor1 = library.searchBooksByAuthor(author1);
        System.out.println("\nBooks by " + author1.getName() + ":");
        for (Book book : booksByAuthor1) {
            System.out.println("- " + book.getTitle());
        }
    }
}

