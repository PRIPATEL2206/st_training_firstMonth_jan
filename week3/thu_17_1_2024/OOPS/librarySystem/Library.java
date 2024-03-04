package librarySystem;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        if (books.contains(book) && members.contains(member) && !book.isBorrowed()) {
            book.borrow(member);
            member.addBorrowedBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Borrowing failed. Please check book availability and member status.");
        }
    }

    public void returnBook(Member member, Book book) {
        if (members.contains(member) && book.isBorrowed() && member.hasBorrowedBook(book)) {
            book.returnBook();
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Returning failed. Please check member status and book ownership.");
        }
    }
}
