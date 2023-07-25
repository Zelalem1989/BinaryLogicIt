package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    /*** print a stack trace to know what is wrong with the program ***/
    /** 2 type of Exception checked( java force you to run EXCEPTION) and unchecked (are not required to run EXCEPTION)**/
    /*** Exception on class and subclass except RUNTIME-EXCEPTION are unchecked ***/
    /*** 5 key word in EXCEPTION 1 try 2 catch 3 finally 4 throw 5 throws ***/

    // Interview Question
    /*** when do finally do not run ***/

    //Driver.java
    // javac Driver.java
    //Driver.class

    /*** Stack oveflow Error ***/
    public int getNum(int num){
        return getNum(num);
    }

    public static void main(String[] args){// throws ArithmeticException {//throws FileNotFoundException  {

        //Java I/O Stream
        //Multithreading
        //collections
        //Java 8

        // the most specific Exception handler should be at top
        // Exception e at last
        // Interview question

        // child and parent class should have the same exceptions
        // parent throw ArithmeticException and child throw EXCEPTION this is wrong

        // System.out(static member).println(Method)

        /*** what is exception and exception handling ***/
        Driver exception = new Driver();
        exception.getNum(5);

        //Scanner scanner = new Scanner(System.in);

//        String fileName = "java.text";
//
//        try {
//           readFile(fileName);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        /***Method that run exception to check age ***/
//        try {
//            checkIn(5);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /*** Multiple catch statement ***/

//        int[] numbs ={1, 2, 3, 4, 5};
//        performOperation(numbs, 16, 0);

        /*** exception from another method ***/

//        try {
//            divide(10, 0);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        /*** running a try with finally is possible but not alone ***/

//        try{
//            System.out.println("Hello ");
//
//        }finally {
//
//            System.out.println("World");
//
//        }


        /*** Input Exception ***/
//        System.out.println("please enter integer number to divide?");
//        try {
//            int c = scanner.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println("Wrong Input! please input an Integer?" ); // + e.getMessage()
//            e.printStackTrace();
//        }


       /*** Array Exception ***/
//       int[] arr = {1,2,3,4,5};
//
//       try {
//           System.out.println(arr[6]);
//       }catch (ArrayIndexOutOfBoundsException e){
//           System.out.println("Error: " + e.getMessage());
//           e.printStackTrace();
//       }

        /***  data type dividing by 0 exception ***/

//        try{
//            int result = c / d;
//            System.out.println("The ansewer is: " + result);
//        }catch(Exception e){
//
//            System.out.println(e.getMessage());
//        }finally{
//            System.out.println("No matter you got(An Error or An Answer )... Have a Great Day!");
//        }

//       int a = 15;
//       int b = 3;
//
//       try{
//           int result = a / b; // Exception : an object the interrupt normal follows of the program.
//           System.out.println(result);
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       } finally {
//           System.out.println("No Matter what happen, I will run.");
//       }
//        System.out.println("Greetings, Have a great day!!! ");

//        scanner.close();
    }



    public static void performOperation(int[] numbers, int a, int b){

        try{
            int result = a / b;
            int value = numbers[6];
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }

    // throws declare to users to be mindfully of the Exceptions
    public static void divide(int num1, int num2) throws ArithmeticException{

        if(num2 == 0){
           // Exception e = new ArithmeticException("Invalid");
            throw new ArithmeticException(" cannot divide by zero");
        }
        int result = num1 / num2;
    }

    public static void readFile(String fileName) throws FileNotFoundException{

        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

    }

    public static void checkIn(int age) { //throws Exception {
        if(age < 18){
            //throw new Exception("Age must be 18 and above! ");
            throw new RuntimeException("Age must be 18 and above! ");

        }
        System.out.println("you are Registered! ");
    }

}
