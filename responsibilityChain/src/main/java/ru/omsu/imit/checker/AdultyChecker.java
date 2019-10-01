package ru.omsu.imit.checker;

import ru.omsu.imit.Person;

public class AdultyChecker extends BaseChecker {


    public boolean handle(Person p) {
        if(p.getAge() < 18) {
            return false;
        }
        if(next != null) {
            return next.handle(p);
        }
        return true;
    }
}
