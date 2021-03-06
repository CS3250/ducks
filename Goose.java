class SubmarineDuck extends Duck {

  public Goose() {
    quackBehavior = new Honk();
  }

  public void display() {
    System.out.println("Sub Duck stays hidden under the waves");
  }

}
