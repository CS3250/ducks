public class BabyDuck extends Duck {
    
  public BabyDuck() {
    quackBehavior = new Squeak();
  }

  public void display() {
    System.out.println("Baby duck displayed");
}
