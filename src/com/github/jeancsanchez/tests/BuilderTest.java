package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.criacional.builder.CarroProduct;
import com.github.jeancsanchez.criacional.builder.ConcessionariaDirector;
import com.github.jeancsanchez.criacional.builder.FiatBuilder;

/**
 * Criacional de objeto.
 * Separa a construção da implementação de um objeto complexo, de modo que o mesmo processo de construção possa criar
 * várias representações diferentes.
 */
public class BuilderTest {

    public BuilderTest() {
        System.out.println("::::: Builder testes :::::");
    }

    public void carrosTest() {
        Log.log("-- Carros --");

        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());

        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        Log.log("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
    }
}
