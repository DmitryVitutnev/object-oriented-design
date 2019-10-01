package ru.imit.omsu;

public class RadianRotator implements IRotator {


    public Vector2D rotate(Vector2D vector, double radianAngle) {
        return new Vector2D(Math.cos(radianAngle) * vector.getX() - Math.sin(radianAngle) * vector.getY(),
                Math.sin(radianAngle) * vector.getX() + Math.cos(radianAngle) * vector.getY());
    }
}
