// Abstract class representing a general Duck with different behaviors
abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    // Setters to change behaviors dynamically
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    // Abstract method to display duck details
    abstract void display();

    // Methods to perform behaviors
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
}
