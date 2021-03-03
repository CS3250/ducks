class QuantumDuck extends Duck {

    public QuantumDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Quantum duck displayed");
    }
  
  }