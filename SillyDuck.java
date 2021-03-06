class SillyDuck extends Duck {

    public SillyDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Silly duck displayed");
    }
  
  }