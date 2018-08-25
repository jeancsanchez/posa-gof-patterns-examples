package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaCalabresa;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaSegQuaSex;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.PizzaTerQuiSab;

import java.util.Calendar;
import java.util.Date;

public class PizzaioloSegQuaSex implements Pizzaria {
    private Calendar data = Calendar.getInstance();

    public PizzaioloSegQuaSex(Date data) {
        this.data.setTime(data);
    }

    @Override
    public PizzaSegQuaSex fazerPizzaDeSegQuaSex() {
        return new PizzaCalabresa();
    }

    @Override
    public PizzaTerQuiSab fazerPizzaDeTerQuiSab() throws Exception {
        throw new Exception("Esse pizzaiolo não faz pizzas nesse dia");
    }
}
