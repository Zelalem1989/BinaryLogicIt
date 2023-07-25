package students;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentServiceImp implements StudentService {

    public static final int MAX_STUDENTS = 20;

    public static Student[] studentList = new Student[MAX_STUDENTS];

    public static int numStudent = 0;

    @Override
    public void addStudent(Scanner scan) {
        // ArrayList arrayList = new ArrayList<>();
        if (numStudent >= MAX_STUDENTS) {
            System.out.println("Sorry, class is full");
            return;
        } else
        try {
            System.out.println("Please Enter Student ID :");
            int studentId = scan.nextInt();

            System.out.println("Please Enter Student Name :");
            String name = scan.nextLine();

            // consume the line character left in the buffer reading the int value
            scan.nextLine();

            System.out.println("Please Enter Student Email :");
            String email = scan.nextLine();

            System.out.println("Please Enter Student Grade :");
            double grade = scan.nextDouble();

            Student student = new Student(studentId, name, email, grade);

            // incriminate for the second student(index)
            studentList[numStudent++] = student;

            System.out.println("Student added successfully!!!");
        }catch (Exception e){
            // returning null ??
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void removeStudents(Scanner scan) {
        // my approch
//        traverse the array
//           find the index
//              remove it

        // class approch
        if (numStudent == 0) {
            System.out.println("No Student in the array");
            return;
        }
        System.out.println("Enter the index of the Student to remove (0 to " + (numStudent -1) + ")");
        int index = scan.nextInt();

        if(index >=0 && index < numStudent){
            for (int i = index; i < numStudent; i++) {
                studentList[i] = studentList[i+1];
            }
            studentList[numStudent - 1] = null;
            numStudent--;
            System.out.println("Student Removed successful!!");
        }else
            System.out.println("Invalid Index, No Student found");
    }

    @Override
    public void readStudent() {

        if (numStudent == 0) {
            System.out.println("no Student in the array");
            return;
        }
        for (int i = 0; i < numStudent; i++) {
            System.out.println("-------- List of students----------");
            System.out.println(studentList[i+1] + ". ");
            System.out.println(studentList[i]);
            System.out.println("------------------------------------");
        }


    }

    @Override
    public void updateStudent(Scanner scan) {
        if (numStudent == 0) {
            System.out.println("no Student in the array");
            return;
        }
        System.out.println("Enter the index of the Student to Update (0 to " + (numStudent -1) + ")");
        int index = scan.nextInt();

        if(index >=0 && index < numStudent){
            System.out.println("Enter New StudentId?");
            int newStudentId = scan.nextInt();

            System.out.println("Please Enter Student New Name ");
            String NewName = scan.nextLine();

            // consume the line character left in the buffer reading the int value
            scan.nextLine();

            System.out.println("Please Enter Student New Name ");
            String NewEmail = scan.nextLine();

            System.out.println("Please Enter Student New Grade ");
            double NewGrade = scan.nextDouble();

            Student updatedStudent = new Student(newStudentId, NewName, NewEmail, NewGrade);

            studentList[index] = updatedStudent;

            System.out.println("student updated successfully!!");

        }
        else{
            System.out.println("Invalid index, no Student!!!");
        }

    }
}
