package com.github.jeancsanchez.comportamental.templatemethod.player;

import java.util.ArrayList;

public class Playlist {

    protected ArrayList<AudioMp3> playlist;
    protected OrdenadorTemplate ordenador;

    public Playlist(ModoReproducao modoReproducao) {
        playlist = new ArrayList<>();

        switch (modoReproducao) {
            case POR_NOME: {
                ordenador = new OrdenarPorNome();
                break;
            }
            default:
                ordenador = new OrdenarPorEstrela();
                break;
        }
    }


    public void setModoReproducao(ModoReproducao reproducao) {
        ordenador = null;

        switch (reproducao) {
            case POR_NOME: {
                ordenador = new OrdenarPorNome();
                break;
            }
            default:
                ordenador = new OrdenarPorEstrela();
                break;
        }
    }

    public void adicionarAudio(AudioMp3 audioMp3) {
        playlist.add(audioMp3);
    }

    public void mostraPlaylist() {
        ArrayList<AudioMp3> novaLista = new ArrayList<>(ordenador.ordenarMusicas(playlist));

        for (AudioMp3 audioMp3 : novaLista) {
            System.out.println("Musica - " + audioMp3.getNome() + "\nEstrelas: " + String.valueOf(audioMp3.getEstrela()));
        }
    }
}
