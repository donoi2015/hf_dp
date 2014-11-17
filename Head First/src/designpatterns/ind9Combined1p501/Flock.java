package designpatterns.ind9Combined1p501;

import java.util.ArrayList;
import java.util.Iterator;

import designpatterns.ind9Combined1p501.observe.Observable;
import designpatterns.ind9Combined1p501.observe.Observer;

public class Flock implements Quackable { //not sure why this implements Quackable
    Observable observable;
    ArrayList<Quackable> flock = new ArrayList<>();
    public Flock(){
	observable = new Observable(this);
    }
    void add(Quackable q){
	flock.add(q);
    }
    public void Quack(){
	Iterator<Quackable> i = flock.iterator(); // iterator type is quackable
	while(i.hasNext()){
	    Quackable duck = (Quackable) i.next(); //forgot next, and i IS the Quackable object.
	    duck.Quack();
	}
    }
    @Override
    public void registerObserver(Observer aObserver) {
	Iterator<Quackable> iterator = flock.iterator();
	while (iterator.hasNext()) {
	    Quackable duck = (Quackable) iterator.next();
	    duck.registerObserver(aObserver);
	}
    }
    @Override
    public void notifyObservers() {
    }
}