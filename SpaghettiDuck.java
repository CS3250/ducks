class SpaghettiDuck extends Duck {

  public SpaghettiDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Confused duck with spaghetti on its head is displayed.");
  }

}
