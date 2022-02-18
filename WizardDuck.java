class NinjaDuck extends Duck {

    public NinjaDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Wizard duck displayed");
    }
  }