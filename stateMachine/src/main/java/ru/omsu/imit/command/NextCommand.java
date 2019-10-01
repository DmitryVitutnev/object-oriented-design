package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

public class NextCommand implements ICommand{
    @Override
    public void accept(AudioPlayer player) {
        player.clickNext();
    }
}
