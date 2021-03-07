class HockeyDuck extends Duck {

    public HockeyDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Hockey duck hops on the ice");
    }
  
  }