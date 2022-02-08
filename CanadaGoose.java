/**
 * Canada Goose class for Canada Goose behavior.
 *
 * @author Skylar Gurnett
 * @version 0.2
 * @since 2022-02-08
 */
public class CanadaGoose extends Duck
{
    public CanadaGoose()
    {
        quackBehavior = newHonk();
    }

    public void display()
    {
        system.out.println("Canada Goose appears.");
    }
}
