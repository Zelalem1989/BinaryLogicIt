package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookServiceImpl implements BookService{

    ArrayList<Books> arrayList = new ArrayList<Books>();

    @Override
    public void addBook(Scanner scan) {

        System.out.println("Please Enter BOOK ISBN :");
        int ISBN = scan.nextInt();

        // consume the line character left in the buffer reading the int value
        scan.nextLine();

        System.out.println("Please Enter BOOK Name :");
        String bookName = scan.nextLine();

        System.out.println("Please Enter BOOK genre :");
        String bookGenre = scan.nextLine();

        System.out.println("Please Enter BOOK price :");
        double bookPrice = scan.nextDouble();

        Books B = new Books(ISBN, bookName, bookGenre, bookPrice);
        arrayList.add(B);

        System.out.println("Student added successfully!!!");
    }

    @Override
    public void removeBook(Scanner scan) {

        if (arrayList.isEmpty()) {
            System.out.println("No Books in the Stock");
            return;
        } else {
            System.out.println("Enter the ISBN of the Book to remove from stock.");
            int ISBN = scan.nextInt();

            // iterate the arraylist
            // find index.Isbn == isbn
            // remove from arraylist
            // else sout not in arraylist

            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getISBN() == ISBN){
                    arrayList.remove(i);
                    System.out.println("Book removed Successfully ");
                    return;
                }
            }
            System.out.println("Book Is Not In Stock ");
        }
    }

    @Override
    public void ListBooks() {

        // print arraylist
        System.out.println( Arrays.toString(arrayList.toArray()));

    }

    @Override
    public void updateBook(Scanner scan) {

        if (arrayList.isEmpty()) {
            System.out.println("No Books in the Stock");
            return;
        } else {
            System.out.println("Enter the ISBN of the Book to Update.");
            int ISBN = scan.nextInt();

            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getISBN() == ISBN) {

                    System.out.println("Please Enter new BOOK ISBN :");
                    int newISBN = scan.nextInt();

                    // consume the line character left in the buffer reading the int value
                    scan.nextLine();

                    System.out.println("Please Enter new BOOK Name :");
                    String newBookName = scan.nextLine();

                    System.out.println("Please Enter new BOOK genre :");
                    String newBookGenre = scan.nextLine();

                    System.out.println("Please Enter new BOOK price :");
                    double newBookPrice = scan.nextDouble();

                    arrayList.get(i).setISBN(newISBN);
                    arrayList.get(i).setBookName(newBookName);
                    arrayList.get(i).setBookGenre(newBookGenre);
                    arrayList.get(i).setBookPrice(newBookPrice);

                    System.out.println("Book Updated Successfully ");
                    return;
                }
                System.out.println("Book Is Not In Stock(Invalid ISBN) ");
            }
        }
    }
}
