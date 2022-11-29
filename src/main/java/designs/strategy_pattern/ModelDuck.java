package designs.strategy_pattern;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavious = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am model duck");
    }
}
