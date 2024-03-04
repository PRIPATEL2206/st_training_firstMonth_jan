package ddd;

import java.util.ArrayList;
import java.util.List;

// Aggregate Root: Order
class Order {
    private String orderId;
    private Customer customer;
    private List<Book> books = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
