package designs.strategy_pattern;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
