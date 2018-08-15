package com.github.jeancsanchez.comportamental.templatemethod.player;

public class OrdenarPorEstrela extends OrdenadorTemplate {

    public OrdenarPorEstrela() {
        System.out.println("Ordenando por estrela...");
    }

    @Override
    public boolean isPrimeiro(AudioMp3 audio1, AudioMp3 audio2) {
        return audio1.getEstrela() > audio2.getEstrela();
    }
}
