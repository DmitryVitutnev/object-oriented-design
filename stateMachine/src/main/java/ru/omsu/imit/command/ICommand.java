package ru.omsu.imit.command;

import ru.omsu.imit.AudioPlayer;

import java.util.function.Consumer;


public interface ICommand extends Consumer<AudioPlayer> {

    void accept(AudioPlayer player);

}
