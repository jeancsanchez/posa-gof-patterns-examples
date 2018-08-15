package com.github.jeancsanchez.comportamental.state.states;

import com.github.jeancsanchez.comportamental.state.model.Audio;

public class Paused extends PlayState {

    @Override
    public PlayState play(Audio audio) {
        setAudio(audio);
        System.out.println("\uD83D\uDD6A " + getAudio().getTitle() + " \uD83D\uDD0A ");

        Playing playing = new Playing();
        playing.setAudio(audio);
        return playing;
    }

    @Override
    public PlayState pause() {
        System.out.println("◼ Pausando audio: " + getAudio().getTitle());
        return this;
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
