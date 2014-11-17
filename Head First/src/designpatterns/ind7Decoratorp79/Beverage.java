package designpatterns.ind7Decoratorp79;

public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
	return description;
    }

    public abstract double cost();
}
