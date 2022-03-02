class RobotDuck extends Duck {

    public RobotDuck() {
      quackBehavior = new Beep();
    }
  
    public void display () {
      System.out.println("Robot duck displayed");
    }
  }
  