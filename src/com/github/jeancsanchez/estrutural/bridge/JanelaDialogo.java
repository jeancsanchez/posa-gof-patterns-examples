package com.github.jeancsanchez.estrutural.bridge;

public class JanelaDialogo extends JanelaAbstrata {

    public JanelaDialogo(JanelaImplementada janelaImplementada) {
        super(janelaImplementada);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de diálogo");
        desenharBotao("Botão sim");
        desenharBotao("Botão não");
        desenharBotao("Botão cancelar");
    }
}
