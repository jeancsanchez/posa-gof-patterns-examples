package com.github.jeancsanchez.comportamental.state.states;

import com.github.jeancsanchez.comportamental.state.model.Audio;

public class Playing extends PlayState {

    @Override
    public PlayState play(Audio audio) {
        setAudio(audio);
        System.out.println("\uD83D\uDD6A " + getAudio().getTitle() + " \uD83D\uDD0A ");
        return this;
    }

    @Override
    public PlayState pause() {
        System.out.println("◼ Pausando audio");
        return new Paused();
    }

    @Override
    public PlayState next() {
        return new Preparing();
    }

    @Override
    public PlayState previous() {
        return new Preparing();
    }
}
