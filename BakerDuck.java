class BakerDuck extends Duck {

    public BakerDuck() {
      quackBehavior = new Quack();
    }

    public void display() {
      System.out.println("Baker duck displayed");
    }
  }
  