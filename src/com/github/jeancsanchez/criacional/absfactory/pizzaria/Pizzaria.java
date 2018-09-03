package com.github.jeancsanchez.criacional.absfactory.pizzaria;

import com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza.Pizza;

public abstract class Pizzaria {

    abstract boolean diaDeTrabalho();

    abstract Pizza mandarPizza();

    public Pizza fazerPizza() throws Exception {
        if (diaDeTrabalho()) {
            Pizza pizza = mandarPizza();
            pizza.exibirIngredientes();
            return mandarPizza();
        }

        throw new Exception("Esse pizzaiolo não faz pizzas nesse dia");
    }
}
