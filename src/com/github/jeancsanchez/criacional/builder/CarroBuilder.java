package com.github.jeancsanchez.criacional.builder;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public abstract class CarroBuilder {

    protected CarroProduct carro;

    public CarroBuilder() {
        carro = new CarroProduct();
    }

    public abstract void buildPreco();

    public abstract void buildDscMotor();

    public abstract void buildAnoFabricacao();

    public abstract void buildModelo();

    public abstract void buildMontadora();

    public CarroProduct getCarro() {
        return carro;
    }
}
