package vediogame;

public class mainMethod {

    public static void main(String[] args) {

        Player player = new Player();

        player.moveRight();

        player.moveDown();

        player.moveLeft();

        player.jump();

        System.out.println("run in to Someone");
        System.out.println("Running Power Interface");
        player.hello();
        player.ask();

        System.out.println("About to get Attacked.....");
        System.out.println("Running Power Interface");
        player.throwPunch();
        player.kickLegs();

        System.out.println("losing the fight.....");

        player.shout();
        player.run();

        System.out.println("Enemy caught up to you!!!");
        System.out.println("Running Power Interface");
        player.extraStrength();
        player.wrestle();

        System.out.println("Wining the fight!!!");

        player.fly();




    }
}
