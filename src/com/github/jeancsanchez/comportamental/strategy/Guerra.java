package com.github.jeancsanchez.comportamental.strategy;

public class Guerra {

    private Estrategia estrategia;


    public void definirEstrategia(int soldados, boolean isNuclear) {

        if (soldados > 1000) {
            estrategia = new AliancaVizinho();
            return;
        }

        if (isNuclear) {
            estrategia = new Diplomacia();
            return;
        }

        estrategia = new AtacarSozinho();
    }


    public void declararGuerra() {
        System.out.println("Iniciando guerra!");
        estrategia.atacar();
    }

    public void encerrarGuerra() {
        System.out.println("Finalizando guerra!");
        estrategia.concluir();
    }
}
