package designs.strategy_pattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quacks");
    }
}
