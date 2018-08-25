package com.github.jeancsanchez.criacional.absfactory.pizzaria.pizza;

public class PizzaPresunto implements PizzaTerQuiSab {

    @Override
    public void exibirIngredientes() {
        System.out.println("Pizza de presunto - Queijo, presunto e tomate");
    }
}
