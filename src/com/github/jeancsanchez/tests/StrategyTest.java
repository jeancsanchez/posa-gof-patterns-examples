package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.comportamental.strategy.Guerra;

/**
 * Comportamental de  objeto
 */
public class StrategyTest {

    public StrategyTest() {
        System.out.println("::::: Strategy testes :::::");
    }

    public void guerraTest() {
        System.out.println("-- Guerra --");
        Guerra guerra = new Guerra();

        guerra.definirEstrategia(1001, false);
        guerra.declararGuerra();
        guerra.encerrarGuerra();

        guerra.definirEstrategia(50, true);
        guerra.declararGuerra();
        guerra.encerrarGuerra();

        guerra.definirEstrategia(50, false);
        guerra.declararGuerra();
        guerra.encerrarGuerra();
    }
}
