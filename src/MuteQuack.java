// Implements the QuackBehaviour interface, representing ducks that do not quack
public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I don't quack");
    }
}