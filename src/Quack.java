// Implements the QuackBehaviour interface, representing ducks that quack normally
public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}