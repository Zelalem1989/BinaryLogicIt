package students;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
            optionMenuMenu();
    }

    public static void optionMenuMenu(){

        Scanner scanner = new Scanner(System.in);
        int x;

        try{
            System.out.println("________ Welcome to Student Management App_________");
            System.out.println("What would you want to do today?");
            System.out.println("Enter 1 to Add a Student.");
            System.out.println("Enter 2 to Remove a Student.");
            System.out.println("Enter 3 to List all Student.");
            System.out.println("Enter 4 to Update a Student.");
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

            StudentService svc = new StudentServiceImp();

            switch (x) {

                case 1:
                    svc.addStudent(scanner);
                    optionMenuMenu();
                    break;
                case 2:
                    svc.removeStudents(scanner);
                    optionMenuMenu();
                    break;
                case 3:
                    svc.readStudent();
                    optionMenuMenu();
                    break;
                case 4:
                    svc.updateStudent(scanner);
                    optionMenuMenu();
                    break;
                default:
                    System.out.println("Invalid Entry, try again!");
                    optionMenuMenu();
                    break;

            }
        } while (x != 5);
    }
}
