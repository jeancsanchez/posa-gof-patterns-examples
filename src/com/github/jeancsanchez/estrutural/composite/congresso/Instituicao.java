package com.github.jeancsanchez.estrutural.composite.congresso;

public class Instituicao extends Participante {

    @Override
    public void setNome(String nome) {
        super.setNome("Instituição " + nome);
    }
}
