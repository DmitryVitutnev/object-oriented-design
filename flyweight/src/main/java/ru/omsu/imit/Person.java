package ru.omsu.imit;

public class Person {

    private Texture texture;
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        texture = Texture.getTexture();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return texture.toString();
    }

}
