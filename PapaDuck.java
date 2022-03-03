class PapaDuck extends Duck {

    public PapaDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Papa duck displayed");
    }
  }
  