package com.github.jeancsanchez.comportamental.state;

import com.github.jeancsanchez.comportamental.state.model.Audio;
import com.github.jeancsanchez.comportamental.state.states.Paused;
import com.github.jeancsanchez.comportamental.state.states.PlayState;

public class PlayerManager {

    private PlayState playState;

    public PlayerManager() {
        playState = new Paused();
    }

    public void play(Audio audio) {
        System.out.println("play()");
        playState = playState.play(audio);
    }

    public void pause() {
        System.out.println("pause()");
        playState = playState.pause();
    }

    public void next() {
        System.out.println("next()");
        playState = playState.next();
    }


    public void previous() {
        System.out.println("previous()");
        playState = playState.previous();
    }
}
