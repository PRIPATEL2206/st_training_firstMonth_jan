package librarySystem;

import java.util.Date;

class Book {
    private String title;
    private Author author;
    private boolean borrowed;
    private Date dueDate;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow(Member member) {
        borrowed = true;
        dueDate = calculateDueDate();
        member.addBorrowedBook(this);
    }

    public void returnBook() {
        borrowed = false;
        dueDate = null;
    }

    private Date calculateDueDate() {
        // Simplified logic: Set due date to 14 days from now
        long currentTimeMillis = System.currentTimeMillis();
        return new Date(currentTimeMillis + 14 * 24 * 60 * 60 * 1000);
    }
}
