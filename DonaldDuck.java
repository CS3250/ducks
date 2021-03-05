/**
 *
 */


class DonaldDuck extends Duck {

    /**
     * Constructor
     */
    public DonaldDuck() {
        Quack quackBehavior = new Quack();
    }

    /**
     * Display the duck
     */
    public void display() {
        System.out.println("Qwack Wack Wack Wack");
    }

}
