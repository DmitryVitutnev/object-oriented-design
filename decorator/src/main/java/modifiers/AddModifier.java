package modifiers;

public class AddModifier extends BaseModifier{

    private double koef;

    public AddModifier(double koef) {
        this.koef = koef;
    }

    public AddModifier(IModifier previousModifier, double koef) {
        super(previousModifier);
        this.koef = koef;
    }

    public double applyModifier(double value) {
        if(previousModifier == null) {
            return value + koef;
        }
        return previousModifier.applyModifier(value) + koef;
    }
}
