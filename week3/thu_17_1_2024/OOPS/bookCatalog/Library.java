package bookCatalog;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void checkOutBook(Book book) {
        if (books.contains(book)) {
            book.checkOut();
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.");
        }
    }

    public void returnBook(Book book) {
        if (books.contains(book)) {
            book.returnBook();
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.");
        }
    }

    public List<Book> searchBooksByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
}
