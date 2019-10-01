package ru.omsu.imit.state;

import ru.omsu.imit.AudioPlayer;

public class PlayingState extends State {

    public PlayingState(AudioPlayer player) {
        super(player);
    }

    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    public void clickNext() {
        player.fastForward(5);
    }

    public void clickPrevious() {
        player.rewind(5);
    }
}
