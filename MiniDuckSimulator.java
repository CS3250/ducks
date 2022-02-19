class MiniDuckSimulator {

  public static void main(String args[]) {

    System.out.println("\n===================");
    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.performQuack();
    rhd.swim();

    System.out.println("\n===================");
    Duck md = new MallardDuck();
    md.display();
    md.performQuack();
    md.swim();

    System.out.println("\n===================");
    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.performQuack();
    cd.swim();

    System.out.println("\n===================");
    Duck rd = new RubberDuck();
    rd.display();
    rd.performQuack();
    rd.swim();

    System.out.println("\n===================");
    Duck nd = new NinjaDuck();
    nd.display();
    nd.performQuack();
    nd.swim();

    System.out.println("\n===================");
    Duck ld = new RageDuck();
    ld.display();
    ld.performQuack();
    ld.swim();

    System.out.println("\n===================");
    Duck dwd = new DarkwingDuck();
    dwd.display();
    dwd.performQuack();
    dwd.swim();

  }
}
