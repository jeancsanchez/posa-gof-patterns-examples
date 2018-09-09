package com.github.jeancsanchez.estrutural.bridge;

public abstract class JanelaAbstrata {

    protected JanelaImplementada janelaImplementada;

    public JanelaAbstrata(JanelaImplementada janelaImplementada) {
        this.janelaImplementada = janelaImplementada;
    }

    public void desenharJanela(String titulo) {
        janelaImplementada.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo) {
        janelaImplementada.desenharBotao(titulo);
    }

    public abstract void desenhar();
}
