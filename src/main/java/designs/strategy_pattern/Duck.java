package designs.strategy_pattern;

public abstract class Duck {
    FlyBehavious flyBehavious;
    QuackBehaviour quackBehaviour;
    abstract public void display();

    public void performQuack(){
        this.quackBehaviour.quack();
    }

    public void performFly(){
        this.flyBehavious.fly();
    }

    public void swim(){
        System.out.println("All ducks swim even decoy");
    }

    public void setFlyBehavious(FlyBehavious flyBehavious) {
        this.flyBehavious = flyBehavious;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
