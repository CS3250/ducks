class GamerDuck extends Duck {
    
    public GamerDuck(){
        quackBehavior = new Squeak();

    }
    public void display(){
        System.out.println("Gamer duck displayed.");
    }
}
