package com.github.jeancsanchez.comportamental.state.states;

import com.github.jeancsanchez.comportamental.state.model.Audio;

public class Preparing extends PlayState {

    public Preparing() {
        System.out.println("Preparando audio...");
    }

    @Override
    public PlayState play(Audio audio) {
        setAudio(audio);
        System.out.println("\uD83D\uDD6A " + getAudio().getTitle() + " \uD83D\uDD0A ");
        return new Playing();
    }

    @Override
    public PlayState pause() {
        throw new IllegalStateException("Ainda preparando áudio...");
    }

    @Override
    public PlayState next() {
        throw new IllegalStateException("Ainda preparando áudio...");
    }

    @Override
    public PlayState previous() {
        throw new IllegalStateException("Ainda preparando áudio...");
    }
}
