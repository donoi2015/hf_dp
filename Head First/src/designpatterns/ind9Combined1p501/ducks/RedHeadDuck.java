package designpatterns.ind9Combined1p501.ducks;

import designpatterns.ind9Combined1p501.Quackable;
import designpatterns.ind9Combined1p501.observe.Observable;
import designpatterns.ind9Combined1p501.observe.Observer;

public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck(){
	observable = new Observable(this);
    }
    @Override
    public void Quack() {
	System.out.println("RH Quack!");
	notifyObservers();
    }

    @Override
    public void registerObserver(Observer aObserver) {
	observable.registerObserver(aObserver);
    }

    @Override
    public void notifyObservers() {
	observable.notifyObservers();
    }
    @Override
    public String toString() {
	return "RedHead Duck";
    }
    
}
