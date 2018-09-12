package com.github.jeancsanchez.criacional.builder;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class ConcessionariaDirector {

    protected CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }


    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
}
