class WarpSpeedDuck extends Duck {

  public WarpSpeedDuck() {
    quackBehavior = new EngageQuack();
  }

  public void display() {
      System.out.println("Warp speed duck displayed");
      // from https://textart.io/art/tag/duck/1
      System.out.println("--------------                          ");
      System.out.println("------------     __(.)< __(.)> __(.)=   ");
      System.out.println("----------       \\___)  \\___)  \\___) ");
  }

}