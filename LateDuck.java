class LateDuck extends Duck {

    public LateDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Late Duck did not displayed");
    }
  
  }
