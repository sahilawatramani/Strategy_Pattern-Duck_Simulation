// Implements the FlyBehaviour interface, representing ducks that can fly
public class CanFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}