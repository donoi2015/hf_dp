package designpatterns.ind9Combined1p501.observe;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements Subject {

    ArrayList<Observer> observers = new ArrayList<>();
    Subject duck;
    
    public Observable(Subject duck){
	this.duck = duck;
    }
    @Override
    public void registerObserver(Observer aObserver) {
	observers.add(aObserver);
    }
    @Override
    public void notifyObservers() {
	Iterator<Observer> iterator = observers.iterator();
	while (iterator.hasNext()) {
	    Observer ob = (Observer) iterator.next();
	    ob.update(duck);
	}
    }


}
