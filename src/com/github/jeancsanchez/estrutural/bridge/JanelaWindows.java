package com.github.jeancsanchez.estrutural.bridge;

public class JanelaWindows implements JanelaImplementada {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + "- Janela Winows");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + "- Botão Winows");
    }
}
