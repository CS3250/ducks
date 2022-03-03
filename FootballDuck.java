class FootballDuck extends Duck {

    public FootballDuck() {
      quackBehavior = new HutQuack();
    }
  
    public void display() {
      System.out.println("Football duck displayed");
    }
  }
  