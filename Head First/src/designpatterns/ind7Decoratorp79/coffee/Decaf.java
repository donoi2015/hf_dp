package designpatterns.ind7Decoratorp79.coffee;

import designpatterns.ind7Decoratorp79.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
	description = "Decaf Coffee";
    }

    public double cost() {
	return 1.05;
    }
}
