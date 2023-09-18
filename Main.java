package Booksystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a Book");
            System.out.println("2. Get Book Details");
            System.out.println("3. Edit Book Details");
            System.out.println("4. Delete a Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.next();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.next();
                    Book newBook = new Book(bookId, bookName, ISBN);
                    bookStore.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    Book book = bookStore.getBookById(bookId);
                    if (book != null) {
                        System.out.println("Book ID: " + book.getBookId() + ", Book Name: " + book.getBookName() + ", ISBN: " + book.getISBN());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    System.out.print("Enter New Book Name: ");
                    String newBookName = scanner.next();
                    System.out.print("Enter New ISBN: ");
                    String newISBN = scanner.next();
                    bookStore.updateBook(bookId, newBookName, newISBN);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    bookStore.deleteBook(bookId);
                    break;
                case 5:
                    bookStore.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }
}
