package ddd;

import java.util.ArrayList;
import java.util.List;

// Aggregate Root: Book
class Book {
    private String isbn;
    private String title;
    private List<Author> authors = new ArrayList<>();

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }
}
