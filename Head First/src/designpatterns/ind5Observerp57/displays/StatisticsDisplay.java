package designpatterns.ind5Observerp57.displays;

import designpatterns.ind5Observerp57.interfaces.DisplayElement;
import designpatterns.ind5Observerp57.interfaces.Observer;
import designpatterns.ind5Observerp57.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
	tempSum += temp;
	numReadings++;

	if (temp > maxTemp) {
	    maxTemp = temp;
	}

	if (temp < minTemp) {
	    minTemp = temp;
	}

	display();
    }

    public void display() {
	System.out.println("Avg/Max/Min temperature = "
		+ (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
