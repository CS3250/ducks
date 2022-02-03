/**
 * This is the parent class for all ducks in the simulator.
 *
 * @author Steve Geinitz
 * @version 0.1
 * @since 2022-01-26
 */
public abstract class Duck {

  QuackBehavior quackBehavior;

  public abstract void display();

  public void swim() {
    System.out.println("Duck swimming (since all ducks float)");
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
}
