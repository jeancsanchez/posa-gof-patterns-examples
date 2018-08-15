package com.github.jeancsanchez.criacional.factory.carro;

import com.github.jeancsanchez.criacional.factory.carro.model.Carro;
import com.github.jeancsanchez.criacional.factory.carro.model.Palio;

public class FiatFactory implements CarroFactory {

    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}
