class RageDuck extends Duck {

    public RageDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Rage duck displayed");
    }
  }