package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.estrutural.decorator.carro.Carro;
import com.github.jeancsanchez.estrutural.decorator.carro.CarroComArCondicionado;
import com.github.jeancsanchez.estrutural.decorator.carro.CrossFox;

/**
 * Estrutural de  objeto
 * Anexa responsabilidades adicionais a um objeto dinamicamente.
 */
public class DecoratorTest {

    public DecoratorTest() {
        System.out.println("::::: Decorator testes :::::");
    }

    public void playerTest() {
        System.out.println("-- Carro --");

        Carro carro = new CrossFox();
        System.out.println("Produto: " + carro.getProdutos());
        System.out.println("Preço: R$ " + carro.getCusto());

        // Adicionando Ar condicionado
        carro = new CarroComArCondicionado(carro);
        System.out.println("Produto: " + carro.getProdutos());
        System.out.println("Preço: R$ " + carro.getCusto());
    }
}
