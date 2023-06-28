import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //avoir un robot (context)
        Robot r1 = new Robot("Robot Asperateur");
        Robot r2 = new Robot("Robot Cop");
        Robot r3 = new Robot("Robot T1000");

        r1.setBehaviour(new AgressiveBehaviour());
        r1.setBehaviour(new DefensiveBehaviour());
        r1.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();
        r3.move();
        System.out.println("-----Modification de strategies-----");
        r1.setBehaviour(new NormalBehaviour());
        r3.setBehaviour(new AgressiveBehaviour());

        r1.move();
        r2.move();
        r3.move();

        //modifier son comprtement (strategy ou algorithme) au momen de l'excution
        //Avoir des strategies interchangeables..
    }

}

