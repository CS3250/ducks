class AussieDuck extends Duck {

    public AussieDuck() {
        quackBehavior = new AussieQuack();
    }

    public void display() {
        System.out.println("Aussie duck displayed");
    }

}