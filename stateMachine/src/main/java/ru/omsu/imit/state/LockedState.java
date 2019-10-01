package ru.omsu.imit.state;

import ru.omsu.imit.AudioPlayer;

public class LockedState extends State{


    public LockedState(AudioPlayer player) {
        super(player);
    }

    public void clickLock() {
        if(player.isPlaying()) {
            player.changeState(new PlayingState(player));
        }
        else {
            player.changeState(new ReadyState(player));
        }
    }

    public void clickPlay() {
        //Nothing
    }

    public void clickNext() {
        //Nothing
    }

    public void clickPrevious() {
        //Nothing
    }
}
