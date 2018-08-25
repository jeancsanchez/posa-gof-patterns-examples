package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaSegQuaSex;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaTerQuiSab;

public interface Pizzaria {

    PizzaSegQuaSex fazerPizzaDeSegQuaSex() throws Exception;

    PizzaTerQuiSab fazerPizzaDeTerQuiSab() throws Exception;
}
