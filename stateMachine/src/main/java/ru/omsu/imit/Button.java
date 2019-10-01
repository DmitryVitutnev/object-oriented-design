package ru.omsu.imit;

import ru.omsu.imit.command.IProcedure;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Button {

    private IProcedure onClickAction;

    public Button(IProcedure onClickAction) {
        this.onClickAction = onClickAction;
    }

    public void click() {
        onClickAction.execute();
    }


}
