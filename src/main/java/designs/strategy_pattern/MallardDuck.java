package designs.strategy_pattern;

public class MallardDuck extends Duck{
    MallardDuck(){
        quackBehaviour = new Quack();
        flyBehavious = new FlyWithWing();
    }
    @Override
    public void display() {
        System.out.println("I am real mallord duck");
    }
}
