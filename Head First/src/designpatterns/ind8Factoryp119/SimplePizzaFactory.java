package designpatterns.ind8Factoryp119;

import designpatterns.ind8Factoryp119.pizzas.CheesePizza;
import designpatterns.ind8Factoryp119.pizzas.ClamPizza;
import designpatterns.ind8Factoryp119.pizzas.PepperoniPizza;
import designpatterns.ind8Factoryp119.pizzas.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
	Pizza pizza = null;

	if (type.equals("cheese")) {
	    pizza = new CheesePizza();
	} else if (type.equals("pepperoni")) {
	    pizza = new PepperoniPizza();
	} else if (type.equals("clam")) {
	    pizza = new ClamPizza();
	} else if (type.equals("veggie")) {
	    pizza = new VeggiePizza();
	}
	return pizza;
    }
}
