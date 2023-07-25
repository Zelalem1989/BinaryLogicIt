package books;

import students.StudentService;
import students.StudentServiceImp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMethod {


    public static void main(String[] args) {
        optionMenuMenu();

    }
    public static void optionMenuMenu() {

        Scanner scanner = new Scanner(System.in);
        int x;

            try{
                System.out.println("What would you want to do today?");
                System.out.println("Enter 1 to Add a Book.");
                System.out.println("Enter 2 to Remove a Book.");
                System.out.println("Enter 3 to List all Book.");
                System.out.println("Enter 4 to Update a Book.");
                System.out.println("Enter 5 to Exit the program!");
                x = scanner.nextInt();

                if(x == 5 ) {
                    System.out.println("Exiting the Program, Good Bye;");
                    // successful termination
                    System.exit(0);
                }else{
                    programMenu(scanner, x);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: please Enter an Integer! "); // print null+ e.getMessage());
                scanner.close();
            }
        }

    public static void programMenu(Scanner scanner, int x){

        do {

            BookService bsv = new BookServiceImpl();

            switch (x) {
                case 1:
                    bsv.addBook(scanner);
                    optionMenuMenu();
                    break;
                case 2:
                    bsv.removeBook(scanner);
                    optionMenuMenu();
                    break;
                case 3:
                    bsv.ListBooks();
                    optionMenuMenu();
                    break;
                case 4:
                    bsv.updateBook(scanner);
                    optionMenuMenu();
                    break;
                default:
                    System.out.println("Invalid Entry, try again!");
                    break;

            }

        } while (x != 5);
    }

}
