package ru.omsu.imit.checker;

import ru.omsu.imit.Person;
import ru.omsu.imit.checker.BaseChecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassportNumberChecker extends BaseChecker {




    public boolean handle(Person p) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(p.getPassportNumber());
        if(!matcher.matches()) {
            return false;
        }
        if(next != null) {
            return next.handle(p);
        }
        return true;
    }
}
