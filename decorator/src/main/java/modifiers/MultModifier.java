package modifiers;

public class MultModifier extends BaseModifier {

    private double koef;

    public MultModifier(double koef) {
        this.koef = koef;
    }

    public MultModifier(IModifier previousModifier, double koef) {
        super(previousModifier);
        this.koef = koef;
    }

    public double applyModifier(double value) {
        if(previousModifier == null) {
            return value * koef;
        }
        return previousModifier.applyModifier(value) * koef;
    }
}
