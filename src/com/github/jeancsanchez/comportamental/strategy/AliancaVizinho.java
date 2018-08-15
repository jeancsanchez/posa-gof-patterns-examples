package com.github.jeancsanchez.comportamental.strategy;


/**
 * Comportamental de objeto
 */
public class AliancaVizinho implements Estrategia {

    public AliancaVizinho() {
        System.out.println("Estratégia Aliança com vizinho ativada!");
    }

    @Override
    public void atacar() {
        System.out.println("1 - Fazendo alianca  com vizinho do norte");
        System.out.println("2 - Atacar pelo sul");
    }

    @Override
    public void concluir() {
        System.out.println("Conclusão: Dividindo benefícios...");
    }
}
