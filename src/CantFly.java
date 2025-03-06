// Implements the FlyBehaviour interface, representing ducks that cannot fly
public class CantFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
