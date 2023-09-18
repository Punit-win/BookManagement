package Booksystem;

import java.util.ArrayList;
import java.util.List;

class BookStore {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null; // Book not found
    }

    public void updateBook(int bookId, String newBookName, String newISBN) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setBookName(newBookName);
                book.setISBN(newISBN);
                return;
            }
        }
        System.out.println("Book not found for updating.");
    }

    public void deleteBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                return;
            }
        }
        System.out.println("Book not found for deletion.");
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId() + ", Book Name: " + book.getBookName() + ", ISBN: " + book.getISBN());
        }
    }
}