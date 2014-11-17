package designpatterns.ind7Decoratorp79.condiments;

import designpatterns.ind7Decoratorp79.Beverage;
import designpatterns.ind7Decoratorp79.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
	this.beverage = beverage;
    }

    public String getDescription() {
	return beverage.getDescription() + ", Whip";
    }

    public double cost() {
	return .10 + beverage.cost();
    }
}
