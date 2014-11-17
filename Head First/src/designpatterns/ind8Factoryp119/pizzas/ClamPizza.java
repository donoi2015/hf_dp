package designpatterns.ind8Factoryp119.pizzas;

import designpatterns.ind8Factoryp119.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
	name = "Clam Pizza";
	dough = "Thin crust";
	sauce = "White garlic sauce";
	toppings.add("Clams");
	toppings.add("Grated parmesan cheese");
    }
}
