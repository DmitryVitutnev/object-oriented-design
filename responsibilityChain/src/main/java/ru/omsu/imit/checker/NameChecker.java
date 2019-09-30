package ru.omsu.imit.checker;

import ru.omsu.imit.Person;
import ru.omsu.imit.checker.BaseChecker;

public class NameChecker extends BaseChecker {
    public boolean handle(Person p) {
        if(p.getFirstName() == null || p.getLastName() == null || p.getFirstName().equals("") || p.getLastName().equals("")) {
            return false;
        }
        if(next != null) {
            return next.handle(p);
        }
        return true;
    }
}
