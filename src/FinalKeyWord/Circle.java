package FinalKeyWord;

public class Circle {

    final double PI = 3.14;
//   final double PI;

//    public Circle(double value) {
//        PI = value;
//    }

    public static void main(String[] args) {
        //print("Zelalem");

        Circle c = new Circle();

        c.print("Zelalem");

        CirleDemo cd = new CirleDemo();

        cd.print("Zelalem");
    }

    void print(String name){
        // the use of final nobody can change the welcome message now
        final String message = " Hello, Welcome to the java world! ";

        System.out.println( message + name);
    }

    final String[] names = {"a","b","g"};

    //names[0] = "t";

    final String[] newNeam = {"a","d","b", "c"};

   // names = newNeam;


}
