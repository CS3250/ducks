public class MageDuck extends Duck{

    public MageDuck() {
        quackBehavior = new Quack();
    }

    
    public void display() {
        System.out.println("Mage duck with staff displayed");
    }
    
}