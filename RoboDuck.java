public class RoboDuck extends Duck {

    public RoboDuck() {
        quackBehavior = new RoboQuack();
    }

    public void display() {
        System.out.println("Robot duck displayed");
    }
}
