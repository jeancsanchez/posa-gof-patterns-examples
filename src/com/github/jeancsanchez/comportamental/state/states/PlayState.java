package com.github.jeancsanchez.comportamental.state.states;

import com.github.jeancsanchez.comportamental.state.model.Audio;

public abstract class PlayState {

    private Audio audio;

    public abstract PlayState play(Audio audio);

    public abstract PlayState pause();

    public abstract PlayState next();

    public abstract PlayState previous();

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }
}
