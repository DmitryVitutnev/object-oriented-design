package modifiers;

public abstract class BaseModifier implements IModifier {
    protected IModifier previousModifier;

    public BaseModifier() {
    }

    public BaseModifier(IModifier previousModifier) {
        this.previousModifier = previousModifier;
    }

    public abstract double applyModifier(double value);
}
