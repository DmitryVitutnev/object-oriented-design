package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

public class PreviousCommand implements ICommand {


    @Override
    public void accept(AudioPlayer player) {
        player.clickPrevious();
    }
}
