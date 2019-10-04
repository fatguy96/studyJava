package design.model.first;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

public class MiniDuckSimulator {
    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
