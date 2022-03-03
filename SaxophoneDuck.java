
public class SaxophoneDuck extends Duck{
	public SaxophoneDuck() {
		quackBehavior = new Saxophone();
	}
	public void display() {
		System.out.println("Jazzy duck displayed");
	}

}
