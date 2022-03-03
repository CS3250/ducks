/**
 * PirateDuck Class
 * 
 * @author Frank Ferrer
 * @version 0.1
 */
public class PirateDuck extends Duck {

    public PirateDuck() {
        quackBehavior = new PirateQuack();
    }

    public void display() {
        System.out.println("Pirate Duck is displayed");
    }

}