class BlackDuck extends Duck {

    public BlackDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Black  duck displayed");
    }
  
  }
