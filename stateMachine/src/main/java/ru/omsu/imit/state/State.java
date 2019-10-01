package ru.omsu.imit.state;

import ru.omsu.imit.AudioPlayer;

public abstract class State {

    protected AudioPlayer player;


    public State(AudioPlayer player) {
        this.player = player;
    }

    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();

    public abstract void clickPrevious();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
