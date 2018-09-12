package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.comportamental.banco.*;

/**
 * Comportamental de objeto.
 * Compor objetos em cascata e passar a requisição pela corrente até que um objeto a sirva.
 */
public class ChainTest {

    public ChainTest() {
        System.out.println("::::: Chain testes :::::");
    }

    public void bancoTest() {
        Log.log("-- Bancos --");

        BancoChain bancos = new BancoA();
        bancos.setNext(new BancoB());
        bancos.setNext(new BancoC());
        bancos.setNext(new BancoD());

        try {
            bancos.efetuarPagamento(IDBancos.BANCO_C);
            bancos.efetuarPagamento(IDBancos.BANCO_D);
            bancos.efetuarPagamento(IDBancos.BANCO_A);
            bancos.efetuarPagamento(IDBancos.BANCO_B);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
