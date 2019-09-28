package ru.imit.omsu;

public class Main {

    public static void main(String[] args) {

        Vector2D vector2D = new Vector2D(1, 0);

        EulerToRadianRotatorAdaptor rotator = new EulerToRadianRotatorAdaptor();

        System.out.println(rotator.rotate(vector2D, 30));



    }


}
