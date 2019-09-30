package ru.omsu.imit;

import ru.omsu.imit.command.ICommand;

public abstract class State {

    protected AudioPlayer player;

    /*protected ICommand lockCommand;
    protected ICommand playCommand;
    protected ICommand nextCommand;
    protected ICommand previousCommand;*/


    public State(AudioPlayer player) {
        this.player = player;
    }

    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();

    public abstract void clickPrevious();


}
