package Booksystem;

class Book {
    private int bookId;
    private String bookName;
    private String ISBN;

    public Book(int bookId, String bookName, String ISBN) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}