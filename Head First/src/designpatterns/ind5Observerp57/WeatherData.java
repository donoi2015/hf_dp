package designpatterns.ind5Observerp57;

import java.util.ArrayList;

import designpatterns.ind5Observerp57.interfaces.Observer;
import designpatterns.ind5Observerp57.interfaces.Subject;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
	observers = new ArrayList<>();
    }
    
    public void setMeasurements(float aTemperature, float aHumidity,
	    float aPressure) {
	temperature = aTemperature;
	humidity = aHumidity;
	pressure = aPressure;
	notifyObservers();
    }
    
    //subject implementations
    @Override
    public void registerObserver(Observer aO) {
	observers.add(aO);
    }

    @Override
    public void removeObserver(Observer aO) {
	int i = observers.indexOf(aO);
	if (i >= 0) {
	    observers.remove(i);
	}
    }

    @Override
    public void notifyObservers() {
	for (int i = 0; i < observers.size(); i++) {
	    Observer observer = (Observer) observers.get(i);
	    observer.update(temperature, humidity, pressure);
	}
    }

}
