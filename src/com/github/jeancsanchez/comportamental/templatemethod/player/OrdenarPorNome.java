package com.github.jeancsanchez.comportamental.templatemethod.player;

public class OrdenarPorNome extends OrdenadorTemplate {

    public OrdenarPorNome() {
        System.out.println("Ordenando por nome...");
    }

    @Override
    public boolean isPrimeiro(AudioMp3 audio1, AudioMp3 audio2) {
        return audio1.getNome().compareToIgnoreCase(audio2.getNome()) >= 0;
    }
}
