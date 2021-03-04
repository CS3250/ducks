class invisibleDuck extends Duck {

    public invisibleDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Invisible duck not displayed");
    }
  
  }