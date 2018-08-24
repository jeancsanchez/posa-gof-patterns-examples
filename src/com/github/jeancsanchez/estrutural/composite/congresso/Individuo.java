package com.github.jeancsanchez.estrutural.composite.congresso;

public class Individuo extends Participante {

    @Override
    public void setNome(String nome) {
        super.setNome("Indivíduo " + nome);
    }
}
