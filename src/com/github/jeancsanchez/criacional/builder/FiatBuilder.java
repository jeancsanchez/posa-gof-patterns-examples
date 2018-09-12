package com.github.jeancsanchez.criacional.builder;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class FiatBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 25000.0;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "Fire flex 1.0";
    }

    @Override
    public void buildAnoFabricacao() {
        carro.anoFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Fiat";
    }
}
