package com.github.jeancsanchez.comportamental.strategy;


/**
 * Comportamental de objeto
 */
public class Diplomacia implements Estrategia {

    public Diplomacia() {
        System.out.println("Estratégia Diplomacia ativada!");
    }

    @Override
    public void atacar() {
        System.out.println("1 - Recuar tropas");
        System.out.println("2 - Propor cooperação econômica");
    }

    @Override
    public void concluir() {
        System.out.println("Conclusão: Desarmando inimigo...");
    }
}
