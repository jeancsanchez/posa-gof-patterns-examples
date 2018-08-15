package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.comportamental.state.PlayerManager;
import com.github.jeancsanchez.comportamental.state.model.Audio;

/**
 * Comportamental de  objeto
 */
public class StateTest {

    public StateTest() {
        System.out.println("::::: State testes :::::");
    }

    public void playerTest() {
        System.out.println("-- Player --");

        PlayerManager playerManager = new PlayerManager();
        Audio audio = new Audio();
        audio.setTitle("audio 1");

        playerManager.play(audio);
        playerManager.next();

        Audio audio2 = new Audio();
        audio2.setTitle("audio 2");
        playerManager.play(audio2);

        playerManager.previous();
        playerManager.play(audio);
        playerManager.pause();
    }
}
