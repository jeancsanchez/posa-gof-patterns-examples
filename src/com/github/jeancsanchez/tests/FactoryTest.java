package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.criacional.factory.carro.CarroFactory;
import com.github.jeancsanchez.criacional.factory.carro.FiatFactory;
import com.github.jeancsanchez.criacional.factory.carro.VolkswagemFactory;
import com.github.jeancsanchez.criacional.factory.carro.model.Carro;

/**
 * Criacional de classes.
 * Define uma interface para criar um objeto, mas deixa que subclasses decidam que classe instanciar.
 * Permite que uma classe delegue a responsabilidade de instanciação às subclasses.
 */
public class FactoryTest {

    public FactoryTest() {
        System.out.println("::::: Factory testes :::::");
    }

    public void carroTest() {
        System.out.println("-- Fábrica de carros --");

        CarroFactory factory = new FiatFactory();
        Carro carro = factory.criarCarro();
        carro.exibirInfo();

        factory = new VolkswagemFactory();
        carro = factory.criarCarro();
        carro.exibirInfo();
    }
}
