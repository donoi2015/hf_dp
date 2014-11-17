package designpatterns.ind9Combined1p501.factory;

import designpatterns.ind9Combined1p501.QuackCounter;
import designpatterns.ind9Combined1p501.Quackable;
import designpatterns.ind9Combined1p501.ducks.DecoyDuck;
import designpatterns.ind9Combined1p501.ducks.DuckCall;
import designpatterns.ind9Combined1p501.ducks.Goose;
import designpatterns.ind9Combined1p501.ducks.GooseADuck;
import designpatterns.ind9Combined1p501.ducks.RedHeadDuck;
import designpatterns.ind9Combined1p501.ducks.RubberDuck;

public class CountingFactory extends AbstractFactory {

    @Override
    public Quackable createDecoyDuck() {
	return new QuackCounter(new DecoyDuck());
    }

    @Override
    public Quackable createDuckCall() {
	return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRedHeadDuck() {
	return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
	return new QuackCounter(new RubberDuck());
    }
    
    public Quackable createAdaptedDuck(){
	return new QuackCounter(new GooseADuck(new Goose()));
    }

}
