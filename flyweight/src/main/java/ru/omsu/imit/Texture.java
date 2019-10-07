package ru.omsu.imit;

public class Texture {

    private String str;

    private Texture(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    private static Texture singleton;
    public static Texture getTexture() {
        if(singleton == null) {
            singleton = new Texture("┌( ಠ_ಠ)┘");
        }
        return singleton;
    }

}
