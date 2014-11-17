package designpatterns.ind7Decoratorp79.coffee;

import designpatterns.ind7Decoratorp79.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
	description = "Dark Roast Coffee";
    }

    public double cost() {
	return .99;
    }
}
