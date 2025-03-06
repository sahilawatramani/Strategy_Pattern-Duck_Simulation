// Represents a Red Head Duck with specific behaviors
public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new CanFly();
    }
    @Override
    void display() {
        System.out.println("I'm a Red Head Duck");
    }
}