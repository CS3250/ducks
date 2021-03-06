class SpaghettiDuck extends Duck {

    public SpaghettiDuck() {
      quackBehavior = new Quack();
    }

    public void display () {
      System.out.println("Spaghetti is on the duck and displayed");
    }
  }
