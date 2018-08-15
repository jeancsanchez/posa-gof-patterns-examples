package com.github.jeancsanchez.comportamental.strategy;


/**
 * Comportamental de objeto
 */
public class AtacarSozinho implements Estrategia {

    public AtacarSozinho() {
        System.out.println("Estratégia Atacar sozinho ativada!");
    }

    @Override
    public void atacar() {
        System.out.println("1 - Plantar evidências falsas");
        System.out.println("2 - Soltar bombas");
        System.out.println("3 - Derrubar governo");
    }

    @Override
    public void concluir() {
        System.out.println("Conclusão: Estabelecendo governo amigo...");
    }
}
