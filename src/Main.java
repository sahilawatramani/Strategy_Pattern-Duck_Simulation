// Name: Sahil Awatramani
// PRN: 23070126112
// Batch: B2

// Main class to test different types of ducks and their behaviors
public class Main {
    public static void main(String[] args){
        // Creating different duck objects
        MallardDuck md = new MallardDuck();
        RubberDuck rb = new RubberDuck();
        RedHeadDuck rh = new RedHeadDuck();
        DecoyDuck dd = new DecoyDuck();

        System.out.println("-----------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-----------");

        System.out.println("-----------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("-----------");

        System.out.println("-----------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("-----------");

        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("-----------");
    }
}
