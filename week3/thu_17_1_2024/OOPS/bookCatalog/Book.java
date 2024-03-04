package bookCatalog;

class Book {
    private String title;
    private Author author;
    private boolean isCheckedOut;
    private double overdueFine;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.overdueFine = 0.50; // Default overdue fine per day
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public double getOverdueFine() {
        return overdueFine;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Book '" + title + "' checked out successfully.");
        } else {
            System.out.println("Book '" + title + "' is already checked out.");
        }
    }

    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book '" + title + "' is not checked out.");
        }
    }
}
