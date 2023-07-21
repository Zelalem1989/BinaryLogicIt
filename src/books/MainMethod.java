package books;

import java.util.Scanner;

public class MainMethod {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookService bsv = new BookServiceImpl();

        int x;

        do {
            System.out.println("What would you want to do today?");
            System.out.println("Enter 1 to Add a Book.");
            System.out.println("Enter 2 to Remove a Book.");
            System.out.println("Enter 3 to List all Book.");
            System.out.println("Enter 4 to Update a Book.");
            System.out.println("Enter 5 to Exit the program!");
            x = scanner.nextInt();

            switch (x) {

                case 1:
                    bsv.addBook(scanner);
                    break;
                case 2:
                    bsv.removeBook(scanner);
                    break;
                case 3:
                    bsv.ListBooks();
                    break;
                case 4:
                    bsv.updateBook(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the Program, Good Bye;");
                    break;
                default:
                    System.out.println("Invalid Entry, try again!");
                    break;

            }

        } while (x != 5);

        scanner.close();
    }
}
