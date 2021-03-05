/**
 *
 */


class HappyDuck extends Duck {

    public HappyDuck() {
        Quack quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Quack, Quack, Happy Quack");
    }

}
