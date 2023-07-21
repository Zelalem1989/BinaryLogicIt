package students;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StudentService svc = new StudentServiceImp();

        int x;

        do {
        System.out.println("________ Welcome to Student Management App_________");
        System.out.println("What would you want to do today?");
        System.out.println("Enter 1 to Add a Student.");
        System.out.println("Enter 2 to Remove a Student.");
        System.out.println("Enter 3 to List all Student.");
        System.out.println("Enter 4 to Update a Student.");
        System.out.println("Enter 5 to Exit the program!");
        x = scanner.nextInt();

        switch (x) {

            case 1:
                svc.addStudent(scanner);
                break;
            case 2:
                 svc.removeStudents(scanner);
                break;
            case 3:
                 svc.readStudent();
                break;
            case 4:
                 svc.updateStudent(scanner);
                break;
            case 5:
                System.out.println("Exiting the Program, Good Bye;");
                break;
            default:
                System.out.println("Invalid Entry, try again!");
                break;

        }

    }while(x != 5);

        scanner.close();
    }
}
