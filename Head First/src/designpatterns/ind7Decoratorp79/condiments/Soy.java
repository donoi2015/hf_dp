package designpatterns.ind7Decoratorp79.condiments;

import designpatterns.ind7Decoratorp79.Beverage;
import designpatterns.ind7Decoratorp79.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
