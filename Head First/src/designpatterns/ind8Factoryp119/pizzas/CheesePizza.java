package designpatterns.ind8Factoryp119.pizzas;

import designpatterns.ind8Factoryp119.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
	name = "Cheese Pizza";
	dough = "Regular Crust";
	sauce = "Marinara Pizza Sauce";
	toppings.add("Fresh Mozzarella");
	toppings.add("Parmesan");
    }
}
