// Represents a Mallard Duck with specific behaviors
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new CanFly();
    }
    @Override
    void display() {
        System.out.println("I'm a Mallard Duck");
    }
}