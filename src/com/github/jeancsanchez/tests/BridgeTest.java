package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.estrutural.bridge.*;

/**
 * Estrutural de  objeto.
 * Desacopla uma abstracao de sua implementacao.
 */
public class BridgeTest {

    public BridgeTest() {
        System.out.println("::::: Bridge testes :::::");
    }

    public void janelasTest() {
        System.out.println("-- Janelas --");
        JanelaAbstrata janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();
    }
}
