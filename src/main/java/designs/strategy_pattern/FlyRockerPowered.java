package designs.strategy_pattern;

public class FlyRockerPowered implements FlyBehavious{
    @Override
    public void fly() {
        System.out.println("I am flying with rocket");
    }
}
