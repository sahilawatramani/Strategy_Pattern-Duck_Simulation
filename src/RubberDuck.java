// Represents a Rubber Duck with specific behaviors
public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyBehaviour = new CantFly();
    }
    @Override
    void display() {
        System.out.println("I'm a Rubber Duck");
    }
}