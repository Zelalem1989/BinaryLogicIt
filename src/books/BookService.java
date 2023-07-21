package books;

import java.util.Scanner;

public interface BookService {

    void addBook(Scanner scan);
    void removeBook(Scanner scan);
    void ListBooks();
    void updateBook(Scanner scan);
}
