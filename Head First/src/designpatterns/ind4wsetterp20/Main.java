package designpatterns.ind4wsetterp20;

import designpatterns.ind4wsetterp20.behaviours.fly.FlyRocketPowered;
import designpatterns.ind4wsetterp20.ducks.Duck;
import designpatterns.ind4wsetterp20.ducks.MallardDuck;
import designpatterns.ind4wsetterp20.ducks.ModelDuck;
import designpatterns.ind4wsetterp20.ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
	Duck m = new MallardDuck();
	m.display();
	m.performFly();
	m.performQuack();
	System.out.println("--------------");
	Duck m2 = new RubberDuck();
	m2.display();
	m2.performFly();
	m2.performQuack();
	System.out.println("--------------");
	Duck model = new ModelDuck();
	model.display();
	model.performFly();
	model.performQuack();
	model.setFlyBehaviour(new FlyRocketPowered());
	model.performFly();
    }
}