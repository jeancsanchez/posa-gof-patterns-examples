package com.github.jeancsanchez.estrutural.facade.moda;

public class SistemaModa {

    public static void pegarRoupa(Clima clima) {
        if (clima == Clima.FRIO) {
            System.out.println("Vestir casaco!");
            return;
        }

        if (clima == Clima.AMENO) {
            System.out.println("Vestir roupas confortáveis");
            return;
        }

        System.out.println("Vestir regata");
    }
}
