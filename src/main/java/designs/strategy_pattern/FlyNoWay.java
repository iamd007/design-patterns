package designs.strategy_pattern;

public class FlyNoWay implements FlyBehavious{
    @Override
    public void fly() {
        System.out.println("I cant fly.");
    }
}
