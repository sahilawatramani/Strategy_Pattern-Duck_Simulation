// Implements the QuackBehaviour interface, representing ducks that squeak
public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
