package ddd;

import java.util.List;

// Main Application
public class BookstoreApplication {
    public static void main(String[] args) {
        // Create sample data
        Author author1 = new Author("John Doe");
        Book book1 = new Book("123456789", "Domain-Driven Design");
        book1.addAuthor(author1);

        Author author2 = new Author("Jane Smith");
        Book book2 = new Book("987654321", "Clean Code");
        book2.addAuthor(author2);

        Customer customer = new Customer("C123", "Alice");

        // Use the application service to create an order
        BookstoreService bookstoreService = new BookstoreService();
        Order order = bookstoreService.createOrder("O001", customer, List.of(book1, book2));

        // Display order details
        bookstoreService.displayOrderDetails(order);
    }
}
