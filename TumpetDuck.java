class TrumpetDuck extends Duck {

    public TrumpetDuck() {
      quackBehavior = new Trumpet();
    }
  
    public void display () {
      System.out.println("Redhead duck displayed");
    }
  }
