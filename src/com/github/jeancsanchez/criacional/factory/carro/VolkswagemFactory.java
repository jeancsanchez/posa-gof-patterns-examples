package com.github.jeancsanchez.criacional.factory.carro;

import com.github.jeancsanchez.criacional.factory.carro.model.Carro;
import com.github.jeancsanchez.criacional.factory.carro.model.Fusca;

public class VolkswagemFactory implements CarroFactory {

    @Override
    public Carro criarCarro() {
        return new Fusca();
    }
}
