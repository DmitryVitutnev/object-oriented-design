package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

public interface ICommand {

    void execute(AudioPlayer player);

}
