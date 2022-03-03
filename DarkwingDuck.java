class DarkwingDuck extends Duck {

    public DarkwingDuck() {
      quackBehavior = new HeroQuack();
    }
  
    public void display() {
      System.out.println("Darkwing duck displayed");
    }
  }
  