package FinalKeyWord;

public class CirleDemo extends Circle{

    @Override
    void print(String name){
       final String message = "  Bye bye!! ";

       System.out.println(message + name);
    }
}
