class DecoyDuck extends Duck {

    public DecoyDuck() {
      quackBehavior = new Squeak();
    }
  
    public void display() {
      System.out.println("Decoy duck displayed");
    }
  
  }
  