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
    Duck nj = new NinjaDuck();
    nj.display();
    nj.performQuack();
    nj.swim();

    System.out.println("\n===================");
    Duck rad = new RageDuck();
    rad.display();
    rad.performQuack();
    rad.swim();
    
     System.out.println("\n===================");
    Duck sld = new SleepyDuck();
    sld.display();
    sld.performQuack();
    sld.swim();

 }
}
