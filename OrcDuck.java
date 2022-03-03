class OrcDuck extends Duck {

    public OrcDuck() {
      quackBehavior = new GruntQuack();
    }
  
    public void display () {
      System.out.println("Orc duck displayed");
    }
  }
  