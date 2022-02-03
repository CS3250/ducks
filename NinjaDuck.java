class NinjaDuck extends Duck {

    public NinjaDuck() {
      quackBehavior = new MuteQuack();
    }
  
    public void display() {
      System.out.println("Ninja duck displayed");
    }
  }
  