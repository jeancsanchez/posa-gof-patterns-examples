package com.github.jeancsanchez.comportamental.templatemethod.player;

import java.util.ArrayList;

public abstract class OrdenadorTemplate {


    public abstract boolean isPrimeiro(AudioMp3 audio1, AudioMp3 audio2);


    public ArrayList<AudioMp3> ordenarMusicas(ArrayList<AudioMp3> audios) {
        ArrayList<AudioMp3> novaLista = new ArrayList<>(audios);

        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = 0; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                    AudioMp3 temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }

        return novaLista;
    }
}
