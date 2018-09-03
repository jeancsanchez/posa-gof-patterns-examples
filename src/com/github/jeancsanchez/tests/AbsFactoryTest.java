package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.criacional.absfactory.carro.CarroPopular;
import com.github.jeancsanchez.criacional.absfactory.carro.CarroSedan;
import com.github.jeancsanchez.criacional.absfactory.carro.FabricaDeCarro;
import com.github.jeancsanchez.criacional.absfactory.carro.FabricaFiat;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.PizzaioloSegQuaSex;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.PizzaioloTerQuiSab;
import com.github.jeancsanchez.criacional.absfactory.pizzaria.Pizzaria;

/**
 * Criacional de objetos.
 * Define uma interface para criar famílias de objetos sem especificar suas classes concretas.
 */
public class AbsFactoryTest {

    public AbsFactoryTest() {
        System.out.println("::::: Abs Factory testes :::::");
    }

    public void carroTest() {
        System.out.println("-- Fábrica de carros --");

        FabricaDeCarro factory = new FabricaFiat();
        CarroSedan sedan = factory.criarCarroSedan();
        sedan.exibirInfoSedan();
        CarroPopular popular = factory.criarCarroPopular();
        popular.exibirInfoPopular();
    }


    public void pizzariaTest() {
        System.out.println("-- Pizzaria --");

        Pizzaria pizzaria = new PizzaioloSegQuaSex("03/09/2018");
        try {
            pizzaria.fazerPizza();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        pizzaria = new PizzaioloTerQuiSab("03/09/2018");
        try {
            pizzaria.fazerPizza();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
