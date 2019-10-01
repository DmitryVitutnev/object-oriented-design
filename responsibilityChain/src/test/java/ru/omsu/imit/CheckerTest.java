package ru.omsu.imit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.omsu.imit.checker.*;

public class CheckerTest {

    private IChecker checker;

    @Before
    public void init() {
        checker = new NotNullChecker();
        IChecker checker1 = new NameChecker();
        IChecker checker2 = new AdultyChecker();
        IChecker checker3 = new PassportNumberChecker();

        checker.setNext(checker1);
        checker1.setNext(checker2);
        checker2.setNext(checker3);

    }


    @Test
    public void checker_fullRightData_pass() {
        Person person = new Person("Dmitry", "Vitutnev", 20, "1234567890");
        Assert.assertTrue(checker.handle(person));
    }

    @Test
    public void checker_null_pass() {
        Person person = null;
        Assert.assertFalse(checker.handle(person));
    }

    @Test
    public void checker_EmptyName_pass() {
        Person person = new Person("", "Vitutnev", 20, "1234567890");
        Assert.assertFalse(checker.handle(person));
    }

    @Test
    public void checker_tooYoung_pass() {
        Person person = new Person("Dmitry", "Vitutnev", 14, "1234567890");
        Assert.assertFalse(checker.handle(person));
    }

    @Test
    public void checker_notCorrectPassport_pass() {
        Person person = new Person("Dmitry", "Vitutnev", 20, "HelloWorld");
        Assert.assertFalse(checker.handle(person));
    }


}
