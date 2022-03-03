class GroovyDuck extends Duck {

  public GroovyDuck(){
    quackBehavior = new Groovy();
  }

  public void display(){
    System.out.println("Groovy duck displayed");
  }
}