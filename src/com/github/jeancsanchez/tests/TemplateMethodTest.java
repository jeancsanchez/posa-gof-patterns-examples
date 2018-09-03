package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.comportamental.templatemethod.player.AudioMp3;
import com.github.jeancsanchez.comportamental.templatemethod.player.ModoReproducao;
import com.github.jeancsanchez.comportamental.templatemethod.player.Playlist;
import com.github.jeancsanchez.comportamental.templatemethod.string.*;

/**
 * Comportamental de classe.
 * Define um esqueleto de um algoritmo, deixando métodos para serem preenchidos pelas subclasses.
 */
public class TemplateMethodTest {

    public TemplateMethodTest() {
        System.out.println("::::: Template method testes :::::");
    }

    public void playerTest() {
        System.out.println("-- Player --");

        Playlist playlist = new Playlist(ModoReproducao.POR_NOME);
        playlist.adicionarAudio(new AudioMp3("B", 1));
        playlist.adicionarAudio(new AudioMp3("A", 4));
        playlist.adicionarAudio(new AudioMp3("C", 5));
        playlist.mostraPlaylist();

        playlist.setModoReproducao(ModoReproducao.POR_ESTRELA);
        playlist.mostraPlaylist();
    }


    public void stringTest() {
        System.out.println("-- String --");

        String helloWorld = "Hello world";

        StringTemplate stringTemplate = new StringLowerCase();
        stringTemplate.exibir(helloWorld);

        stringTemplate = new StringUpperCase();
        stringTemplate.exibir(helloWorld);

        stringTemplate = new StringDouble();
        stringTemplate.exibir(helloWorld);

        stringTemplate = new StringInverted();
        stringTemplate.exibir(helloWorld);
    }
}
