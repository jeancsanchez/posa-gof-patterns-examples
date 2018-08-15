package com.github.jeancsanchez.estrutural.facade.videogame;

public class SistemaAudio {

    public void configurarFrequencia() {
        System.out.println("Frequência configurada");
    }

    public void configurarVolume() {
        System.out.println("Volume configurado");
    }

    public void configurarCanais() {
        System.out.println("Canais configurados");
    }

    public void reproduzirAudio(String arquivo) {
        System.out.println("Reproduzindo" + arquivo);
    }
}
