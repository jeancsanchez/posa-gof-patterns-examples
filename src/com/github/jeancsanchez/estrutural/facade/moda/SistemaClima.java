package com.github.jeancsanchez.estrutural.facade.moda;

public class SistemaClima {

    public static Clima classificarClima(double celsius) {
        if (celsius <= 10) {
            System.out.println("Está frio");
            return Clima.FRIO;
        }

        if (celsius > 10 && celsius <= 25) {
            System.out.println("Está ameno");
            return Clima.AMENO;
        }

        System.out.println("Está quente");
        return Clima.QUENTE;
    }
}
