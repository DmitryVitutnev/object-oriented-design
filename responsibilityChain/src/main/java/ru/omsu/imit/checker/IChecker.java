package ru.omsu.imit.checker;

import ru.omsu.imit.Person;

public interface IChecker {

    void setNext(IChecker next);

    boolean handle(Person p);

}
