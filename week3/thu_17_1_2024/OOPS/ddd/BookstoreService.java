package ddd;

import java.util.List;

// Application Service: BookstoreService
class BookstoreService {
    public Order createOrder(String orderId, Customer customer, List<Book> books) {
        Order order = new Order(orderId, customer);
        order.getBooks().addAll(books);
        return order;
    }

    public void displayOrderDetails(Order order) {
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Books:");

        for (Book book : order.getBooks()) {
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthors().get(0).getName());
        }
    }
}
