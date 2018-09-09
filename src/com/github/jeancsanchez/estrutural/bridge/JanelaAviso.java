package com.github.jeancsanchez.estrutural.bridge;

public class JanelaAviso extends JanelaAbstrata {

    public JanelaAviso(JanelaImplementada janelaImplementada) {
        super(janelaImplementada);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de aviso");
        desenharBotao("Ok");
    }
}
