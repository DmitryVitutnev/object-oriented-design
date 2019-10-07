package ru.omsu.imit;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        for(int i = 0; i < 100; i++) {
            if(Math.random() < 0.5) {
                list.add(new Person("Person" + i, 20 + i / 3));
            }
            else {
                list.add(null);
            }

        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(list.get(10 * i + j) == null) {
                    System.out.print("        ");
                }
                else {
                    System.out.print(list.get(10 * i + j));
                }

            }
            System.out.println();
        }


    }



}
