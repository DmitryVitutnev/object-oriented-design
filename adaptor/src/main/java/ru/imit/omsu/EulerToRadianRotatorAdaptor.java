package ru.imit.omsu;

public class EulerToRadianRotatorAdaptor implements IRotator {

    private RadianRotator rotator;

    public EulerToRadianRotatorAdaptor() {
        rotator = new RadianRotator();
    }

    public Vector2D rotate(Vector2D vector, double eulerAngle) {
        return rotator.rotate(vector, eulerAngle / 180 * Math.PI);
    }
}
