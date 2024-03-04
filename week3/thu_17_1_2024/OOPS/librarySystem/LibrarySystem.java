package librarySystem;


public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Author author = new Author("John Doe");
        Book book1 = new Book("Book One", author);
        Book book2 = new Book("Book Two", author);

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        library.returnBook(member1, book1);
        library.returnBook(member2, book2);
    }
}

