package ru.omsu.imit.checker;

import ru.omsu.imit.Person;
import ru.omsu.imit.checker.BaseChecker;

public class NotNullChecker extends BaseChecker {
    public boolean handle(Person p) {
        if(p == null) {
            return false;
        }
        if(next != null) {
            return next.handle(p);
        }
        return true;
    }
}
