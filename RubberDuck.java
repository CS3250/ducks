/**
 * RubberDuck class for toy/inanimate ducks.
 *
 * @author Steve Geinitz
 * @version 0.1
 * @since 2022-01-26
 */
class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
  }

  public void display() {
    System.out.println("Rubber duck displayed");
  }

}
