class TerminatorDuck extends Duck {

    public TerminatorDuck() {
      quackBehavior = new Terminate();
    }
  
    public void display() {
      System.out.println("Terminator duck is here.");
    }
  }