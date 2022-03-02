public class AstronautDuck extends Duck{
    
    public AstronautDuck(){
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Astronaut duck diplayed");
    }
}
