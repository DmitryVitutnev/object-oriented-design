package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

public class LoadCommand implements ICommand{

    @Override
    public void accept(AudioPlayer player) {
        player.loadBackup();
    }
}
