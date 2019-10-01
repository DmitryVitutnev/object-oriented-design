package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

public class LockCommand implements ICommand {

    @Override
    public void accept(AudioPlayer player) {
        player.clickLock();
    }
}
