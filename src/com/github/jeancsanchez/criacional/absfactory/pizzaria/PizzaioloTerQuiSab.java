package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaPresunto;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaSegQuaSex;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaTerQuiSab;

public class PizzaioloTerQuiSab implements Pizzaria {

    @Override
    public PizzaSegQuaSex fazerPizzaDeSegQuaSex() throws Exception {
        throw new Exception("Esse pizzaiolo não faz pizzas nesse dia");
    }

    @Override
    public PizzaTerQuiSab fazerPizzaDeTerQuiSab() {
        return new PizzaPresunto();
    }
}
