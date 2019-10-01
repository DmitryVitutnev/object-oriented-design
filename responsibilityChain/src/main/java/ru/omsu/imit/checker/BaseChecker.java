package ru.omsu.imit.checker;

public abstract class BaseChecker implements IChecker {

    protected IChecker next;

    public void setNext(IChecker next) {
        this.next = next;
    }


}
