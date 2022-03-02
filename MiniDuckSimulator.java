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
    Duck td = new TrumpetDuck();
    td.display();
    td.performQuack();
    td.swim();

    Duck rad = new RageDuck();
    rad.display();
    rad.performQuack();
    rad.swim();

    System.out.println("\n===================");
    Duck rod = new RobotDuck();
    rod.display();
    rod.performQuack();
    rod.swim();

    Duck crd = new CrystalDuck();
    crd.display();
    crd.performQuack();
    crd.swim();

    System.out.println("\n===================");
    Duck ad = new AstronautDuck();
    ad.display();
    ad.performQuack();
    ad.swim();

  }
}
