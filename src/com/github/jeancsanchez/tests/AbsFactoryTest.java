package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.criacional.absfactory.CarroPopular;
import com.github.jeancsanchez.criacional.absfactory.CarroSedan;
import com.github.jeancsanchez.criacional.absfactory.FabricaDeCarro;
import com.github.jeancsanchez.criacional.absfactory.FabricaFiat;

/**
 * Criacional de objetos.
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
}
