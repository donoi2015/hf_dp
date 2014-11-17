package designpatterns.ind4wsetterp20.ducks;

import designpatterns.ind4wsetterp20.behaviours.fly.FlyWithWings;
import designpatterns.ind4wsetterp20.behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
	quackBehaviour = new Quack();
	flyBehaviour = new FlyWithWings();
    }
    public void display(){
	System.out.println("I'm a real Mallard Duck!");
    }
}
