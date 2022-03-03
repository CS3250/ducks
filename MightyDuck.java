class MightyDuck extends Duck{

    public MightyDuck(){
        quackBehavior = new MightyQuack();
    }

    public void display(){
        System.out.println("I am a Mighty Duck! I don't swim, I skate.");
    }

}