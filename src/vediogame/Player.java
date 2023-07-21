package vediogame;

public class Player implements moves, powers,communication {


    @Override
    public void moveLeft() {
        System.out.println("moving Left!!");
    }

    @Override
    public void moveRight() {

        System.out.println("moving right!!");
    }

    @Override
    public void moveUp() {
        System.out.println("moving up!!");
    }

    @Override
    public void jump() {

        System.out.println("Jumping!!");
    }

    @Override
    public void moveDown() {

        System.out.println("moving Down!!");

    }

    @Override
    public void run() {

        System.out.println("running!!");

    }

    @Override
    public void extraStrength() {
        System.out.println("gaining extra strength.....");
    }

    @Override
    public void wrestle() {
        System.out.println("wrestling");
    }

    @Override
    public void fly() {
        System.out.println("Flying Away!!!!");
    }

    @Override
    public void throwPunch() {

        System.out.println("throwing Punch!!");

    }

    @Override
    public void kickLegs() {

        System.out.println("Kicking!!");
    }

    @Override
    public void shout() {

        System.out.println("ohhhhhhhhhhhh! ");

    }

    @Override
    public void hello() {
        System.out.println("Hello there, how are you doing? ");
    }

    @Override
    public void bye() {

        System.out.println("Alright, have a good one!!! ");

    }

    @Override
    public void ask() {

        System.out.println("what can i help you with?");

    }
}
