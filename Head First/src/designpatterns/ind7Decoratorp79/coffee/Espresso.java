package designpatterns.ind7Decoratorp79.coffee;

import designpatterns.ind7Decoratorp79.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
	description = "Espresso";
    }

    public double cost() {
	return 1.99;
    }
}
