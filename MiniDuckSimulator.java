class MiniDuckSimulator {

  public static void main(String args[]) {

    System.out.println("===================");
    Duck g = new DonaldDuck();
    g.display();
    g.performQuack();
    g.swim();

    System.out.println("===================");
    Duck g = new Goose();
    g.display();
    g.performQuack();
    g.swim();

    System.out.println("===================");
    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.performQuack();
    rhd.swim();

    System.out.println("===================");
    Duck md = new MallardDuck();
    md.display();
    md.performQuack();
    md.swim();

    System.out.println("===================");
    Duck rd = new RubberDuck();
    rd.display();
    rd.performQuack();
    rd.swim();

    System.out.println("===================");
    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.performQuack();
    cd.swim();

    System.out.println("===================");
    Duck pd = new PoliceDuck();
    pd.display();
    pd.performQuack();
    pd.swim();

    System.out.println("====================");
    Duck mmd = new MyDuck();
    mmd.display();
    mmd.performQuack();
    mmd.swim();
    
    System.out.println("====================");
    Duck ad = new AustralianDuck();
    ad.display();
    ad.performQuack();
    ad.swim();

    System.out.println("====================");
    Duck wsd = new WarpSpeedDuck();
    wsd.display();
    wsd.performQuack();

  }
}