package ru.omsu.imit;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Button {

    private Supplier<Void> onClickAction;

    public Button(Supplier<Void> onClickAction) {
        this.onClickAction = onClickAction;
    }

    public void click() {
        onClickAction.get();
    }


}
