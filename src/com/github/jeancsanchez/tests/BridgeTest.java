package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.comportamental.strategy.Guerra;

/**
 * Estrutural de  objeto
 */
public class BridgeTest {

    public BridgeTest() {
        System.out.println("::::: Bridge testes :::::");
    }

    public void guerraTest() {
        System.out.println("-- Guerra --");
        Guerra guerra = new Guerra();
    }
}
