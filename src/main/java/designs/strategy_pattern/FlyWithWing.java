package designs.strategy_pattern;

public class FlyWithWing implements FlyBehavious{

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
