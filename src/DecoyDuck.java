// Represents a Decoy Duck with specific behaviors
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Floating();
        flyBehaviour = new CantFly();
    }
    @Override
    void display() {
        System.out.println("I'm a Decoy Duck");
    }
}