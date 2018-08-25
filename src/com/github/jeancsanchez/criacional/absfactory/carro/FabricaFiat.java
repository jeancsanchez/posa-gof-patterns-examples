package com.github.jeancsanchez.criacional.absfactory.carro;

public class FabricaFiat implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
}
